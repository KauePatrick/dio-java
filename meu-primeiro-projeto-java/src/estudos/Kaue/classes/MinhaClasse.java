public class MinhaClasse {

public static void main(String [] args){

        String primeiroNome = "Gleyson";
        String segundoNome = "Sampaio";
        short eu = 128;

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }

 public static String nomeCompleto (String primeiroNome, String segundoNome){

    return "Resultado do método " + primeiroNome + " " + segundoNome;

  }

}  