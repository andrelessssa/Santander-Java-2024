package edu.andre.terminalargumento;

import java.util.Locale;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite Seu Nome");
        String nome = scanner.next();

        System.out.println("Seu nome é " + nome);


        System.out.println("oi fui executado pelo terminal");

        


    }
    
}
