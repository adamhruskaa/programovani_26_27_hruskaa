public class Main {
    static void main(String[] args) {
        ArrayList<Jidlo> jidla = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(;;) {
            String jmeno = scanner.nextLine();
            if(jmeno.equals("konec")) {
                break;
            }

            Jidlo j = TovarnaNaJidlo.vyrobJidlo(jmemoJidla);
            jidla.add(j);
        }

        for(Jidlo j : jidla) {
            System.out.println(j.vyrobTO());
        }
}
}