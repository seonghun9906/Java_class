package ch09_array;

import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int i = 0;
        double avg = 0;
        int sum = 0;
        int bigScore = 0;
        int[] a = null;
        boolean run = true;
        /**
         * nextLine 은 엔터키가 2번실행이 될 수 있어 next를 쓴다
         * 근데 예제에 띄어쓰기가 있다면 NextLine을 작성하고 또 스캐너 nextLine을 만들어 공백을 만들어준다.
         */

        while (run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택 > ");
            String num = sc.next();

            if (num.equals("1") || num.equals("학생수입력")) {
                System.out.print("학생수 > ");
                int student = sc.nextInt();
                a = new int[student];
            } else if (num.equals("2") || num.equals("점수입력")) {
                for (i = 0; i < a.length; i++) {
                    System.out.print((i + 1) + "번 학생 점수 : ");
                    a[i] = sc.nextInt(); //입력받은 값을 배열에 저장하는 과정
                }
            } else if (num.equals("3") || num.equals("점수목록")) {
                for (i = 0; i < a.length; i++) {
                    System.out.println((i + 1) + "번 학생 점수 : " + (a[i]));
                }
            } else if (num.equals("4") || num.equals("분석")) {
                for (i = 0; i < a.length; i++) {
                    if (a[i] > bigScore) {
                        bigScore = a[i];
                    }
                }
                System.out.println("최고점수 : " + bigScore);
                for (i = 0; i < a.length; i++) {
                    sum += a[i];
                    avg = (double) sum / a.length;
                }
                System.out.println("평균점수 : " + avg);
                // 내림차순 정렬 만들기
                int temp = 0;
                for (i = 0; i < a.length; i++) {
                    for (int j = 1; j < a.length; j++) {
                        if (a[i] < a[j]) {
                            temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                    }
                    for (i = 0; i < a.length; i++) {
                        System.out.println((i + 1) + "등: " + a[i]);
                    }
                }
            } else if (num.equals("5") || num.equals("종료")) {
                run = false;
            }
        }
    }
}




