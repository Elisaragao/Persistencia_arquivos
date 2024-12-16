import java.io.Serializable;
   
   //ESSA CLASSE REPRESENTA UM LIVRO GENÉRICO
public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;
    //AQUI EU JÁ DEFINI OS ATRIBUTOS DO LIVRO
    String titulo;
    String autor;
    String isbn;
    String genero;
    String status;

    //AQUI EU USEI UM CONSTRUTOR PARA QUE OS ATRIBUTOS SEJAM INICIADOS QUANDO EU CRIAR UM NOVO OBJETO LIVRO
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