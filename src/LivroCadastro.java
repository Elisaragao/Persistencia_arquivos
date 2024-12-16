import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// ESSA CLASSE EXECUTA O CADASTRO DE LIVROS
// PERMITE QUE O USUÁRIO INSIRA AS INFORMAÇÕES
// E ARMAZENE NO ARRAY livros
class LivroCadastro {

    static ArrayList<Livro> livros = new ArrayList<>();

    static void cadastrarLivro(Scanner leitura) {
        System.out.print("Título: ");
        String titulo = leitura.nextLine();
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                System.out.println("Livro já cadastrado!");
                return;
            }
        }
        System.out.print("Autor: ");
        String autor = leitura.nextLine();
        System.out.print("Gênero: ");
        String genero = leitura.nextLine();
        System.out.print("Código ISBN: ");
        String isbn = leitura.nextLine();

        livros.add(new Livro(titulo, autor, genero, isbn));
        System.out.println("Livro cadastrado com sucesso!");
        salvarLivros();
    }

    public static void salvarLivros() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("livros.bin"))) {
            oos.writeObject(livros);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void carregarLivros() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("livros.bin"))) {
            livros = (ArrayList<Livro>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
