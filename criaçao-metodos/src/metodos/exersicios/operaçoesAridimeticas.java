package metodos.exersicios;

import java.util.Scanner;

public class operaçoesAridimeticas {
/*
 * Crie uma aplicaçao que resolva as seguites questoes
 */

 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero1;
    System.out.println("numero1");
    numero1 =  scan.nextInt();
    int numero2;
    System.out.println("numero2");
    numero2 = scan.nextInt();
    int soma;
    soma = (numero1 + numero2);
    System.out.println("resultado" + "=" +  soma); 
    int subtraçao;
    subtraçao = (numero1 - numero2);
    System.out.println("resultado" + "=" + subtraçao);
    int multiplicaçao;
    multiplicaçao = (numero1 * numero2);
    System.out.println("resultado" + "=" + multiplicaçao);
    int divisao;
    divisao = (numero1 / numero2);
    System.out.println("resultado" + "=" + divisao);
 }
}
