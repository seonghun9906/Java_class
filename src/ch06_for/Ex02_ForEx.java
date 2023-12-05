package ch06_for;

public class Ex02_ForEx {
    public static void main(String[] args) {
        // 1~10 까지 순서대로 출력

        //2 4 6 8 10 출력

        //5 4 3 2 1 출력

        int i = 0;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int j = 0;
        for (j = 2; j <= 10; j += 2) {
            System.out.println(j);
        }

        int a = 0;
        for (a = 5; a > 0; a--) {
            System.out.println(a);
        }


    }
}
