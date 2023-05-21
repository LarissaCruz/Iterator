package src;
import java.util.List;

public class Biblioteca {
	private List<Livros> livros;

    public Biblioteca(List<Livros> livros) {
        this.livros = livros;
    }

    public Iterator criarIterador() {
        return new IteratorList(livros);
    }
}
