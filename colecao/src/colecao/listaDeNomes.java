package colecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listaDeNomes {

	public static void main(String[] args) {
		//inicializando  umaaarayList OBS:precisa importar o "List" e o "ArrayList"
		List<String> nomes = new ArrayList<>();
		
		//adicionsndo nomes a lista
		nomes.add("Pablo");
		nomes.add("Franco");
		nomes.add("Anderson");
		nomes.add("Brenda");
		nomes.add("Eloisa");
		
		System.out.println(nomes);
		
		//ordenando a lista em ordem alfabetica OBS: Importar o Collections no java util
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		nomes.add("Ricardo");
		nomes.add("Bruna");
		nomes.add("Helena");
		
		System.out.println(nomes);
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		//Modificar o elemento dentro do array pela posição
		nomes.set(2, "Uderson");
		
		System.out.println(nomes);
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		
		//remover um elemento da lista por posição
		nomes.remove(5);
		
		System.out.println(nomes);
		
		//removendo elemento do array pelo nome
		nomes.remove("Franco");
				
		System.out.println(nomes);
		
		//retornar um booleano para saber se tem ou não na lista
		boolean temAnderson = nomes.contains("Anderson");
		
		System.out.println(temAnderson);
		
		//acha o indice do obj procurado dentro do array
		int posicao = nomes.indexOf("Helena");
		
		System.out.println(posicao);
		
		//retorna o tamanho da lista
		int tamanho = nomes.size();
		System.out.println(tamanho);
		
		//verificar a lista
		boolean listaEstaVazia = nomes.isEmpty();
		
		System.out.println(listaEstaVazia);
		
		List<String> novoNome = new ArrayList<>();
		
		novoNome.add("Guilherme");
		novoNome.add("Henrrique");
		novoNome.add("Maria");
		novoNome.add("João");
		
		System.out.println("--->"+ novoNome);
		
		nomes.addAll(novoNome);
		
		System.out.println(nomes);
		
		
		
	}	

}
