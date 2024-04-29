package edu.andre.metodos;

public class Metodos {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        System.out.println("A tv esta ligada? " + smartTv.ligada);
        System.out.println("Qual o canao atual? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

       smartTv.ligar();
       System.out.println("A tv esta ligada? " + smartTv.ligada);

       smartTv.aumentarVolume();
       System.out.println("Qual o volume? " + smartTv.volume);

       smartTv.diminuirVolume();
       System.out.println("Qual o volume? " + smartTv.volume);

       smartTv.diminuirVolume();
       System.out.println("Qual o volume? " + smartTv.volume);

       smartTv.diminuirVolume();
       System.out.println("Qual o volume? " + smartTv.volume);

       smartTv.diminuirVolume();
       System.out.println("Qual o volume? " + smartTv.volume);

       smartTv.diminuirVolume();
       System.out.println("Qual o volume? " + smartTv.volume);

           


    }
}