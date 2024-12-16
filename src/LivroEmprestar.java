import java.util.Scanner;
import java.io.*;

public class LivroEmprestar {
    static void emprestar(Scanner leitura) {
        System.out.print("Digite o título do livro: ");
        String titulo = leitura.nextLine();
        boolean livroEncontrado = false;

        for (Livro livro : LivroCadastro.livros) {
            if (livro.titulo.equals(titulo)) {
                livroEncontrado = true;
                if (livro.status.equals("disponível")) {
                    livro.status = "emprestado";
                    System.out.println("Empréstimo realizado com sucesso!");
                    return;
                } else {
                    System.out.println("Livro não disponível para empréstimo.");
                    return;
                }
            }
        }
        if (!livroEncontrado) {
            System.out.println("Livro não encontrado!");
        }
    }
}
