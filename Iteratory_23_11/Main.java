public class Main {
    public static void main(String[] args) {
        MujRetezec mujRetezec = new MujRetezec("Arabská");
        
        RetezecIterator it = mujRetezec.dejIterator();

        System.out.println("Demonstrace iterace přes řetězec \"Arabská\" (více tříd):");
        System.out.print("Písmena: ");
        
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}