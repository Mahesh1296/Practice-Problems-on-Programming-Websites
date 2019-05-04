import java.util.*; 
import java.time.*; 
import java.time.format.DateTimeFormatter; 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Main {

  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
  
  // static int DIR[][] = {{-1, 0}, {1,0}, {0, -1} , {0,1}};
  
  static long mod = 1000000007;
  static StringBuilder sb = new StringBuilder();
  // static BigInteger MOD = new BigInteger("1000000007");
  static int findminind(int a[], int l, int h) {

    int minind = h;
    int min = a[h];
    for(int i = h;i>=l;i--){
      if(a[i] < min) {
        min = a[i];
        minind = i;
      }  
    }
    return minind;
  }


  static long half(int a[]) {

    long sum = 0;
    for(int i = 0; i<a.length;i++) {
      a[i] = a[i]/2;
      sum += a[i];
    }
    return sum;
  }

  static void printArray(int a[]) {

    System.out.println("ppppp");
    for(int i = 0; i<a.length;i++) {
      System.out.print(a[i] + " ");
    }

  }
  static long cnt = 0;

  static void hr(int i, int j, char arr[][]) {
    //System.out.println("hr");
    if(arr[i][j+1] == 'a' && arr[i][j+2] == 'b' &&
      arr[i][j+3] == 'a' ) {
        cnt++;
    }
  }
  static void vd(int i, int j, char arr[][]) {
    //System.out.println("vd");
    if(arr[i+1][j] == 'a' && arr[i+2][j] == 'b' &&
      arr[i+3][j] == 'a' ) {
        cnt++;
    }
  }

  static void drd(int i, int j, char arr[][]) {
    //System.out.println("drd");
    if(arr[i+1][j+1] == 'a' && arr[i+2][j+2] == 'b' &&
      arr[i+3][j+3] == 'a' ) {
        cnt++;
    }
  }

  static void dru(int i, int j, char arr[][]) {
    
    if(arr[i-1][j+1] == 'a' && arr[i-2][j+2] == 'b' &&
      arr[i-3][j+3] == 'a' ) {
        cnt++;
    }
  }


  public static void main(String[] args) throws Exception  {      

      FastReader s = new FastReader();
      
       //HashMap<Character, Integer> hm = new HashMap<>();
      int max = Integer.MIN_VALUE; 
      int t = s.nextInt();
      int a[] = new int[t]; 
      for(int i = 0; i<t ;i++){
        a[i] = s.nextInt();
        max = Math.max(max, a[i]);
      }
      

      long ar[] = new long[max+1];
      ar[1] = 1;
      for(int i = 2; i<=max ;i++){
      ar[i] = ((ar[i-1]+ i)%mod + (ar[i-1] * i)%mod)%mod;
      }

       
      for(int i = 0; i<t ;i++){
        System.out.println(ar[a[i]]);  
      }

      //System.out.println(sum);
      
  }    

  
}
