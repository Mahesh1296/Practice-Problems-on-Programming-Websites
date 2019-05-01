import java.util.*; 
import java.time.*; 
import java.time.format.DateTimeFormatter; 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public final class Main {

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
      
       HashMap<String, Integer> hm = new HashMap<>();
       hm.put("21", 3);
       hm.put("12", 3);
       hm.put("13", 4);
       hm.put("31", 4);
       HashSet<String> hs = new HashSet<String>();
       hs.add("23");
       hs.add("32");
       int sum = 0;
       int flag = 1;
      int n = s.nextInt();
      int prev = s.nextInt();
      String prevstr = "";
      for(int i = 2; i<=n ;i++){
        int cur = s.nextInt();
        String str = prev + "" + cur;
        if(hs.contains(str)) {
          flag = 0;
          break;
        }
        else {
          if(str.equals("12") && prevstr.equals("31")){
            sum = sum + 2;
          }
          else {
            sum = sum + (int)hm.get(str);
          }
        }
        prev = cur;
        prevstr = str;
      }

      if(flag == 1){
        System.out.println("Finite");
        System.out.println(sum);  
      }
      else {
        System.out.println("Infinite");
      }
  }    

  
}