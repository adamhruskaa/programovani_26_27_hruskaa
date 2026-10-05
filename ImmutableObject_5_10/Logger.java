package ImmutableObject_5_10;

import java.time.format.DateTimeFormatter;

public final class Logger {

    private Logger() {
    }

    private static final class Holder {
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance() {
        return Holder.INSTANCE;
    }

    public void debug(String message) {
        System.out.println(message);
    }

    private int n;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public void debug(String message, int n) {
        this.n = n;
        System.out.println("[" + formatter.format(java.time.LocalDateTime.now()) + "] " + message + " (n=" + n + ")");
    }
}