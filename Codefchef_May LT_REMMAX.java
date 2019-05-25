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

  static void printArray(char a[]) {

    // System.out.println("ppppp");
    for(int i = 0; i<a.length;i++) {
      System.out.print(a[i]);
    }
    System.out.println();
  }


   static void swap(int b[], int j) {
    int t = b[j];
    b[j] = b[j+1];
    b[j+1] = t;
  }
  


  public static void main(String[] args) throws Exception  {    
    FastReader s = new FastReader();
      int t = s.nextInt();
      while(t--> 0) {
        String str = s.nextLine();
        int n = str.length();
        char arr[] = str.toCharArray();
        




        int pos = -1;
        if ((arr[0]- '0') > 1) {
          pos  = 0;
        }
        else {
          for(int i = 1; i<n;i++) {
            if ((arr[i] - '0') > 0) {
              pos = i;
              break;
            } 
          }
        }
          if (pos == -1) {
             for(int i = n - 1 ; i>0;i--) {
               arr[i] = '9';
             }
             for(int i = 1; i<n;i++) {
              System.out.print(arr[i]);
              
             }
             System.out.println();         
          }
          else {

              if (pos == n-1) {
                 printArray(arr); 
              }
              else {
                int flag = 0;
                for(int i = n - 1 ; i>pos;i--) {
                  if (arr[i]  < '9') {
                    flag = 1;
                  }
                  arr[i] = '9';
                }
                if (flag == 1) {
                  arr[pos] = (char)(arr[pos] - 1);
                }
                printArray(arr); 
              }
              
         
        

          }
         

      }
  } 
}
