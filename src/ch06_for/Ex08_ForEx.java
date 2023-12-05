package ch06_for;

public class Ex08_ForEx {
    public static void main(String[] args) {


        for(int i = 2; i<10; i++) {
            System.out.println();
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + " ");


            }

        }

    }
}
