import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();

        System.out.println("Digite uma sequência de números inteiros positivos (número negativo para terminar):");
        int n = scanner.nextInt();
        while (n >= 0) {
            lista.add(n);
            n = scanner.nextInt();
        }

        System.out.println("Lista: " + lista);
        System.out.println("Número de ocorrências de 1: " + nOcorrencias(lista, 1));
        System.out.println("Tem elementos repetidos? " + temRepetidos(lista));
        System.out.println("Número de elementos repetidos: " + nRepetidos(lista));
        System.out.println("Elementos repetidos: " + repetidos(lista));
        System.out.println("União com {1, 2, 3}: " + uniao(lista, new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
            }
        }));
        System.out.println("Intersecção com {1, 2, 3}: " + interseccao(lista, new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
            }
        }));
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

    // Método que retorna true se l tem elementos repetidos
    public static boolean temRepetidos(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (nOcorrencias(lista, lista.get(i)) > 1) {
                return true;
            }
        }
        return false;
    }

    // Método que retorna o número de elementos repetidos em lista
    public static int nRepetidos(ArrayList<Integer> lista) {
        int n = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (nOcorrencias(lista, lista.get(i)) > 1) {
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

    // Método que retorna a união de lista1 e lista2
    public static ArrayList<Integer> uniao(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> uniao = new ArrayList<Integer>();
        for (int i = 0; i < lista1.size(); i++) {
            uniao.add(lista1.get(i));
        }
        for (int i = 0; i < lista2.size(); i++) {
            uniao.add(lista2.get(i));
        }
        return uniao;
    }

    // Método que retorna a intersecção de lista1 e lista2
    public static ArrayList<Integer> interseccao(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> interseccao = new ArrayList<Integer>();
        for (int i = 0; i < lista1.size(); i++) {
            if (lista2.contains(lista1.get(i))) {
                interseccao.add(lista1.get(i));
            }
        }
        return interseccao;
    }
}