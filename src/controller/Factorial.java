package controller;

public class Factorial{
  public static int factorial(int num){
    if (num < 2) return 1;
    if (num % 2 == 1){
      return num*factorial(num-1);
    }else{
      return factorial(num-1);
    }
  }
}
