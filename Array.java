// import java.util.ArrayList;
// import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] myintarray = { 1, 2, 3, 4, 5 };
        // myintarray = Arrays.copyOf(myintarray, myintarray.length + 2);
        // myintarray[myintarray.length - 3] = 10;
        // myintarray[myintarray.length - 2] = 6;
        // myintarray[myintarray.length - 1] = 7;
        // myintarray = Arrays.copyOf(myintarray, myintarray.length - 5);

        // System.out.println(Arrays.toString(myintarray));

        int[] myintarray2 = { 2, 1, 121 };
        for (int i = 0; i < myintarray.length; i++) {
            for (int j = 0; j < myintarray2.length; j++) {
                if (myintarray[i] == myintarray2[j]) {
                    myintarray[i] = 0;
                }
            }
        }
        for (int i = 0; i < myintarray.length; i++) {
            if (myintarray[i] != 0)
                System.out.println(myintarray[i]);
        }

    }

}
