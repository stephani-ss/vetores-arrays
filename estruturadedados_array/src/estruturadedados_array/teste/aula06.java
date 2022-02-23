package estruturadedados_array.teste;

import estruturadedados_array.Vetor;

public class aula06 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
			
		System.out.println(vetor.busca("elemento 1"));
		System.out.println(vetor.busca("elemento 4"));
		


	}

}
