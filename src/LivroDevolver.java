import java.util.Scanner;
import java.io.*;

public class LivroDevolver {
    static void devolver(Scanner leitura) {
        System.out.print("Digite o título do livro que deseja devolver: ");
        String titulo = leitura.nextLine();
        boolean livroEncontrado = false;

        for (Livro livro : LivroCadastro.livros) {
            if (livro.titulo.equals(titulo)) {
                livroEncontrado = true;
                if (livro.status.equals("emprestado")) {
                    livro.status = "disponível";
                    System.out.println("Devolução realizada com sucesso!");
                    return;
                }
            }
        }
        if (!livroEncontrado) {
            System.out.println("Livro não encontrado!");
        }
    }
}

