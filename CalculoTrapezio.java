import java.util.Scanner;

//instrução1
// Perguntat ao Usuaria(aluno) o tamanho da base do triangulo.
//instrução2
//Guarde o valor da base do triangulo em uma variavel.
//instrução3
//Perguntar ao Usuario(aluno) o tamanho da altura
//instrução4
//Guardar o valor do tamanho da altura do triangulo.
//instrução5
//Fazer a multiplicação da base pela altura.
//instrução6
//Fazer a divisão por 2 para obter a area.
//instrução7
//Guardar o resultado da divisão.
//instrução8
//Printar o resultado
//instrução9
//Apresentar o resultado para o usuario.
//...

class CalculoTrapezio {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
			
			
    		double baseMenor,baseMaior, altura, resultado;
			
			
			System.out.printf("Insira o tamanho da base menor do trapezio \n");
			baseMenor = teclado.nextDouble();
			
			System.out.printf("Insira o tamanho da base maior do trapezio \n");
			baseMaior = teclado.nextDouble();
			
			System.out.printf("Insira o tamanho da altura do triangulo \n");
			altura = teclado.nextDouble();
			
			resultado = ((baseMaior + baseMenor)/ 2)*altura;

    		System.out.printf("%f", resultado); 

    		System.exit(0);
		
	}

}
