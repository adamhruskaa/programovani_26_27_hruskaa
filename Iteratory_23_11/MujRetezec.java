public class MujRetezec {
    private String str;

    public MujRetezec(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public RetezecIterator dejIterator() {
        return new RetezecIterator(this);
    }
}