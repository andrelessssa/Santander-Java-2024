package edu.andre.operadores;

import java.sql.Date;

public class Operadores {
    public static void main(String[] args) {
        Date dataNascimento  = new Date(0); // criando um objeto

        int numero = 5;
        System.out.println(- numero);

        System.out.println(numero);

        // para transformar 

        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        int numero2 = 5;
        numero2 = numero2 + 1;
        System.out.println(numero2);

        numero2++;

        System.out.println(numero2);

        System.out.println(numero2++); // assim ele imprime e depois acrecenta ai na porxima impressao 
        System.out.println(numero2);

        System.out.println(++numero2); // agora ele soma e depois imprimir (precendencia)

        boolean variavel = true;
        System.out.println(!variavel); // assim nao muda ela

        variavel = !variavel;           // agora sim 

        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro": "falso";

       

        System.out.println(resultado);

        String nomeUm = "Andre";
        String nomeDois = "Andre";

        System.out.println(nomeUm == nomeDois);

        String nomeUmm = "Andre";
        String nomeDoiss = new String("Andre");

        System.out.println(nomeUmm.equals(nomeDoiss)); // dois objetos


        boolean condicional1 = true;
        boolean condicional2 = true;

        if(condicional1 && condicional2){
            System.out.println("as duas sao verdadeiras");
        }


        





    }
    
}
