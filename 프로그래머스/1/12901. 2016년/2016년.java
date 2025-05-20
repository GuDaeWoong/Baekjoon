import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class Solution {
    public String solution(int a, int b) {
        int year = 2016;
        LocalDate date = LocalDate.of(year, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US);
        return dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
    }
}