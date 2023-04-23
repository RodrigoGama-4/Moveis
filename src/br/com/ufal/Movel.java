package br.com.ufal;

public abstract class Movel {
	private String nome;
	
	Movel(String nome){
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Movel [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}
	
	
}	
