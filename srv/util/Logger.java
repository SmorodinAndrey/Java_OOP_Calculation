package srv.util;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static final String LOG_FILE = "log.txt";

    public static void log(String message) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(message + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Сообщение о регистрации ошибки: " + e.getMessage());
        }
    }
}