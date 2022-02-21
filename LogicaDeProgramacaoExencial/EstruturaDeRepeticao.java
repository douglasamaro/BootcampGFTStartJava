package LogicaDeProgramacaoExencial;

public class EstruturaDeRepeticao {

    static int numero;
    static int count;
    static int limite = 90;
    public static void main(String[] args) {
        while (numero <= limite) {
                System.out.println("tabuada atual: " + count + " x 9 = " + numero);
                numero += 9;
                count ++;
        }
    }

}
