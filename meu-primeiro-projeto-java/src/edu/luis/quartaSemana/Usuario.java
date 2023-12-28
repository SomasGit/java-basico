package edu.luis.quartaSemana;

public class Usuario {
public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();
    System.out.println("A TV está ligada? " + smartTv.ligada);
    System.out.println("O volume atual é: " + smartTv.volume);
    System.out.println("O canal atual é: " + smartTv.canal);


    smartTv.ligar();
    System.out.println("Novo Status ---> TV Ligada? " + smartTv.ligada);
}
    
}
