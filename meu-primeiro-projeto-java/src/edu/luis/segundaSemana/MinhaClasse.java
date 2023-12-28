package edu.luis.segundaSemana;
public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Luis";
        String segundoNome = "Henrique";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.err.println(nomeCompleto);

        }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Seu nome é " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
