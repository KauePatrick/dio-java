public class Metodos {


    public double somar(int num1, int num2){

        num1=1;
        num2=5;
        double total = num1 + num2;
        System.out.println(total);
        return total;
    }

    public void imprimir(String texto){

        System.out.println(texto);
    }

    private void metodoPrivado(){
        //esse metodos não pode ser visto por outras classes 
    }

    public static void main (String [] args){
        
        Metodos metodos = new Metodos();

        metodos.somar(1, 5);

        metodos.imprimir("Hello World");


        

    }
    
}
