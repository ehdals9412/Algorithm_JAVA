package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 - 6
public class BOJ_2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=N; i>0; i--) {
            for(int j=N; j>i; j--) {
                System.out.print(" ");
            }
            for(int k=0; k<(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
