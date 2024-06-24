public class Operadores {
    
    public static void main(String [] args){

        //aritmeticos (-, +, *, /, %)

        //atribuição de valor (=)

        //Unarios:

        int numero = 5;

        System.out.println(+ numero);

        System.out.println(- numero);

        System.out.println(++ numero);

        numero = 5;

        System.out.println(-- numero);

        //Unarios

        //Operador logico de negação (!)

        //Operadores ternarios (?) (:)

        int a, b;

        a=5;
        b=6;

        String resultado = a==b ? "Verdadeiros" : "Falso";

        System.out.println(resultado);


        //Operadores Relacionais

        int numero1, numero2;

        numero1 = 1;
        numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 == numero2){
            System.out.println("A nossa condição e: " + simNao);
        }

        System.out.println("numeroUm e igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm e diferente a numeroDois?" + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm e maior a numeroDois?" + simNao);

   

    }
}
