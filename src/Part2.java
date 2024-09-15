/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Part2 {
    public static void main(String[] args){
        float n1, n2;
        String op;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number 1: ");
        n1 = sc.nextFloat();
        System.out.print("Enter the number 2: ");
        n2 = sc.nextFloat();
        System.out.print("Enter the operator: ");
        op = sc.next();
        switch (op) {
            case "+":
                System.out.println("The result of " + n1 + " " + op + " " + n2 + " = " + (n1 + n2));
                break;
            case "-":
                System.out.println("The result of " + n1 + " " + op + " " + n2 + " = " + (n1 - n2));
                break;
            case "*":
                System.out.println("The result of " + n1 + " " + op + " " + n2 + " = " + (n1 * n2));
                break;
            case "/":
                if (n2 != 0) {
                    System.out.println("The result of " + n1 + " " + op + " " + n2 + " = " + (n1 / n2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use one of +, -, *, /.");
                break;
        }
        sc.close();
    }
}
