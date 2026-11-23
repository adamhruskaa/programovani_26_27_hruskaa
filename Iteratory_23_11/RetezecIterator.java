import java.util.NoSuchElementException;

public class RetezecIterator {
    private MujRetezec mujRetezec;
    private int currentIndex = 0;

    public RetezecIterator(MujRetezec mujRetezec) {
        this.mujRetezec = mujRetezec;
    }

    public boolean hasNext() {
        String str = mujRetezec.getStr();
        return str != null && currentIndex < str.length();
    }

    public char next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Konec řetězce.");
        }
        String str = mujRetezec.getStr();
        return str.charAt(currentIndex++);
    }
}