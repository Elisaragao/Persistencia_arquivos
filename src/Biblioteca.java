import java.util.Scanner;

public class Biblioteca
{
    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);   
    LivroCadastro.carregarLivros();
    int opcao;
    do
    {
        System.out.println("Escolha uma opção: ");
        System.out.println("1. Cadastrar livro");
        System.out.println("2. Listar livros");
        System.out.println("3. Empréstimo de livro");
        System.out.println("4. Devolução de livro");
        System.out.println("5. Consultar status dos livros");
        System.out.println("6. Sair");
     
        opcao = leitura.nextInt();
        leitura.nextLine();

    switch (opcao) {
        case 1: LivroCadastro.cadastrarLivro(leitura);
        break;

        case 2: LivroListar.listarLivros(LivroCadastro.livros);
        break;

        case 3: LivroEmprestar.emprestar(leitura);
        break;

        case 4: LivroDevolver.devolver(leitura);
        break;

        case 5: ConsultarStatus.consulta(leitura);
        break;

        case 6: System.out.println("Tchauzinho");

        default: System.out.println("Número inválido");
        break;
    }
}   while (opcao != 6);

}
}