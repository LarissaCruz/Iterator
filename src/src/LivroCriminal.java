package src;
public class LivroCriminal implements Livros{
	 private String titulo;

	    public LivroCriminal(String titulo) {
	        this.titulo = titulo;
	    }

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
