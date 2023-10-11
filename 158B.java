import java.util.*;
import java.lang.*;
import java.io.*;

/*
 */

public class CompetitiveProgramming {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int n = fs.nextInt();
        int arr[] = fs.readArray(n);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            if(arr[i] == 4) {
                if(map.containsKey(4))
                    map.put(4, map.get(4) + 1);
                else
                    map.put(4,1);
            }
            else {
                if(map.containsKey(4-arr[i])) {
                    if(map.containsKey(4))
                        map.put(4, map.get(4) + 1);
                    else
                        map.put(4,1);
                    map.put(4-arr[i], map.get(4- arr[i]) -1);
                    if(map.get(4-arr[i]) == 0)
                        map.remove(4-arr[i]);
                }
                else {
                    if(map.containsKey(arr[i]))
                        map.put(arr[i], map.get(arr[i]) + 1);
                    else
                        map.put(arr[i],1);
                }
            }
        }

        int count = 0;
        if(map.containsKey(4))
            count += map.get(4);
        if(map.containsKey(3))
            count += map.get(3);

        if(map.containsKey(2)) {
            count += 1;
            if(map.containsKey(1)) {
                if(map.get(1)>=2)
                    map.put(1, map.get(1) -2);
                else
                    map.put(1, map.get(1) -1);
            }
        }
        if(map.containsKey(1)) {
                while (map.get(1)>=4){
                    count +=1;
                    map.put(1, map.get(1) -4);
                }
                if(map.get(1) != 0)
                    count += 1;
        }

        out.println(count);

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
}
