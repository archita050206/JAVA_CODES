import java.util.*;

interface DaysCalculator{
    int calculateDays(int []date1, int []date2);
}
class DaysCalculatorImpl{
public static DaysCalculator createCalculator() {
    return new DaysCalculator() { 
        public int calculateDays(int[] date1, int[] date2) {
            
            //     LocalDate d1 = LocalDate.of(date1[0], date1[1], date1[2]);
            //     LocalDate d2 = LocalDate.of(date2[0], date2[1], date2[2]);
            //     return (int) Math.abs(d2.toEpochDay() - d1.toEpochDay());


            int days1 = date1[0] * 365 + date1[1] * 30 + date1[2]; 
            int days2 = date2[0] * 365 + date2[1] * 30 + date2[2];

            int smallerYear = Math.min(date1[0], date2[0]); 
            int largerYear = Math.max(date1[0], date2[0]);

            for (int year = smallerYear; year < largerYear; year++) { 
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    if (date1[0] > date2[0]) {
                        days1++;
                        // If date1 is in a leap year, but date2 is not
                    } else {
                        days2++; // Adding an extra day for leap years
                    }
                }
            }
            return Math.abs(days2 - days1);
        }
    };
}
}
public class DaysBetween{
    public static void main(String[] args) {
        DaysCalculator calculator = DaysCalculatorImpl.createCalculator();

        int[] d1 = {2023, 1, 1};
        int[] d2 = {2023, 12, 31};

        int days = calculator.calculateDays(d1, d2);
        System.out.println("Days Difference: " + days);
    }
}