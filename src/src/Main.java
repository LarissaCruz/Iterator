package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
	 public static void main(String[] args) {
	        
	        List<Livros> livros = new ArrayList<>();
	        livros.add(new LivroRomatico("Livro 1 Romantico"));
	        livros.add(new LivroRomatico("Livro 2 Romantico"));
	        livros.add(new LivroRomatico("Livro 3 Romantico"));
	        livros.add(new LivroCriminal("Livro 4 Criminal"));
	        livros.add(new LivroCriminal("Livro 5 Criminal"));

	       
	        Biblioteca biblioteca = new Biblioteca(livros);

	        
	        Iterator iterador = biblioteca.criarIterador();

	        
	        while (iterador.hasNext()) {
	            Livros livro = iterador.next();
	            
	            livro.getTitulo();
	        }
	    }
}
