package br.com.array;

/**
 * Estudo do Array exemplo 3 - Instanciando um array de tamanho fixo 05.07.2017
 *
 * @author Vinicius_Marques https://github.com/viniciusmsilva
 */
public class Array3 {

    public static void main(String[] args) {
        // Iniciando um array com tamanho fixo de 5 variáveis
        int[] impares = new int[5];
        impares[0] = 1;
        impares[1] = 3;
        impares[2] = 5;
        impares[3] = 7;
        impares[4] = 9;
        // Verificando o tamanho do array
        System.out.println("Tamanho do array: " + impares.length);
        System.out.println("Posição 1 do array: " + impares[1]);
        // A linha abaixo gera um erro, pois o tamanho do array é 5
        impares[5] = 11;
        System.out.println("Posição 5 do array: " + impares[5]);
    }
}
