package br.com.array;

/**
 * Estudo do Array exemplo 4 - Preenchendo um array com a lanço for 05.07.2017
 *
 * @author Vinicius_Marques https://github.com/viniciusmsilva
 */
public class Array4 {

    public static void main(String[] args) {
        int[] idades = new int[10];
        // A estrutura abaixo cria as variáveis que irão preencher as 10 posições ("casinhas") do array
        for (int i = 0; i < 10; i++) {
            idades[i] = i * 10;
            System.out.println("Idades[ " + i + " ]" + idades[i]);
        }
    }
}
