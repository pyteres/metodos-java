package metodos.exersicios;

import java.util.Scanner;

public class calcularEmprestimo {
    //Calcule o valor de um emprestimo, a partir do valor solicitado. Talvez as parcelas influenciam. Defina arbritariamente as faixas que influenciam o valor.

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int valorEmprestimo;
    System.out.println("valor emprestimo");
    valorEmprestimo = scan.nextInt();
    int parcelasEmprestimo;
    System.out.println("quantidade de parcelas");
    parcelasEmprestimo = scan.nextInt();
    int valorParcelas;
    valorParcelas = (valorEmprestimo / parcelasEmprestimo);
    System.out.println("valor das parcelas" + "=" + valorParcelas);
    }
}
