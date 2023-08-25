import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //

    }

    // Método que retorna quantas ocorrências de um elemento estão na lista
    public static int nOcorrencias(ArrayList<Integer> lista, int elemento) {
        int n = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == elemento) {
                n++;
            }
        }
        return n;
    }

    // Método que retorna uma lista de elementos repetidos de lista
    public static ArrayList<Integer> repetidos(ArrayList<Integer> lista) {
        ArrayList<Integer> repetidos = new ArrayList<Integer>();
        for (int i = 0; i < lista.size(); i++) {
            if (nOcorrencias(lista, lista.get(i)) > 1) {
                repetidos.add(lista.get(i));
            }
        }
        return repetidos;
    }
}