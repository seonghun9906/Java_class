package ch09_array;

import java.util.Scanner;

public class Ex05_ArrayEx {
    public static void main(String[] args) {
        /**
         *  거스름돈 계산하기
         *  필요한 거스름돈을 입력했을 때 각 동전별로 몇 개가 필요한지 계싼
         *  예)
         *      170 이라고 입력하면
         *      100원 1개
         *      50원 1개
         *      10원 2개
         *
         *      780 이라고 입력하면
         *      500원 1개
         *      100원 2개
         *      50원 1개
         *      10원 3개
         *
         */
        Scanner sc = new Scanner(System.in);
        int[] coin = {500, 100, 50, 10};
//        int [] count = new int [4];


        int exchange = sc.nextInt();
        for (int i = 0; i < coin.length; i++) {
//            count[i] = exchange/coin[i];
            int count = exchange/coin[i];
            exchange = exchange%coin[i];
            System.out.println(coin[i] + " 원" + "   "+ count+ " 개" );
        }

        }

    }

