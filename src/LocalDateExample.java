import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 1, 1);
        LocalDate today = LocalDate.now();

        // if (date.getDayOfWeek() == java.time.DayOfWeek.MONDAY) {
        //     System.out.println("It's Monday!");
        // }
        
        // if (date.getMonth() == java.time.Month.JANUARY) {
        //     System.out.println("It's January!");
        // }

        System.out.println("Today is : " + today);
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day of Month: " + date.getDayOfMonth());
        System.out.println("Day of Year: " + date.getDayOfYear());
        System.out.println("Day of Week: " + date.getDayOfWeek());
        System.out.println("Is Leap Year? " + date.isLeapYear());
        System.out.println("Days since Epoch: " + date.toEpochDay());
        System.out.println("Formatted Date: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
