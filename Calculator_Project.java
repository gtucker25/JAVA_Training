// This program is a two integer calculator
public class Calculator {
  public Calculator(){

  }
  public static int add(int a, int b){
    int added_ints = a+b;
    return added_ints;
  }
  public static int subtract(int a, int b){
    int subtracted_ints = a-b;
    return subtracted_ints;
  }
  public static int multiply(int a, int b){
     int multiplied_ints = a*b;
    return multiplied_ints;
  }
  public static int divide(int a, int b){
    int divided_ints=a/b;
    return divided_ints;
  }
  public static int modulo(int a, int b){
    int modulod_ints= a%b;
    return modulod_ints;
  }
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(add(5,7));
    System.out.println(subtract(45,11));
    System.out.println(modulo(45,11));

  }
}
