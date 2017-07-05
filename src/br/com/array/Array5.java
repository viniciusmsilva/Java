package br.com.array;

/**
 * Estudo do Array exemplo 5 - Percorrendo um arrat com o laço for e foreach
 * 05.07.2017
 *
 * @author Vinicius_Marques https://github.com/viniciusmsilva
 */
public class Array5 {

    public static void main(String[] args) {
        // Iniciando um array de tamanho variável
        int[] pares = {2, 4, 6, 8};
        // A estrutura abaixo percorre o array
        for (int i = 0; i < pares.length; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
        }
        // Usando uma estrutura simplificada do laço for(foreach) para percorrer o array
        System.out.println("Uso de foreach: ");
        for (int i : pares) {
            System.out.println(i);
        }
    }
}
