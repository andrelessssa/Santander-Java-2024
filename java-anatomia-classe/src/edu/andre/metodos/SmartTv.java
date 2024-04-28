package edu.andre.metodos;

public class SmartTv {
    
    boolean ligada = false;
    int canal = 1 ;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = true;
    }
    public void aumentarVolume(){
       
        volume += 5;
    }
    public void diminuirVolume(){
        if (volume < 0){
            System.out.println("Volume ja esta 0");
        }
        volume -= 5;
    }
}
