package br.com.ufal;

public class Mesa extends Movel {
	private int tamanho;
	
	Mesa(String nome, int tamanho){
		super(nome);
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Mesa [tamanho=" + tamanho + super.getNome() + "]";
	}

	public int getTamanho() {
		return tamanho;
	}
	
	
}
