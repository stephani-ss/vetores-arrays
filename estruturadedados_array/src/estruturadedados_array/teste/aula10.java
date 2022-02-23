package estruturadedados_array.teste;

import estruturadedados_array.VetorObjetos;

public class aula10 {

	public static void main(String[] args) {
		
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato", "123", "contato@gmail.com");
		Contato c2 = new Contato("Contato2", "1243", "contato2@gmail.com");
		Contato c3 = new Contato("Contato2", "1243", "contato2@gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		
		System.out.println("Tamanho= " + vetor.tamanho());
		
		int pos = vetor.busca(c3);
		if(pos > -1) {
			System.out.println("existe no vetor");
		}else {
			System.out.println("não existe");
		}
		System.out.println(vetor);
		
	}

}
