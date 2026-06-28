package secao2;

public class Variavel {
    
public static void main(String[] args) {
    
    // 1 - o que são variaveis
    // tipo -> nome -> atribuição de valor;
    String nome = "Guilherme";

    // nome => "Guilherme"
    System.out.println(nome);

    // 2 - atribuição de variável com outra
    String teste = "teste";

    String testando = teste;

    System.out.println(testando);

    long numeroGrande = 99999999999999L;

    System.out.println(numeroGrande);
    
    // 3 -  comentários

    /* 
    
    comentário linha 1 
    linha 2
    linha 3
    
    */ 

    /** 
     * Função para somar numeros
     * 
     * param1: primeiro numero
     * param2: segundo numero
     * 
     * return: A soma
     *     
     * */

    // 4 -  Strings

    String firstName = "Guilherme";
    String lastName = "Veber";

    System.out.println("Guilherme Veber");

    
    //Exemplo de como os nomes não fazem a separação * System.out.println(firstName + lastName); *

    
    System.out.println(firstName + " " + lastName);
    
    System.out.println("O nome dele é: " + firstName);

    String fullName = firstName + " " + lastName;

    // concatenação = operador + nas Strings, para uni-las
    System.out.println(fullName);

    // 5 - Char

    char letra = 'A';
    System.out.println(letra);

    String letra2 = "A";
    System.out.println(letra2);

    char simbolo = '$';
    System.out.println(simbolo);

    // 6 - Int

    int n = 42;
    System.out.println(n);
    System.out.println(n + 5);
    System.out.println(n * 10);
    System.out.println(n / 5);

    int soma = n + 12;
    System.out.println(soma);

    // 7 - long

    long populacaoMundial = 780000000000L;
    System.out.println(populacaoMundial);
 
    long grandeNumero = 1_000_000L;
    System.out.println(grandeNumero + 1);
     
    // 8 - Double
    double preco = 19.99;
    System.out.println(preco);
    System.out.println(preco - 12);
    System.out.println(preco / 2);
    System.out.println(preco * 3);

    double pi = 3.141_592_123;
    System.out.println(pi);

    double valorcomD = 12.1D;
    System.out.println(valorcomD);

    // 9 - OP.  aritméticos p1

    int soma2 = 12 + 5;

    System.out.println(soma2);
   
    System.out.println(10 + 4);

    System.out.println(10 - 5);

    System.out.println(10 *5);

    System.out.println(10/ 2.5);

    System.out.println(10.0 / 2.5);

    // para ter um resultado com casas decimais, pelo menos um dos valores da divisão deve ser do tipo double 

    System.out.println(10 / 3);

    System.out.println(10.0 / 3);

    System.out.println(10 % 3.0);
    
    // 10 - OP.  aritméticos p2

    int x =  5;

    x++; 
    x++;
    x++;
    x++;

    // loops -> for, while

    System.out.println(x);

    int y = 5;

    y--;

    System.out.println(y);

    int a = 5;

    a += 5;

    // a = a + 5;

    System.out.println(a);

    int b = 10;

    b -= 5;

    System.out.println(b);

    b -= a;

    System.out.println(b);

    // 11 - type casting

    // implicito (widening) 
    int numero2 = 42;

    long numerolong = numero2;

    double numerodouble = numero2;

    System.out.println(numerolong);
    System.out.println(numerodouble);

    // explicito (narrowing)

    double numerodouble2 = 9.78;

    int valorint = (int) numerodouble2;

    System.out.println(valorint);
       
    // casting de char para int
    char letra3 = 'A';

    int codigoASCII = (int) letra3;
   
    System.out.println(codigoASCII);

    // 12 - constantes
    final int DIAS_DA_SEMANA = 7;

    System.out.println("Dias da semana: " + DIAS_DA_SEMANA);

    // 13 - Var
    var z = 10;
    System.out.println(z);

    // z = "teste"; // não é possível alterar o tipo da variável
    z = 5;

    var texto2 = "teste";

    var doubleteste = 2.0;

    System.out.println(texto2);

    System.out.println(doubleteste);

    

    







}

}



