public class ForArrays {

    public static void main(String[] args) {
        String alunos []= {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        //objeto .length e declarado para comparação com valor int da variavel x, length e igual a tamnho, sendo o tamanho do array de 4 lugares, x <= alunos.

        for (int x = 0; x < alunos.length; x++){

            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }


        /*ou podemos usar assim:
        
         * String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
	
        //Forma abreviada
	for(String aluno : alunos) {
	  System.out.println(alunos);
	}

         */
    }
}