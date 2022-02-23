package estruturadedados_array.teste;

import java.util.ArrayList;

public class aula12 {

	public static void main(String[] args) {
		
		
		ArrayList<String> arrayList = new ArrayList<String> ();
		
		//metódo de adicionar
		arrayList.add("A");
		arrayList.add("C");
	
		System.out.println(arrayList);
		arrayList.add(1, "B");
		System.out.println(arrayList);
		
		
		//método de busca
		boolean existe = arrayList.contains("A");
		if(existe) {
			System.out.println("Elemento existe no array");
		}  else {
			System.out.println("Elemento não existe no array");
		}

		//Retorna o index do objeto
		int pos = arrayList.lastIndexOf("A");
		if(pos > -1) {
			System.out.println("Elemento existe no array" + pos);
		}  else {
			System.out.println("Elemento não existe no array" + pos);
		}
		
		System.out.println(arrayList.get(2));
		
		//Remover objeto
		arrayList.remove(2);
		arrayList.remove("B");
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
		
		
	}

}
