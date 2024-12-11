package br.com.alura.na.online.alocadora.sua.screen_math.doMain.exemplos;

import java.util.Arrays;
import java.util.List;

public class ExemplosDeLambdas {
    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        /*
        for (Integer intDeNumeros: listaNumeros) {
            if (intDeNumeros % 4 == 0) {
                System.out.println(intDeNumeros);
            }
        }

         */
        listaNumeros.stream().filter(intDeNumeros -> intDeNumeros % 5 == 0).forEach(System.out::println);
    }
}
