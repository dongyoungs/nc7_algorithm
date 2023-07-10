package Members.Holy.Week6;

import java.io.*;
import java.util.*;

public class BOJ_11659 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] S = new int[N + 1];
        for (int i=1; i< N+1; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int i=0; i< M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(S[B] - S[A-1]);
        }

    }
}
