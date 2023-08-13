package arvoreAVL;

import entity.Veiculo;

public class No {

	String chave;
	Veiculo valor;
	Integer alturaNo;
	No esq, dir;
	
	public No(String k, Veiculo v) {
		
		this.setChave(k);
		this.setValor(v);
		this.setAlturaNo(0);
		this.setEsq(null);
		this.setDir(null);
		
	}
	
	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public Veiculo getValor() {
		return valor;
	}

	public void setValor(Veiculo valor) {
		this.valor = valor;
	}

	public Integer getAlturaNo() {
		return alturaNo;
	}

	public void setAlturaNo(Integer alturaNo) {
		this.alturaNo = alturaNo;
	}

	public No getEsq() {
		return esq;
	}

	public void setEsq(No esq) {
		this.esq = esq;
	}

	public No getDir() {
		return dir;
	}

	public void setDir(No dir) {
		this.dir = dir;
	}

}