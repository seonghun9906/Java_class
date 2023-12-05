package ch06_for;

public class Ex04_ForEx {
    public static void main(String[] args) {
        // 1부터 10까지의 합계를 아래와 같이 출력
//         1+2+3+4+5+...10 = 55

        int i = 0;
        int sum = 0;


        for (i = 1; i <= 10; i++) {
            sum = sum + i;
            if (i < 10) {
                System.out.print(i + "+");

            } else {
                System.out.print(i + "=");
            }
        }System.out.print(sum);
    }


}

