package view;

import controller.SequenciaController;

public class Main {
	public static void main(String[] args) {
		var sequencia = new SequenciaController();
		int n = 3;
		
		System.out.println(sequencia.somarNvalores(n));
		
	}

}
