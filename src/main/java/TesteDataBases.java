import java.util.Scanner;

public class TesteDataBases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;

        System.out.println("1 - Inserir dados;\n2 - Consultar tabela;\n3 - Deletar cadastro");
        a = scanner.nextInt();

        switch (a){
            case 1:
                String nome, email, senha;
                System.out.println("--INSERINDO DADOS--");
                System.out.println("Digite seu nome: ");
                nome = scanner.next();
                System.out.println("Digite seu email: ");
                email = scanner.next();
                System.out.println("Digite sua senha: ");
                senha = scanner.next();

                Insert.inserirDados(nome, senha, email);
                break;
            case 2:
                Consult.listarUsuarios();
                break;
            case 3:
                int id;
                System.out.println("Digite o id que deseja excluir: ");
                id = scanner.nextInt();
                Delete.excluirUsuario(id);
        }
    }
}
