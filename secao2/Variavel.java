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


}

}



