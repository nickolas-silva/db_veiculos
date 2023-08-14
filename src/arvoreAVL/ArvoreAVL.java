package arvoreAVL;

import entity.Veiculo;

public class ArvoreAVL {
	
	No raiz;
	public ArvoreAVL() {
		this.setRaiz(null);
	}
	
	public No getRaiz() {
		return raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}
	
	public void ordem() {
		this.ordem(getRaiz());
	}
	
	private void ordem(No a){
		
		if(a != null) {
			this.ordem(a.getEsq());
			System.out.println(a.getChave() + ": " + a.getValor());
			this.ordem(a.getDir());
		}

	}
	
	// pegar altura de um nó avl
	
	private Integer altura(No a) {
		
		if(a == null)
			return -1;
		
		return a.getAlturaNo();

	}
	
	private Integer maior(Integer a, Integer b) {
		
		return (a > b) ? a : b;

	}
	
	private Integer obterFB(No a) {
		
		if(a == null)
			return 0;

		return this.altura(a.getEsq()) - this.altura(a.getDir());
	}
	
	public void inserir(Veiculo v) {
		this.raiz = this.inserir(getRaiz(), v);
	}
	
	private No inserir(No a, Veiculo v) {
		
		if(a == null)
			return new No(v);

		if(v.renavam < a.chave)
			a.esq = this.inserir(a.esq, v);
		
		else if(v.renavam > a.chave)
			a.dir = this.inserir(a.dir, v);
		
		else
			return a;
		
		/*2. Atualiza altura do ancestral do nó inserido */
		
		a.alturaNo = 1 + 
				this.maior(this.altura(a.getEsq()), this.altura(a.getDir()));
		
		/*3. Obter FB */
		
		int fb = this.obterFB(a);
		int fbEsq = this.obterFB(a.getEsq());
		int fbDir = this.obterFB(a.getDir());
		
		
		if(fb > 1 && fbEsq >= 0)
			
			return this.rds(a);
		
		if(fb > 1 && fbEsq < 0) {
			
			 a.esq = this.res(a.esq);
			 return rds(a);
		}	 
			
		if(fb < -1 && fbDir <= 0)
			
			return this.res(a);
		
		if(fb < -1 && fbDir > 0) {
			
			a.dir = this.rds(a.dir);
			return res(a);
		}	
		return a;
	}
	
	private No res(No x) {
		
		No y = x.getDir();
		No z = y.getEsq();
		
		// executa rotação
		
		y.setEsq(x);
		x.setDir(z);
		
		x.alturaNo = 1 + this.maior(altura(x.getEsq()), altura(x.getDir()));
		y.alturaNo = 1 + this.maior(altura(y.getEsq()), altura(y.getDir()));

		return y;
	}
	
	private No rds(No y) {
		
		No x = y.getEsq();
		No z = x.getDir();
		
		// executa rotação
		
		x.setDir(y);
		y.setEsq(z);;
		
		y.alturaNo = 1 + this.maior(altura(y.getEsq()), altura(y.getDir()));
		x.alturaNo = 1 + this.maior(altura(x.getEsq()), altura(x.getDir()));
		
		return x;
	}


	No menorChave(No arv){
		No temp = arv;
		if(temp == null){
			return null;
		}
		while(temp.esq != null){
			temp = temp.esq;
			
		}
		return temp;
	}

	public void remover(long ch){
		raiz = remover(raiz, ch);
	}
	No remover(No arv, long ch){
		if(arv == null)
			return arv;
		
		if(ch < arv.chave)
			arv.esq = remover(arv.esq, ch);
		
		else if(ch > arv.chave)
			arv.dir = remover(arv.dir, ch);
		
		else {
			if (arv.esq == null && arv.dir == null){
				arv = null;
			}
			else if(arv.esq == null){
				No temp = arv;
				arv = temp.dir;
				temp = null;
			}
			else if(arv.dir == null){
				No temp = arv;
				arv = temp.esq;
				temp = null;
			}
			else{
				No temp = menorChave(arv.dir);
				arv.chave = temp.chave;
				arv.dir = remover(arv.dir, temp.chave);
			}

		}

		if(arv == null){
			return arv;
		}

		arv.alturaNo = 1 + maior(altura(arv.esq), altura(arv.dir));
		int fb = obterFB(arv);
		int fbEsq = obterFB(arv.esq);
		int fbDir = obterFB(arv.dir);

		if(fb > 1 && fbEsq >= 0){
			return rds(arv);
		}
		if(fb > 1 && fbEsq < 0){
			arv.esq = res(arv.esq);
			return rds(arv);
		}
		if(fb < -1 && fbDir <= 0){
			return res(arv);
		}

		if(fb < -1 && fbDir > 0){
			arv.dir = rds(arv.dir);
			return res(arv);
		}
		return arv;

	}

	public int contNos(){
		return contNos(raiz);
	}

	public int contNos(No arv){
		if(arv == null){
			return 0;
		}
		else{
			return 1 + contNos(arv.esq) + contNos(arv.dir);
		}
	}

	public No buscar(long renavam){
		return buscar(raiz, renavam);
	}

	public No buscar(No arv, long k){
		if(arv == null) return null;

		if(arv.chave > k) return buscar(arv.esq, k);

		if(arv.chave < k) return buscar(arv.dir, k);

		return arv;
	}

	 
	
}