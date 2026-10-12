package ImmutableObject_5_10;

import java.util.Collections;
import java.util.List;

public class MujUzivatel {
    private final int id;
    private final String jmeno;
    private final List<String> role;

    public MujUzivatel(int id, String jmeno, List<String> role) {
            this.id = id;
            this.jmeno = jmeno;
            this.role = Collections.unmodifiableList(role);
    }

    public int getId() {
        return id;
    }

    public String getJmeno() {
        return jmeno;
    }

    public List<String> getRole() {
        return role;
    }
}
