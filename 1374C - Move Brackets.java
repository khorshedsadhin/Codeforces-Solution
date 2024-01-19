import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Stack;

/*
    ())()()(
*/

public class CompetitiveProgramming {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int t = fs.nextInt();
        
        while (t-- > 0) {
            
            int n = fs.nextInt();
            StringBuilder sb = new StringBuilder(fs.next());
            Stack<Character> stack = new Stack<>();

            int count = 0;
            
            for (int i = 0; i < n; i++) {

                if (sb.charAt(i) == '(') {
                    stack.push('(');
                }

                else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }

                    else {
                        count++;
                    }
                }

            }

            out.println(count);

        }

        
        out.flush();
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
