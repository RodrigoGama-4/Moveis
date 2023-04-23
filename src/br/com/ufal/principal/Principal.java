package br.com.ufal.principal;


import br.com.ufal.FabricaMoveis;

public class Principal {
	public static void main(String[] args) {
		System.out.println(FabricaMoveis.fazerSofa("Yuri", 2).toString());
		System.out.println( FabricaMoveis.fazerSofa("Roger", 3).toString());
		System.out.println(FabricaMoveis.getNumSofas());
		
		//Cadeira c1 = new Cadeira("Sla", true);
		//System.out.println(c1.toString());
		/*1 QUESTÃO: Não. Porque os construturoes dos moveis são do tipo pacote, ou seja, a visibilidade dele seria possivel apenas se estivesse no mesmo pacote  */
		/*2 QUESTÃO: Porque temos o Construtor como privado. E também temos, principalmente, temos atributos e métodos como static  */
	}	
}
