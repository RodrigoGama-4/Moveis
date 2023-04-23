package br.com.ufal;

public class FabricaMoveis {
	private static int numCadeiras;
	private static int numMesas;
	private static int numEstantes;
	private static int numSofas;
	
	private FabricaMoveis() {
		
	}
	
	public static Cadeira fazerCadeira(String nome, boolean temBraco) {
		numCadeiras ++;
		return new Cadeira(nome, temBraco);
		
	}
	
	public static Mesa fazerMesa(String nome, int tamanho) {
		numMesas ++;
		return new Mesa(nome, tamanho);
	}
	
	public static Estante fazerEstante(String nome, int numPrateleira) {
		numEstantes++;
		return new Estante(nome, numPrateleira);
	}
	
	public static Sofa fazerSofa(String nome, int numLugares) {
		numSofas ++;
		return new Sofa(nome, numLugares);
	}

	public static int getNumCadeiras() {
		return numCadeiras;
	}

	public static int getNumMesas() {
		return numMesas;
	}

	public static int getNumEstantes() {
		return numEstantes;
	}

	public static int getNumSofas() {
		return numSofas;
	}
	
	
	
}
