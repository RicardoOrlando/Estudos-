package testes;

import java.util.LinkedList;
import java.util.Queue;

public class fila {

	public static void main(String[] args) {
		//primeiramente instanciar a Queue OBS:importar a queue
		Queue<String> filaBanco = new LinkedList<>();
		
		
		filaBanco.add("Patricia");
		filaBanco.add("Roberto");
		filaBanco.add("Flavio");
		filaBanco.add("Pamela");
		filaBanco.add("Anderson");
		 
		System.out.println(filaBanco);
		
		//criando variavel que vai retornar o proximo elemento da fila e o excluindo automaticamente
		//poll() chama o primeiro elemento da fila o retirando da fila
		String clienteASerAtendido = filaBanco.poll();
		
		//apresentando o primeiro elemento da fila
		System.out.println(clienteASerAtendido);
		
		System.out.println(filaBanco);
		
		// criando variavel que vai retornar o primeiro cliente da fila
		// peek() retorna o primeiro elemento da fila sem excluir 
		String primeiroCliente = filaBanco.peek();
		
		System.out.println(primeiroCliente);
		
		
		System.out.println(filaBanco);
		
		boolean primeiroElementoOuErro = filaBanco.isEmpty();
		
		System.out.println(primeiroElementoOuErro);
		
		filaBanco.clear();
		
		primeiroElementoOuErro = filaBanco.isEmpty();
		
		System.out.println(primeiroElementoOuErro);
		
		
		
		
		

	}

}
