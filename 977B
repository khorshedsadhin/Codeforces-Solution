import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
*/

public class CompetitiveProgramming {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int n = fs.nextInt();
        int[] count = new int[n-1];
        int[] copy = new int[n-1];
        String[] temp = new String[n-1];

        String str = fs.next();


        for (int i = 0; i < (n-1); i++) {
            temp[i] = str.substring(i,i+2);

            for (int j = i+1; j < (n-1); j++) {
                if (temp[i].equals(str.substring(j,j+2))) {
                    count[i]++;
                    copy[i] = count[i];
                }
            }
        }

        sort(copy);
        int idx = getIndex(copy,count,n-1);

        out.println(temp[idx]);
        
        out.flush();
    }

    public static int getIndex(int[] copy, int[] count, int n) {
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (copy[n-1] == count[i]) {
                return i;
            }
        }

        return idx;
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

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }
    public static void sort(int[] arr) {
        /*
        Arrays.sort uses quicksort which is dumb
        Collection.sort uses mergesort -> O(nlog n)
        */
        ArrayList<Integer> al = new ArrayList<>();
        for (int x : arr) {
            al.add(x);
        }
        Collections.sort(al);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = al.get(i);
        }
    }
    public static void ReverseSort(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int x : arr) {
            al.add(x);
        }
        Collections.sort(al, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = al.get(i);
        }
    }
}
