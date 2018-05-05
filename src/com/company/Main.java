package com.company;

public class Main {

    static String veredicto(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "El resultado esperado, muy bien.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Has mejorado.";
        }
        else
            return "Te has confiado. Falta realismo.";
    }

    public static void main(String[] args) {

        String valor1;
        String valor2;

        valor1=args[3];
        valor2=args[4];

        System.out.println("La calificación de " + args[0] + " " + args[1] + " " + args[2] + " el objetivo es: " + args[3] + " nota: " + args[4]);

        System.out.println(Main.veredicto(valor1,valor2));

    }
}
