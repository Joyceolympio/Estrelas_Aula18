import java.util.Arrays;

public class Ex02 {

    public static void main(String[] args){

        int[] lista = {27, 28, 10, 90, 5, 49, 60, 91};

        int posicaoDoIndex = 2;
        int novoValor = 6;

        System.out.println("Array Incial: " + Arrays.toString(lista));

        for (int i = lista.length - 1; i > posicaoDoIndex; i--){
            lista[i] = lista[i-1];
        }

        lista[posicaoDoIndex] = novoValor;
        System.out.println("Novo array: " + Arrays.toString(lista));

    }

}
