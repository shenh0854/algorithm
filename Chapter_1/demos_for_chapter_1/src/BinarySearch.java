import java.util.Arrays;
import java.io.BufferedReader;    
import java.io.IOException;    
import java.io.InputStreamReader;
import java.util.Scanner;

public class BinarySearch {
	 public BinarySearch() {

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

        Scanner x=new Scanner(System.in);
        System.out.println("please input your array:");
        String inputString=x.next().toString();
        String stringArray[]=inputString.split(",");
        int num[]=new int[stringArray.length];
        for(int i=0;i<stringArray.length;i++) {
            num[i] = Integer.parseInt(stringArray[i]);
            System.out.print(num[i] + " ");
        }
        System.out.println();
        Scanner k=new Scanner(System.in);
        System.out.println("please input your key for binarysearch:");
        String inputkey=k.next().toString();
        int key_num =  Integer.parseInt(inputkey);
        Arrays.sort(num);
        if (BinarySearch.indexOf(num, key_num) != -1){
            System.out.println(key_num);
        }
    }
}
