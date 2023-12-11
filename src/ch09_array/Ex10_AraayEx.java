package ch09_array;

public class Ex10_AraayEx {
    public static void main(String[] args) {

        int array[] = {4, 3, 2, 1, 10, 8, 7, 6, 9, 5};

    int max = array[0];
    int min = array[0];

        //최댓값 최솟값 구하기

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
              max = array[i];
            }else if(min > array[i]){
                 min = array[i];
                }
            }
        System.out.println(min);
        System.out.println(max);
    }
    }

