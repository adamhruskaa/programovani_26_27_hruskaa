package Iterator_19_10;

public class MyIterator {
    private final String[] arr;
    private int index = 0;

    public MyIterator(String[] arr) {
        this.arr = arr;
    }

    public boolean hasNext() {
        return index < arr.length;
    }

    public String next() {
        return arr[index++];
    }

    public static void main(String[] args) {
        String[] data = {"A", "B", "C", "D"};
        MyIterator iterator = new MyIterator(data);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}