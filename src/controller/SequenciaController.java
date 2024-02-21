package controller;

public class SequenciaController {
	
	public SequenciaController() {}
	
	public int somarNvalores(int n) {
		// Podemos somar o tamanho da sequência atual com o valor da soma dos 
		// elementos de uma sequência 1 unidade menor, em um loop, até que o
		// tamanho da sequência seja menor ou igual a 0, ou seja, não exista 
		// mais uma sequência. (Entradas negativas naturalmente retornam 0
		// assim como requisitado
		
		if(n <= 0) return 0;
		else return n + somarNvalores(--n);
	}

}
