package CUstomer_M_P;

public class ArrayDemo {
    public static void userArrayCopy() {
        int [] source = {1,2,3,4,5};
        int [] dest = new int [source.length];
        System.arraycopy(source, 0, dest, 0, source.length);
        System.out.println(dest);
    }
    public static void main(String[] args) {
        int[] arr = {25, 0, 2, 4, 6, 8, 10};
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        System.out.println("Max Element = " + maxVal);
    }
}
