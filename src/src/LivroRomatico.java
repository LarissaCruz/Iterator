package src;

public class LivroRomatico implements Livros{
	private String titulo;
	
	public LivroRomatico(String titulo) {
	   this.titulo = titulo;
	}
	  
	@Override
	public void getTitulo() {
		// TODO Auto-generated method stub
		System.out.println(this.titulo);
	}

	@Override
	public void setTitulo(String titulo) {
		// TODO Auto-generated method stub
		this.titulo = titulo;
	}

}
