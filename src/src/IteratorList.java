package src;
import java.util.List;

public class IteratorList implements Iterator {
	 private List<Livros> livros;
	 private int indice;
	 
	  public IteratorList(List<Livros> livros) {
	        this.livros = livros;
	        this.indice = 0;
	    }

	    @Override
	    public boolean hasNext() {
	        return indice < livros.size();
	    }

	    @Override
	    public Livros next() {
	        Livros livro = livros.get(indice);
	        indice++;
	        return livro;
	    }
}
