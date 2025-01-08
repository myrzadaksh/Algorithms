public class MergeSort {

    public static void merge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] lArray = new int[n1];
        int[] rArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            lArray[i] = a[l + i];
        }

        for (int i = 0; i < n2; i++) {
            rArray[i] = a[m + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = l;
        while (i != n1 && j != n2) {
            if (lArray[i] > rArray[j]) {
                a[k] = lArray[i];
                i++;
            }
            else {
                a[k] = rArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = lArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = rArray[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(a, l, m);
            sort(a, m + 1, r);
            merge(a, l, m, r);
        }

    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 6, 8, 4, 2, 9 };
        sort(a, 0, a.length - 1);
        print(a);
    }
}
