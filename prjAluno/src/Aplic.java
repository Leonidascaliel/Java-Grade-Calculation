
import java.util.Scanner;

// Autor Leonidas Caliel de Carvalho
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int RA, opcao = 0;
        double ntPrv1, ntPrv2, ntTrab1, ntTrab2;

        Aluno objAluno = new Aluno();

        System.out.print("Digite o RA do Aluno: ");
        RA = entrada.nextInt();

        System.out.print("\nDigite Nota da Prova 1: ");
        ntPrv1 = entrada.nextDouble();

        System.out.print("Digite Nota da Prova 2: ");
        ntPrv2 = entrada.nextDouble();

        System.out.print("Digite Nota do Trabalho 1: ");
        ntTrab1 = entrada.nextDouble();

        System.out.print("Digite Nota do Trabalho 2: ");
        ntTrab2 = entrada.nextDouble();

        // Enviando dados para o objeto
        objAluno.setRA(RA);

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Mostrar RA");
            System.out.println("2 - Média das Provas e Trabalhos");
            System.out.println("3 - Média Final");
            System.out.println("4 - Sair");
            
            System.out.print("\n\nEscolha uma opção: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("RA Selecionado: " + objAluno.getRA());
            } else if (opcao == 2) {
                System.out.println("Média das Provas: " + objAluno.calcMediaProva());
                System.out.println("Média dos Trabalhos: " + objAluno.calcMediaTrab());
            } else if (opcao == 3) {
                System.out.println("Média Final: " + objAluno.calcMediaFinal());
            }

        } while (opcao != 4);

        System.out.println("Programa encerrado.");
        entrada.close();
    }
}
