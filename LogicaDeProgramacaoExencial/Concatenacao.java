package LogicaDeProgramacaoExencial;

import java.util.Scanner;

public class Concatenacao {

    static String nome;
    static String sobrenome;
    static int idade;
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite seu nome");
        nome = ler.nextLine();

        System.out.println("Digite seu sobrenome");
        sobrenome = ler.nextLine();

        System.out.println("Digite sua idade");
        idade = ler.nextInt();
        System.out.println("O seu nome é " + nome + " e seu sobrenome é " + sobrenome + " ,você tem " + idade + " anos de idade");
    }

}
