import java.util.Arrays;
import java.util.Random;
import java.io.*;
import java.io.IOException;
import java.lang.*;


public class Demo_1_1_11 {
    public Demo_1_1_11(){

    }
    private static int[][]  initial(int a,int b){       //Chapter 1 1.1.11
        int[][] myArray = new int[a][b];
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                double r = Math.random();
                if (r>0.5){
                    myArray[i][j] = 1;
                }
                else {
                    myArray[i][j] = 0;
                }
            }
        }
        return myArray;
    }
    public static void print_the_array(int[] x){      //print 1d array
        for (int i=0;i<x.length;i++) {
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
    public static void print_the_2_array(int[][] x){   // print 2d array
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] change(int[][] x){       //Chapter1 1.1.13
        int [][]a = new int[x[0].length][x.length];
        for (int i=0;i<x[0].length;i++){
            for (int j=0;j<x.length;j++){
                a[i][j] = x[j][i];
            }
        }
       return a;
    }
    public static int[] histogram(int[] a,int M){     //Chapter1 1.1.15
        int[] b = new int[M];

        for (int i=0;i<M;i++){
            int temp = 0;
            for (int j=0;j<a.length;j++){
                if (i == a[j]){
                    temp += 1;
                    b[i] = temp;
                }
            }
        }
        return b;
    }
    public static String exR1(int n){            //Chapter1 1.1.16
        if (n<=0){return "";}
        return exR1(n-3)+n+exR1(n-2)+n;
    }
    public static int[] ordering(int[] a){         //ordering_1
        int[] b = new int[a.length];
        for (int i=0;i<a.length-1;i++) {
            for (int j=0;j<a.length-i-1;j++) {
                if (a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }    
            }  
        }
        b = a;
        return b;
    }
    public static int Euclid(int a,int b){          
        
        if (a<b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while(a%b!=0){
            int r = a % b; 
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
    public static void main(String[] args){
//            int[][] a = initial(3,5);
//            print_the_array(a);
//            int[][] a_transfer = change(a);
//            print_the_array(a_transfer);
//
//            int[] b = new int[10];               //Chapter1 1.1.12
//            for (int i=0;i<10;i++){
//               b[i] = 9-i;
//                System.out.print(b[i]);,"encoding":"cp1252"
//            }
//            for (int i=0;i<10;i++){
//                b[i] = b[b[i]];
//                System.out.print(b[i]);
//            }
//            for (int i=0;i<10;i++){
//                System.out.print(b[i]);
//            }
//        int[] p;
//        int[] a = {3,0,2,6,1,98,166};
//        print_the_array(a);
//        int[] b = ordering(a);
//        print_the_array(b);
//        int num = Euclid(12,9);
//        System.out.println(num);
//        int x = 1111111;
//        int y = 1234567;
//        int result = Euclid(x,y);
//        System.out.println(result);
        // System.out.println(a[0]);
        // int M = 5;
        // int[] b = histogram(a,M);
        // for (int i=0;i<b.length;i++){
        //     System.out.print(b[i]);
        // }
        // System.out.println();
        // System.out.print(exR1(6));
        int[] a = new int[6];
        print_the_array(a);
        String s = StdIn.readLine();

    }


}
