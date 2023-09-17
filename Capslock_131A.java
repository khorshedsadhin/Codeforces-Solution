import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.Arrays;

/*
 */

public class Capslock_131A {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        StringBuffer str = new StringBuffer(fs.next());
        if(check(str)) {
            for(int i=0; i<str.length(); i++) {
                if(Character.isUpperCase(str.charAt(i)))
                    str.setCharAt(i,Character.toLowerCase(str.charAt(i)));
                else
                    str.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            }
        }
        out.println(str);


        out.flush();
    }

    public static boolean check (StringBuffer str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)))
                count++;
        }

        if(count == str.length() || (count == str.length()-1 && Character.isLowerCase(str.charAt(0))))
            return true;
        return false;
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}