package ch07_while;

public class Ex07_WhileEx {
    public static void main(String[] args) {
        /**
         * 1+ (-2) + 3 + (-4) + 5 ~~~
         * 처럼 계산을 했을 때 합계가 100이 됐을 떄의 숫자를 출력
         * 정답 : 199
         */


        //합계용 변수
        int sum = 0;
        // 1,2,3,4,5,~~
        int count = 1;
        //1,-2,3, -4 ...
        int num = 0;
//        부호용 변수
        int s = 1;
        boolean run = true;
        while (run) {
            sum += num;
            if (sum >= 100) {
                run = false;
            } else {
                num = s * count;
                s = -s; // 1,-1,1,-1 ...
                count++;
//                System.out.println("num, s, count" + num + s + count);
            }
        }
        System.out.println("num = " + num);
    }
}





//        int i = 0;
//        int j = 0;
//        int sum = 0;
//        int sum1 = 0;
//        boolean run = true;
//
//
//        while (run) {
//            j--;
//            i++;
//            if (i % 2 == 1) {
//                sum += i;
////                System.out.println(i);
//            } else if (j % 2 == 0) {
//                sum1 += j;
////                System.out.println(j);
//            }
//            if (sum + sum1 == 100) {
//                run = false;
//            }
//            int num2 = (sum+sum1);
//            System.out.println(num2);
//
//        }
//
//
//    }
//}
