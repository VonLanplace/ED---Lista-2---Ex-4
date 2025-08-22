package view;

import controller.Factorial;
import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Factorial fc = new Factorial();
    Scanner in = new Scanner(System.in);

    int num = 0;
    while (true) {
      System.out.println("Insira um Número");
      num = in.nextInt();
      if (num < 12 && num > 0){
        break;
      }
      System.out.println("Valor inválido!!");
    }
    System.out.println("O fatorial de "+num +" é: " + (fc.factorial(num)));
  }
}
