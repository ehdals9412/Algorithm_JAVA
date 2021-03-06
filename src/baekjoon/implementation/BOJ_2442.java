package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 - 5
public class BOJ_2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            for(int j=i; j<N-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<(2*(i+1) -1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
