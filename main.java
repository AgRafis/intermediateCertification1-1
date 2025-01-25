import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
        Calendar wateringDate = new GregorianCalendar();

        System.out.println("Введите дату последнего полива в формате - 1 января 2023:");

        String s = sc.nextLine();

        wateringDate.setTime(dateFormat.parse(s));
        watering.SetNextWateringDate(wateringDate);

        sc.close();
    }
}
