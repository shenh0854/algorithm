import java.util.Arrays;
import java.io.BufferedReader;    
import java.io.IOException;    
import java.io.InputStreamReader;
import java.util.Scanner;

public class BinarySearch {
	 private BinarySearch() { 

	 }
	 public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static int rank(int key, int[] a) {
        return indexOf(a, key);
    }
    public static void main(String[] args) {

        // read the integers from a file
        Scanner x=new Scanner(System.in);
        while(x.hasNext()){
        int m=x.nextInt();
         //System.out.println(m);
        int[] number=new int[m];
        for(int i=0;i<m;i++){
             number[i]=x.nextInt();
        }
        // Arrays.sort(number);
        System.out.println(Arrays.toString(number));
     	}
     	
        // int[] whitelist = ;

        // // sort the array
        // Arrays.sort(whitelist);

        // // read integer key from standard input; print if not in whitelist
        // while (!StdIn.isEmpty()) {
        //     int key = StdIn.readInt();
        //     if (BinarySearch.indexOf(whitelist, key) == -1)
        //         System.out.println(key);
        // }
    }
}
