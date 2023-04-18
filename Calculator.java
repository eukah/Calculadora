//classe
public class Calculator {

//construtor   
public Calculator(){
    
}
//add method
public int add(int a, int b){
    int result = a + b;
    return result;
}
//subtract method
public int subtract(int a, int b){
    int result = a - b;
    return result;
}
//multiply method
public int multiply(int a, int b){
    int result = a * b;
    return result;
}
//divide method
public int divide(int a, int b){
    int result = a / b;
    return result;
}
//modulo method
public int modulo(int a, int b){
    int result = a % b;
    return result;
}
//main method
public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    int addResult = myCalculator.add(5,7);
    int subtractResult = myCalculator.subtract(45,11);
    System.out.println("O resultado da adição é: " + addResult);
    System.out.println("O resultado da subtração é: " + subtractResult);
}
}