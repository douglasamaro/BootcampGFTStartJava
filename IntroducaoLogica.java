import java.util.Scanner;

    /*
    Desafio:
    Crie um mapa mental para resolver um
    determindado problema, por exemplo,
    calcular a média aritmética de 4 notas,
    sabendo que as notas são as seguintes...
-------------------------------------------------------
    Minha adaptação:
    para que eu possa aplicar outros conteúdos,
    irei user o input Scanner, ao envés de usar
    valores estáticos para variávevis.
-------------------------------------------------------
    Raciocínio:
    Eu farei com que o usuário digite 4 notas
    e essas quatro notas serão somadas e o resultado
    será divido por 4, para exibir uma média aritméca.
     */

public class IntroducaoLogica {

    static double nota1;
    static double nota2;
    static double nota3;
    static double nota4;


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("EXERCICIO 1) digite as notas do aluno, de 0 a 100");
        System.out.print("digite primeira nota: "); nota1 = ler.nextDouble();
        System.out.println("_______________________________");
        System.out.print("digite segunda nota: "); nota2 = ler.nextDouble();
        System.out.println("_______________________________");
        System.out.print("digite terceira nota: "); nota3 = ler.nextDouble();
        System.out.println("_______________________________");
        System.out.print("digite quarta nota: "); nota4 = ler.nextDouble();

        System.out.println("-");
        System.out.printf("A média é %.2f", Calcular());

    }

    public static double Calcular() {
        return ((nota1 + nota2 + nota3 + nota4) / 4);
    }

}
