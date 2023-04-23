package br.com.ufal;

public class Cadeira extends Movel {
	private boolean temBanco;
	
	Cadeira(String nome, boolean temBanco){
		super(nome);
		this.temBanco = temBanco;
	}

	@Override
	public String toString() {
		return "Cadeira [temBanco=" + temBanco + ", nome=" + super.getNome()+ "]";
	}

	public boolean isTemBanco() {
		return temBanco;
	}

}
