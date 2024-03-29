package estruturadedados_array;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	//vai controlar o tamanho do vetor
	private int tamanho;
	
	public Vetor(int capacidade) {
		
		//construtor e quantos elementos v�o ser criado
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	//adicionar elemento no vetor, pode ser do tipo void pois n�o ir� retornar nada. Esse met�do recebe o elemento
	//que ser� adicionado
	//public void adiciona(String elemento) {
		//verifica quais espa�os nulos podem ser utilizados (false, null e 0)
		// a maneira abaixo n�o � a ideal e sim guardar o tamanho real do vetor 
		/*for(int i=0; i<this.elementos.length; i++) {
			if (this.elementos[i]==null) {
				this.elementos[i] = elemento;
				// freiar o loop do for quando achar um espa�o vazio, pois o for est� indo at� 
				// o final do vetor
				break;
				}
		}
		*/
	
	//met�do para adicionar elementos no vetor melhorado
		public boolean adiciona(String elemento){
			this.aumentaCapacidade();
			if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] =  elemento;
			this.tamanho++;
			return true;
			
		}
			return false;
		}
		
		
		/**Add elemento em qualquer posi��o **/
		public boolean adiciona(int posicao, String elemento) {
			if (!(posicao >=0 && posicao < tamanho)) {
				throw new IllegalArgumentException("posi��o invalida");
			}
			this.aumentaCapacidade();
			//mover todos os elementos
			for(int i=this.tamanho-1; i>=posicao; i--) {
				this.elementos[i+1] = this.elementos[i];
			}
			this.elementos[posicao]=elemento;
			this.tamanho++;
			return true;
		}
	
		private void aumentaCapacidade(){
			if(this.tamanho==this.elementos.length) {
				String[] elementosNovos = new String[elementos.length * 2];
				for (int i=0;  i<this.elementos.length; i++) {
					elementosNovos[i] = this.elementos[i];
					
				}
				
				this.elementos = elementosNovos;
			}
		}
		
		
		
	public int tamanho() {
		return this.tamanho;
	}
	
	
	public String busca(int posicao) {
		
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("posi��o inv�lida");
			
		}
		return this.elementos[posicao];}
	
	
	public void remove(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("posi��o inv�lida");
			
		}
		for(int i = posicao; i< this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
			
		}
		
		this.tamanho--;
	}
	
	
	
	/**verifica se um elemento existe no vetor / String
	 * � um objeto ent�o n�o se pode uar == e sim equals**/
	
	public int busca (String elemento){
		for(int i=0; i<this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
			return i;	
			}
		}
		return -1;
	}
	
	//met�do para retirar os espa�os nulos 
	public String toString() {
	//iterar os elementos e adicionar na superstring
	
	StringBuilder s = new StringBuilder();
	s.append("[");
	
	for (int i=0; i<this.tamanho-1; i++) {
		s.append(this.elementos[i]);
		s.append(",  ");
	}
	
	if(this.tamanho>0) {
		s.append(this.elementos[this.tamanho-1]);
	}
	s.append("]");
	return s.toString();
}
	
}
