package secao2;

public class Exercicios {
    
    
    /* Exercício 1:
    
    crie uma variável int para armazenar o valor 10.
    crie um segunda variável int que armazene o dobro do valor da primeira variável
    usando operadores aritimeticos.
    exiba o resultado.

    Exercício 2:

    declare duas variáveis do tipo double para armazenar os valores 15.75 e 20.40.
    some os valores dessas variáveis e armazene o resultado em uma nova variável doble.
    Exiba o resultado.

    Exercício 3:

    Declare uma variável char que armazene a letra 'B'.
    faça o casting explicito dessa variável para int e exiba o valor numérico correspondente.

    Exercício 4:

    Declare uma variável long para armazenar o numero 2 bilhões (2_000_000_000).
    Em seguida, declare uma variável int e faça o casting explicitodo valor long para int.
    Exiba o resultado.

    Exercício 5:

    Escreva um programa que crie uma variável string com o valor "Olá Mundo!" .
    Em seguida, crie outra variável string queconcatene a priera variável com o texto " Bem-vindo ao Java!".
    Exiba o resultado.
    
    */

    // Exercício 1:
    public static void main(String[] args) {
        
       int valor1 = 10;
       int valor2 = valor1 * 2;

       System.out.println(valor2);

       // Exercício 2:

       double valor3 = 15.75;
       double valor4 = 20.40;
       
       double resultado = valor3 + valor4;
      
       System.out.println(resultado);

       // Exercício 3:

       char letra = 'B';
       int valorAscii = (int) letra;
      
       System.out.println(valorAscii);

       // Exercício 4:

       long numeroLong = 2_000_000_000L;
      
       int numeroInt = (int) numeroLong;

       System.out.println(numeroInt);

       // Exercício 5:

       String helloWorld = "Olá Mundo!";

       String welcomeMessage = helloWorld + " Bem-vindo ao Java!";

       System.out.println(welcomeMessage);




    }




}
