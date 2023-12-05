package ch06_for;

public class Ex11_ForEx {
    public static void main(String[] args) {
        /**
         * 별찍기
         * 출력
         * *
         * **
         * ***
         * ****
         * *****
         * ...
         */

        int i = 0;

        for (i = 0; i <= 10; i++) { //줄수 , 별을 출력할 횟수
            for (int j = 0; j <= i; j++) { // 별을 줄수만큼 출력
                System.out.print("*");
            }
            System.out.println(); // 줄을 바꾸기 위한 용도


        }

    }
}

