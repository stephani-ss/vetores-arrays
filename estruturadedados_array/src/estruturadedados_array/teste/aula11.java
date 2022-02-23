package estruturadedados_array.teste;

import estruturadedados_array.Lista;
import estruturadedados_array.VetorObjetos;

public class aula11 {

	public static void main(String[] args) {
		
		
		Lista<Contato> vetor = new Lista<Contato>(2);
		
		Contato c1 = new Contato("Contato", "123", "contato@gmail.com");
		vetor.adiciona(c1);
		System.out.println(vetor);
		
	}


}
