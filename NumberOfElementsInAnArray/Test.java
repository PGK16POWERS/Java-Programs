package NumberOfElementsInAnArray;

public class Test {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int count = 0, i = 0, n;

        try {

            while(a[i] != 'a') {
                count++;
                i++;
            }
            
        } catch (Exception e) {
            System.out.print("Error was excountered: " + e);
        }

        n = a.length;

        System.out.print("The length of the array is: " + n);
    }
}