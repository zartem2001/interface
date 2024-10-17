import java.time.LocalDateTime;

public class SimpleLogger implements Logger {
    private int count;

    @Override
    public void log(String msg) {
        String type = "INFO";
        if (msg.toLowerCase().contains("error")) {
            type = "ERROR";
        }
        LocalDateTime now = LocalDateTime.now();
        String formatCount = String.format("%02d", ++count);
        System.out.println(type + "#" + formatCount + " [" + now + "]" + msg);
    }
}
