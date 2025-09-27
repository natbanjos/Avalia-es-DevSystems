import java.util.Scanner;

public class Q1mtech {
    static void main() {
        String nomeAluno;
        double n1,n2,n3,n4,n5,n6,n7,n8;
        // Criação do objeto leitura para receber as notas dos alunos
        Scanner leitura = new Scanner(System.in);
        //Leitura do nome do aluno e armazernamento na variável nomeAluno
        System.out.print("Digite o nome do aluno: ");
        nomeAluno = leitura.nextLine();

        System.out.print("Digite nota 1 do aluno: ");
        n1 = leitura.nextDouble();
        System.out.print("Digite nota 2 do aluno: ");
        n2 = leitura.nextDouble();
        System.out.print("Digite nota 3 do aluno: ");
        n3 = leitura.nextDouble();
        System.out.print("Digite nota 4 do aluno: ");
        n4 = leitura.nextDouble();
        System.out.print("Digite nota 5 do aluno: ");
        n5 = leitura.nextDouble();
        System.out.print("Digite nota 6 do aluno: ");
        n6 = leitura.nextDouble();
        System.out.print("Digite nota 7 do aluno: ");
        n7 = leitura.nextDouble();
        System.out.print("Digite nota 8 do aluno: ");
        n8 = leitura.nextDouble();

        double bimestre1 = (n1 +n2)/2;
        double bimestre2 = (n3+n4)/2;
        double media1 = (bimestre1+bimestre2)/2;

        double bimestre3 = (n5+n6)/2;
        double bimestre4 = (n7+n8)/2;
        double media2 = (bimestre3+bimestre4)/2;

        double mediaFinal = (media1+media2)/2;

        System.out.println("nome do estudante: "+nomeAluno);
        System.out.println("1º bimestre: "+bimestre1);
        System.out.println("2º bimestre: "+bimestre2);
        System.out.println("1º semestre: "+media1);
        System.out.println("------------------------------------");
        System.out.println("3º bimestre: "+bimestre3);
        System.out.println("4º bimestre: "+bimestre4);
        System.out.println("2 semestre: "+media2);
        System.out.println("Média final: "+mediaFinal);


    }
}
