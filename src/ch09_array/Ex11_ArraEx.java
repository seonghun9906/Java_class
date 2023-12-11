package ch09_array;

public class Ex11_ArraEx {
    public static void main(String[] args) {
        int[][][] array = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };
        int count = 0;
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k <array[i][j].length ; k++) {
                    sum += array[i][j][k];
                    count++;
                    avg = (double) sum/count;
                }
            }
        }
        System.out.println(sum);
        System.out.println(avg);

    }
}
