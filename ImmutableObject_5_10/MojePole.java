package ImmutableObject_5_10;

public class MojePole {
    String [] arr = new String[10];

    Logger log = Logger.getInstance();

    public void add(String str) {
        log.debug("Adding" + str);
    }

    public String get(int index) {
        log.debug("Getting" + index);
        return arr[index];
    }

    public static void main(String[] args) {
        MojePole mojePole = new MojePole();
        mojePole.add("Hello");
        String value = mojePole.get(0);
    }
}
