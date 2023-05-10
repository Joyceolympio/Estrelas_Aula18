import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01OutraForma {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        List<String> listaMercado = new ArrayList<>();

        listaMercado.add("Maça");
        listaMercado.add("Leite");
        listaMercado.add("Detergente");
        listaMercado.add("Batata");


        for(int i = 0; i < listaMercado.size(); i++){
            System.out.println(listaMercado.get(i));
        }

        System.out.println("Como você prefere fazer a sua remoção? ");
        System.out.println("1 - Pelo index? ");
        System.out.println("2 - Pelo valor? ");
        int resposta = entrada.nextInt();

        switch (resposta){
            case 1:
                listaMercado.remove(removerPeloIndex());
                break;
            case 2:
                listaMercado.remove(removerPeloValor());
                break;
            default:
                System.out.println("Opção Inválida!!!!!!");
                System.exit(0);
        }

        for (int i = 0; i < listaMercado.size(); i++){
            System.out.println(i + " - " + listaMercado.get(i));
        }
    }

    public static int removerPeloIndex(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o index do elemento da lista que deseja remover: ");

        return entrada.nextInt();
    }

    public static String removerPeloValor(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do elemento da lista que deseja remover: ");

        return entrada.nextLine();
    }

}
