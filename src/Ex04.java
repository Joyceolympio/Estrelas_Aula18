import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int primeiroNumero, segundoNumero;

        System.out.println("Digite o primeiro número: ");
        primeiroNumero = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        segundoNumero = entrada.nextInt();

        if (primeiroNumero > segundoNumero){
            System.out.println(primeiroNumero + " ... " + segundoNumero);
        } else if (primeiroNumero < segundoNumero){
            System.out.println(segundoNumero + " ... " + primeiroNumero);
        }else {
            System.out.println("Os número são iguais!");
        }

    }
}
