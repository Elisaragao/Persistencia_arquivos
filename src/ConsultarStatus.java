import java.util.Scanner;
import java.io.*;

public class ConsultarStatus {
    static void consulta(Scanner leitura){
        
        System.out.println("Digite o título do livro para consulta:");
        String titulo = leitura.nextLine();

        boolean livroEncontrado = false;

        for(Livro livro : LivroCadastro.livros){
            if(livro.titulo.equals(titulo)){
                livroEncontrado = true;
                System.out.println("Status do livro '" + titulo + "' é " + livro.status);
                return; 
            }
        }

        if(!livroEncontrado){
        System.out.println("Livro não encontrado!");
        }
    }
}
