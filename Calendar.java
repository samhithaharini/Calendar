import java.util.Calendar;
import java.util.Scanner;

public class CalendarDisplay {
    private static void printMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1); 

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("\n" + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = calendar.get(Calendar.DAY_OF_WEEK);

        for (int i = 1; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay - 1) % 7 == 0) {
                System.out.println(); 
            }
        }
        System.out.println("\n");
    }

    private static void displayCalendar(int year) {
        for (int month = 0; month < 12; month++) {
            printMonth(year, month);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        displayCalendar(year);
        
        scanner.close();
    }
}
