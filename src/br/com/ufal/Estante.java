package br.com.ufal;

public class Estante extends Movel{
	private int numPrateleiras;
	
	Estante(String nome, int numPrateleiras){
		super(nome);
		this.numPrateleiras = numPrateleiras;
	}

	@Override
	public String toString() {
		return "Estante [numPrateleiras=" + numPrateleiras + ", nome=" + super.getNome() + "]";
	}

	public int getNumPrateleiras() {
		return numPrateleiras;
	}
	
	
}
