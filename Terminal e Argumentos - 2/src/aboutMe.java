public class aboutMe {


    /*  Com o terminal tambem e possivel passar parametros para execição dos programa por exemplo: C:\Users\kaue_\Desktop\dio-java\Terminal e Argumentos - 2\bin>java aboutMe KAUE PATRICK 19 1.70
        Retorno:
        Ola, me chamo KAUE PATRICK
        Tenho 19 anos
        Minha altura é 1.70 cm
    */


    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
