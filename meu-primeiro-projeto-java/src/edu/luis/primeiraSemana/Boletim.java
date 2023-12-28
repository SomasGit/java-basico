package edu.luis.primeiraSemana;
public class Boletim {
    public static void main(String[] args) {
        // int nota1
        // int nota2 
        int mediaFinal = 5;
        
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("NA MÉDIA");
        else
            System.out.println("APROVADO");
    }
}
