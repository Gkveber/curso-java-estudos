package secao2;

import java.util.Scanner;

public class testeScanner {
    
public static void main(String[] args) {
  // 1 - testando o scanner
    Scanner scanner = new Scanner(System.in);
    
   // Menssagem para usuário entender o que precisa digitar
    System.out.println("Digite seu nome: ");
    
    // 2 - resgata o valor do terminal
    String nome = scanner.nextLine();
    
    // 3 - exibindo o valor digitado pelo usuário
    System.out.println("Olá "+ nome + "!");

    // nextInt

    System.out.println("Digite sua idade: ");
   
    int idade = scanner.nextInt();

    System.out.println("Você tem " + idade + " anos.");

    // 2 - problema do nextLine

    System.out.println("Digite um numero: ");

    int n = scanner.nextInt();

    scanner.nextLine(); // Limpa o buffer do scanner para evitar problemas com o nextLine() após o nextInt()

    System.out.println("Digite um texto: ");

    String txt = scanner.nextLine();

    System.out.println("Os dados são, n = " + n + " e txt = " + txt);

    








    // Fechamento do scanner, para evitar memory leak.
    scanner.close();

}


}
