import java.io.Serializable;
   
  
public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;

    String titulo;
    String autor;
    String isbn;
    String genero;
    String status;

   
    Livro(String titulo, String autor, String genero, String isbn)
    {
        this.titulo = titulo; 
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.status = "disponível";
    }
    public String getTitulo() {
         return titulo; 
        }
}
