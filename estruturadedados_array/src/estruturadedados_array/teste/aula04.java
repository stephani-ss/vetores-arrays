package estruturadedados_array.teste;

import estruturadedados_array.Vetor;

public class aula04 {

	public static void main(String[] args) {
			
			Vetor vetor = new Vetor(10);
			
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
				
			System.out.println(vetor.tamanho());
			System.out.println(vetor);


		}
		
}
