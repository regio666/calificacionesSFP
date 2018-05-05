package com.company;

/**
 * @author Sergio Fernández Pina
 * @version 1.1
 */
public class Main {

    /**
     *
     * @param valor1 :la cadena valor1 recupera el argumento args[3]
     * @param valor2 :la cadena valor2 recupera el argumento args[4]
     * @return :el método devuelve el resultado de la comparación de los argumentos valor1==valor2,
     *          valor1<valor2 y la alternativa que es valor1>valor2 como "else", como una cadena de texto.
     */

    static String veredicto(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "El resultado esperado, muy bien.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Has mejorado tus expectativas, excelente.";
        }
        else
            return "Te has confiado. Esfuérzate más la próxima vez.";
    }

    public static void main(String[] args) {

        String valor1;
        String valor2;

        valor1=args[3];
        valor2=args[4];

        System.out.println("La calificación de " + args[0] + " " + args[1] + " " + args[2] + " el objetivo, es: " + args[3] + " nota: " + args[4]);

        System.out.println(Main.veredicto(valor1,valor2));

    }
}
