package ED;

public class Fila {
	private int dados[];
	private int inicio;
	private int fim;
	private int botoes;
	private int nElementos;
	private int tamMax;
	
        
	public Fila() {
		inicio = 0;
		fim = -1;
		nElementos = 0;
		tamMax = 100;
		dados =  new int[tamMax];
	}
	
	public Fila(int n) {
		inicio = 0;
		fim = -1;
		nElementos = 0;
		
		tamMax = n;
		dados =  new int[tamMax];
	}

	/** Verifica se a Fila estÃ¡ vazia */
	public boolean vazia () {
		if (nElementos == 0)
			return true;
		else
			return false;
	}

	/**Verifica se a Fila estÃ¡ cheia */
	public boolean cheia () {
		if (nElementos == botoes && !vazia())
			return true;
		else
			return false;
	}

	/** ObtÃ©m o tamanho da Fila */
	public int tamanho() {
		return nElementos;
	}

	/** Consulta o elemento do inÃ­cio da fila.
	    Retorna -1 se a fila estiver vazia. */
	public int primeiro() {
		if (vazia())
			return -1; // Erro: Fila vazia 
		
		return inicio;
	}
        public int ultimo() {
		if (vazia())
			return -1; // Erro: Fila vazia 
		
		return fim;
	}
        
        public int valor(int pos){
            return dados[pos];
        }
        
        
        
	/**Insere um elemento no fim de uma fila
    Retorna false se a fila estiver cheia, true caso contrÃ¡rio. */
	public boolean insere(int valor) {
		if (cheia()){
			return false;
		}
	
		fim = (fim + 1) % tamMax; // Circularidade 
	    dados[fim] = valor;
		nElementos++;
		return true;
	}

	/**Remove o elemento do inÃ­cio da fila e retorna o valor removido.
	    Retorna -1 se a fila estiver vazia.*/
	public int remove() {
		if (vazia())
			return -1;
	
		int res = primeiro();
		inicio = (inicio + 1) % tamMax; //Circularidade 
		nElementos--;
		return res;
	}

    /**
     * @return the botoes
     */
    public int getBotoes() {
        return botoes;
    }

    /**
     * @param botoes the botoes to set
     */
    public void setBotoes(int botoes) {
        this.botoes = botoes;
    }

   
        
        
}
