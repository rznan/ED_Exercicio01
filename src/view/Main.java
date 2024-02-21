package view;

import controller.SequenciaController;


//1. Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros
//número NATURAIS (a função deve retornar zero para números negatívos)
//O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
//O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;


public class Main {
	public static void main(String[] args) {
		int n = 3;
		var sequencia = new SequenciaController();
		
		System.out.println(sequencia.somarNvalores(n));
	}
}
