/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ED;
public class Pilha {
	private int dados[]; // Vetor que contém os dados da lista 
	private int topo; 
	private int tamMax;
    
    public Pilha(){
    		tamMax = 100;
    		dados = new int[tamMax];
    		
    		topo = -1;
    	}
    
    public Pilha(int n){
    		tamMax = n;
    		dados = new int[tamMax];
    		
    		topo = -1;
    }

    /** Verifica se a Pilha está vazia */
    public boolean vazia(){
    		if (topo == -1)
    			return true;
    	   else 
    	      return false;
	}
	
    /**Verifica se a Pilha está cheia */
    public boolean cheia(){
        if (topo == (tamMax-1))
  		  return true;
      else
  		  return false;
	}
	
    /**Obtém o tamanho da Pilha*/
    public int tamanho(){
		return topo+1;
	}
    public int topo(){
        return topo;
    }
    /** Consulta o elemento do topo da Pilha.
		Retorna -1 se a pilha estiver vazia, 
		caso contrário retorna o valor que está no topo da pilha. */
 	public int top () {
      //if (vazia()) 
        // return -1; // pilha vazia
 	  
      return dados[topo];
 	}
     
	 /** Insere um elemento no topo da pilha.
	  Retorna false se a pilha estiver cheia. 
	  Caso contrário retorna true */
 	public boolean push (int valor) {
 		if (cheia()) 
 			return false;  // err: pilha cheia 
 		
 		topo++;
 		dados[topo] = valor; 
 		return true;
	 }   

	 /** Retira o elemento do topo da pilha.
	  Retorna -1 se a pilha estiver vazia. */
 	public int pop() {          
 		if (vazia()) 
 			return -1; // Pilha vazia
 		
 		int valor = dados[topo]; 
 		topo--; 
 		return valor;
 	}
}