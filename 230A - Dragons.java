import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/*
 */

public class Codeforces {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int s = fs.nextInt();
        int n = fs.nextInt();

        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++) {
            for(int j=0; j<2; j++) {
                arr[i][j] = fs.nextInt();
            }
        }
        sortByColumn(arr,0);

        int count = 0;
        for(int i=0; i<n; i++) {
            if(s <= arr[i][0]) {
                count++;
                continue;
            }

            s += arr[i][1];
        }

        if(count != 0) out.println("NO");
        else out.println("YES");

        out.flush();
    }

    public static void sortByColumn(int[][] arr, int col) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[col] > o2[col])
                    return 1;
                else
                    return -1;
            }
        });
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
