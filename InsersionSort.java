public class InsersionSort {
    public static void swap(int[] a, int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

    public static void insersionSort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j - 1, j);
                }
                else break;
            }
        }
    }

    // n = 10 -> 0(n^2) = 100 -> little tile
    // n = 1000000 -> 10^12 -> 1000 second, it will take more time that 100 operations and we should reduce the speed of algorithms


    public static void main(String[] args) {
        int[] a = { 1, 4, 5, 6, 2, 2, 4, 6, 2, 4 };
        insersionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
