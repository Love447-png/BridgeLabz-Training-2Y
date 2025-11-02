
// 3. Date Format Utility
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

public class DateFormatUtility {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(DateFormatter.formatDate(today, "dd-MM-yyyy"));
    }
}
