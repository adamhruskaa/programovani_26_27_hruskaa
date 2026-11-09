public class TovarnaNaJidlo {
    public static Jidlo vyrobJidlo(String jmeno) {
        switch (jmeno) {
            case "caj":
                return new Caj();
            case "pivo":
                return new Pivo();
            default:
                throw new IllegalArgumentException("Neznámé jídlo: " + jmeno);
        }
    }
}
