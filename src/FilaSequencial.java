
public class FilaSequencial {
	
	String[] contatos = new String[100];
	int tamanho = -1;
	
	public boolean estaVazia() {
		return (tamanho == -1);
	}
	
	public boolean estaCheia() {
		return (tamanho == contatos.length - 1);
	}
	
	public void inserir(String contato) {
		if (estaCheia()) {
			System.out.println("A fila j� est� cheia!");
			return;
		} 
		tamanho++;
		contatos[tamanho] = contato;
		System.out.println(" -- Elemento " + contato + " inserido com sucesso! -- ");
	}
	
	public void remover() {
		if (estaVazia()) {
			System.out.println("A fila j� est� vazia, n�o h� o que remover!");
			return;
		}
		
		String valor = contatos[0];
		contatos[0] = null;
		
		for(int i = 0; i < tamanho; i++) {
			contatos[i] = contatos[i + 1];
		}
		
		contatos[tamanho] = null;
		tamanho--;
		System.out.println(" -- Elemento removido: " + valor + " -- ");
		
	}
	
	public void exibir() {
		if (estaVazia()) {
			System.out.println(" -- A fila est� vazia - ");
			return;
		}
		System.out.println("\n -- In�cio da fila -- ");
		for (int i = 0; i <= tamanho; i++) {
			System.out.println((i + 1) + "� posi��o: " + contatos[i]);
		}
		System.out.println(" -- Fim da fila -- \n");
	}
	
	public void esvaziar() {
		contatos = new String[100];
		tamanho = -1;
	}

}
