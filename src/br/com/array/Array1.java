package br.com.array;

/**
 * Estudo do Array exemplo 1 - Array simples 05.07.2017
 *
 * @author Vinicius_Marques https://github.com/viniciusmsilva
 */
public class Array1 {

    public static void main(String[] args) {
        // Sem array
        System.out.println("Array simples");
        System.out.println("1. Sem array");
        // String aceita diversos caracteres
        String time1 = "Palmeiras";
        String time2 = "Corinthians";
        String time3 = "São Paulo";
        String time4 = "Santos";
        System.out.println("Time: " + time2);
        System.out.println("2. Com array");
        // A linha abaixo cria Array simples de tamanho 4
        String[] times = {"Palmeiras", "Corinthians", "São Paulo", "Santos"};
        // A linha abaixo exibe o conteúdo do array na posição [1]
        // [0][1][2][3]
        System.out.println("Time: " + times[1]);
        // A linha abaixo o .length exibe o tamanho do array
        System.out.println("Tamanho do array: " + times.length);
        // A linha abaixo altera o conteúdo de um array
        times[1] = "Flamengo";
        System.out.println("Time: " + times[1]);
    }
}
