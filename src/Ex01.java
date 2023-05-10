import java.util.Arrays;

public class Ex01 {

    public static void main(String[] args){

        int[] lista = {27, 28, 10, 90, 5, 49, 60, 91};

        System.out.println("Array Inicial: " + Arrays.toString(lista));

        int removerPorIndex = 1;

        for (int i = removerPorIndex; i < lista.length - 1; i++){

            lista[i] = lista[i + 1];

        }

        System.out.println("Lista depois de removido: " + Arrays.toString(lista));
    }

}
