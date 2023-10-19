public class Main {
    public static void main(String[] args) {

        int[] array1 = new int[]{1, 2, 2, 3, 4, 6, 4, 3};

        myMethod1(array1);
    }


    public static void myMethod1(int[] array1) {


        int odd = 0;
        int even = 0;

        for (int i = 0; i < array1.length; i++) {


            int k = array1[i] % 2;
            if (k == 1) {
                odd = odd + array1[i];
            } else {
                even = even + array1[i];
            }


        }

        System.out.println("Cумма четных " + even);
        System.out.println("Cумма нечетных " + odd);


    }
}

