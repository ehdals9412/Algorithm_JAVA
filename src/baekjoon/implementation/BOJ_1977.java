package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 완전제곱수
public class BOJ_1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int sum = 0;
        int i = 0;
        while((int) Math.pow(i,2) <= N) {
            if((int) Math.pow(i,2) >= M && (int) Math.pow(i,2) <= N) {
                pq.add((int) Math.pow(i,2));
                sum += (int) Math.pow(i,2);
            }
            i++;
        }

        if(pq.size() == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sum);
        System.out.println(pq.poll());
    }
}