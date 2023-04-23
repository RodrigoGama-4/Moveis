package br.com.ufal;

public class Sofa extends Movel{
	private int numLugares;
	
	Sofa(String nome, int numLugares){
		super(nome);
		this.numLugares = numLugares;
	}

	@Override
	public String toString() {
		return "Sofa [numLugares=" + numLugares + super.getNome() + "]";
	}

	public int getNumLugares() {
		return numLugares;
	}
	
	
}
