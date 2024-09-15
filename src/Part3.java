/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.Arrays;
import java.util.Scanner;
public class Part3 {
    public static void main(String[] args){
        String[] list = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++){
            System.out.print("Enter the name: ");
            list[i] = sc.nextLine();
        }
        for (int i = 0; i < list.length; i++){
            list[i] = list[i].toUpperCase();
        }
        sc.close();
        System.out.println("The result: "+Arrays.toString(list));
    }
}