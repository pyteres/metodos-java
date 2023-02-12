package metodos.exersicio;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class exersicioSobrecarga {
    /*
     * Exersicio:
     * Faça um progama que calcule  a area de tres quadrilateros notaveis: quadrado, triangulo, trapezio.
     */
    
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroLadosValores;
        int valor1;
        System.out.println("valor1");
        valor1 = scan.nextInt();
        int valor2;
        System.out.println("valor2");
        valor2 = scan.nextInt();
        int valor3;
        System.out.println("valor3");
        valor3 = scan.nextInt();
        int valor4;
        System.out.println("valor4");
        valor4 = scan.nextInt();
        numeroLadosValores = (valor1 * valor2 * valor3 * valor4);
        System.out.println("resultado quadrado" + "=" + numeroLadosValores);
        int valoresTraiangulo;
        int base;
        System.out.println("numero base");
        base = scan.nextInt();
        int altura;
        System.out.println("numero altura");
        altura = scan.nextInt();
        valoresTraiangulo = (base * altura);
        System.out.println("resultado" + "=" + valoresTraiangulo);
        int valoresTrapezio;
        System.out.println("base1");
        base = scan.nextInt();
        int base2;
        System.out.println("base2");
        base2 = scan.nextInt();
        System.out.println("altura");
        altura = scan.nextInt();
        valoresTrapezio = (base + base2 * altura / 2);
        System.out.println("resiçtadp trapezio" + "=" + valoresTrapezio);
}        
}