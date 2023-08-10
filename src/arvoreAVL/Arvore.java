package arvoreAVL;

public class Arvore<T>  {
  No<T> raiz;

  public Arvore() {
		this.setRaiz(null);
	}

  public No<T> getRaiz() {
    return raiz;
  }

  public void setRaiz(No<T> raiz) {
    this.raiz = raiz;
  }

  public void ordem() {
    this.ordem(getRaiz());
  }

  private void ordem(No<T> a) {

    if (a != null) {
      this.ordem(a.getEsq());
      System.out.println(a.getChave() + ": " + a.getValor());
      this.ordem(a.getDir());
    }

  }

  private Integer altura(No<T> a) {

    if (a == null)
      return -1;

    return a.alturaNo;

  }

  private Integer maior(Integer a, Integer b) {

    return (a > b) ? a : b;

  }

  private Integer obterFB(No<T> a) {

    if (a == null)
      return 0;
    return this.altura(a.getEsq()) - this.altura(a.getDir());
  }

  public void inserir(Integer k, T v) {
    this.raiz = this.inserir(getRaiz(), k, v);
  }

  private No<T> inserir(No<T> a, Integer k, T v) {

    if (a == null)
      return new No<T>(k, v);

    if (a.compareTo(k) > 0)
      a.esq = this.inserir(a.getEsq(), k, v);

    else if (a.compareTo(k) < 0)
      a.dir = this.inserir(a.getDir(), k, v);

    else
      return a;

    /* 2. Atualiza altura do ancestral do nó inserido */

    a.alturaNo = 1 +
        this.maior(this.altura(a.getEsq()), this.altura(a.getDir()));

    /* 3. Obter FB */

    int fb = this.obterFB(a);
    int fbEsq = this.obterFB(a.getEsq());
    int fbDir = this.obterFB(a.getDir());

    if (fb > 1 && fbEsq >= 0)

      return this.rds(a);

    if (fb > 1 && fbEsq < 0) {

      a.esq = this.res(a.esq);
      return rds(a);
    }

    if (fb < -1 && fbDir <= 0)

      return this.res(a);

    if (fb < -1 && fbDir > 0) {

      a.dir = this.rds(a.dir);
      return res(a);
    }

    return a;
  }

  private No<T> res(No<T> x) {

    No<T> y = x.getDir();
    No<T> z = y.getEsq();

    // executa rotação

    y.setEsq(x);
    x.setDir(z);

    x.alturaNo = 1 + this.maior(altura(x.getEsq()), altura(x.getDir()));
    y.alturaNo = 1 + this.maior(altura(y.getEsq()), altura(y.getDir()));

    return y;
  }

  private No<T> rds(No<T> y) {

    No<T> x = y.getEsq();
    No<T> z = x.getDir();

    // executa rotação

    x.setDir(y);
    y.setEsq(z);
    ;

    y.alturaNo = 1 + this.maior(altura(y.getEsq()), altura(y.getDir()));
    x.alturaNo = 1 + this.maior(altura(x.getEsq()), altura(x.getDir()));

    return x;
  }

  

  /*
   * Implementar a remoção de acordo com o código da prática 4
   */

  //  void remover(Integer ch, No esq){
  //   raiz = remover(raiz, ch, esq);
  //  }

  //  No remover(No arv, Integer ch, T v){
  //   if(arv == null){
  //     return arv;
  //   }
  //   if(ch < arv.chave){
  //     arv.esq = remover(ch, arv.esq);
  //   } else if(ch > arv.chave){
  //     arv.dir = remover(arv.dir, ch);
  //   }
  //  }
  
}
