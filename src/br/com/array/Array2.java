package br.com.array;

import java.util.Random;

/**
 * Estudo do Array exemplo 2 - Sorteia de uma carta 05.07.2017
 *
 * @author Vinicius_Marques https://github.com/viniciusmsilva
 */
public class Array2 {

    public static void main(String[] args) {
        String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
        String[] faces = {"AZ", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        // A linha abaixo cria um objeto chamado sorteio usando como modelo a classe Random
        //System.out.println(faces.length);
        Random sorteio = new Random();
        // A linha abaixo faz o sorteio do indíce dos nipes, usando o objeto sorteio e atribui o resultado a variável indice_nipes
        // O número (4) gera números aleatórios no intervalo de 0 até 3
        int indice_nipe = sorteio.nextInt(4);
        // A linha abaixo faz o sorteio do indíce das faces, usando o objeto sorteio e atribui o resultado a variável indice_faces
        // O .length gera números aleatórios no intervalo do tamanho total do array
        int indice_face = sorteio.nextInt(faces.length);
        // As linhas abaixo atribuem o resultado do sorteio ao array correspondente
        String face = faces[indice_face];
        String nipe = nipes[indice_nipe];
        // A linha abaixo exibe a carta sorteada
        System.out.println(face + " de " + nipe);
    }
}
