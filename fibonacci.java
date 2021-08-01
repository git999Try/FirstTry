import java.io.*;
import java.util.*;

public class fibonacci{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int ans = fib(n,new int[n+1]);
    System.out.println(ans);
    System.out.println("thank you");
 }
public static int fib(int n ,int[]arr){
    if(n ==0||n == 1){
        return n;
    }
    if(arr[n]!=0){
        return arr[n];
    }
    int fib1 = fib(n-1,arr);
    int fib2 = fib(n-2,arr);
    int ans = fib1+fib2;
    arr[n] = ans;
    return ans;
}
}