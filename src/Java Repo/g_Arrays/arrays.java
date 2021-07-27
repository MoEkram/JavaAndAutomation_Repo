package g_Arrays;

// Array = is object, you need to declare it & then create it
//          ex: int[] arr;         << with no size  ( declaration )
//          ex: arr = new int[10]  << with size 10  ( Intialization )
//          arr.length  << to get the size
//  Java arrays are 0 based.


public class arrays {

    public static void main ( String[] args){

        int[] arr;                 // << way 1
        arr = new int [10];

        int[] arr2 = new int[5];   // << way 2

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8};    // << way 3


        System.out.println(arr.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);


    }
}
