package metodos.exersicios;

import java.util.Scanner;

public class obterMensagem {
    //* A partir da hora do dia responda as mensagens bom dia, boa tarde e boa noite.

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
     int horas;
     System.out.println("horas");
     horas = scan.nextInt();
     if(horas == 24 || horas <= 12){
        System.out.println("bom dia");
        horas =  scan.nextInt();
     }else if(horas == 12 || horas <= 18){
        System.out.println("boa tarde");
        horas = scan.nextInt();
     }else if(horas == 18 || horas <= 24){
        System.out.println("boa noite");
        horas = scan.nextInt();
     }
}

}