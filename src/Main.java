import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator kalkulator1= new Calculator();
        System.out.println(kalkulator1.addition(4,6));
        System.out.println(kalkulator1.subtracion(8,4));
        System.out.println(kalkulator1.multiplication(5,6));
        System.out.println(kalkulator1.division(30,5));
    }
}