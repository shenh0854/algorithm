import java.util.Arrays;
import java.util.Random;
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
    public static void print_the_array(int[][] x){
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
    public static void main(String[] args){
            int[][] a = initial(3,5);
            print_the_array(a);
            int[][] a_transfer = change(a);
            print_the_array(a_transfer);

            int[] b = new int[10];               //Chapter1 1.1.12
            for (int i=0;i<10;i++){
               b[i] = 9-i;
                System.out.print(b[i]);
            }
            for (int i=0;i<10;i++){
                b[i] = b[b[i]];
                System.out.print(b[i]);
            }
            for (int i=0;i<10;i++){
                System.out.print(b[i]);
            }
    }

}
