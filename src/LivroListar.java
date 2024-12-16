import java.util.ArrayList;

//ESSA CLASSE SERVE PARA LISTAR OS LIVROS CADASTRADOS
public class LivroListar {

    //NESSE CASO, EU PASSEI O ARRAY QUE ARMAZENOU OS VALORES
    //CADASTRADOS COMO PARÂMETRO
    
    static void listarLivros(ArrayList<Livro> livros ) { 
        for (Livro livro : livros) { 
        System.out.println(
        "Título: " + livro.titulo 
        + ", Autor: " + livro.autor 
        + ", Gênero: " + livro.genero
        + ", ISBN: " + livro.isbn
        +", Status: " + livro.status); 
        }
    
}
}