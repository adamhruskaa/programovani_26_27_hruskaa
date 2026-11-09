public class Pivo implements Jidlo {
    String velikost;

    @Override
    public int dejCenu() {
        return 30;
    }

    @Override
    public String vyrobTO() {
        return "Pivo";
    }

    @Override
    public int velikost() {
        if(velikost = "maly") {
            return dejCenu(60)

        } else if (velikost = "velky") {
            return dejCenu(90)

        } else if (velikost = "tuplak") {
            return dejCenu(120)
    }
}
}
