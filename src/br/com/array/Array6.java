package br.com.array;

/**
 * Estudo do Array exemplo 6 - Array Multidimensional 05.07.2017
 *
 * @author Vinicius_Marques https://github.com/viniciusmsilva
 */
public class Array6 {

    public static void main(String[] args) {
        // A linha abaixo cria um array de duas dimensões com 3 linhas e 3 colunas
        String[][] agenda = {{"Bill", "1111-1111", "bill@outlook.com"}, {"Linus", "2222-2222", "linus@tux.com"}, {"Steve", "3333-3333", "steve@iclous.com"}};
        // Exemplo 1: Recuperando o email do Bill
        //System.out.println(agenda[0][2]);
        // Exemplo 2: Montando a agenda de contatos
        // O primeiro laço percorre as linhas
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("_____________________________");
            // O segundo laço dentro do primeiro laço, percorre as colunas, montando a agenda
            for (int j = 0; j < agenda[i].length; j++) {
                System.out.println(agenda[i][j]);
            }
        }
    }
}
