package tasks;

public class Array {
    public static void main(String[] args) {

        int[] arr =new int[]
                {11, 22, 33, 44 ,55};


        reverse(arr);

    }

    public static void reverse(int[] arr) {
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] +" ");
        }
    }
}
