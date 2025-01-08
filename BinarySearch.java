public class BinarySearch {
    public static int search(String key, String[] a) {
        return search(key, a, 0, a.lenght);
    }

    public static int search(String key, String[] a, int lo, int hi) {
        if (hi <= lo) {
            return -1;
        }
        int mid = lo + (hi + lo) / 2;
        int cmp = a[mid].compareTo(key);
        if (cmp > 0) {
            return search(key, a, lo, hi);
        }
        else if (cmp < 0) {
            return search(key, a, lo, hi);
        }
        else return mid;
    }

    public static void main(String[] args) {
        String[] writers = {
                "Abay", "Orwell", "Marakami", "Snowden", "Gogol",
                "King", "Kristi", "Rand", "Dreiser"
        };
        int index = search(args[0], writers);
        System.out.println(args[0] + " is at position: " + index);
    }
}
