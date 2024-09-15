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
public class Part1 {
    public static void main(String[] args){
        int rows;
        int cols;
        int mat[][];
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();
        mat = new int[rows][cols];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print("\nMat["+i+"]["+j+"]= ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix inputed: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.format("%3d", mat[i][j]);
            }
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                sum += mat[i][j];
            }
        }
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+ (float)sum/(rows * cols));
    }
}
