import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class watering {
    static humidity humidity = new humidity();
    //SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
    Calendar wateringDate = new GregorianCalendar();

    public static void SetNextWateringDate (Calendar wateringDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");

        if (wateringDate.get(Calendar.MONTH) == 11 || wateringDate.get(Calendar.MONTH) <= 1) {
            wateringDate.add(Calendar.DAY_OF_MONTH, +30);
            System.out.println("Зима. Кактус нужно полить " + dateFormat.format(wateringDate.getTime()));
        }
        else if (wateringDate.get(Calendar.MONTH) >= 2 && wateringDate.get(Calendar.MONTH) <= 4 ||
                wateringDate.get(Calendar.MONTH) >= 8 && wateringDate.get(Calendar.MONTH) <= 10) {
            wateringDate.add(Calendar.DAY_OF_MONTH, +7);
            System.out.println("Весна или Осень. Кактус нужно полить " + dateFormat.format(wateringDate.getTime()));
        }
        else {
            int s = humidity.GetSensor();
            //int a = wateringDate.get(Calendar.DAY_OF_MONTH);
            if (s < 30 && wateringDate.get(Calendar.MONTH) >= 5 && wateringDate.get(Calendar.MONTH) <= 7) {
                wateringDate.add(Calendar.DAY_OF_MONTH, +2);
                System.out.println("Лето. Низкая влажность: " +s+ ". Кактус нужно полить " + dateFormat.format(wateringDate.getTime()));
            }
            else System.out.println("Лето. Влажность высокая: " +s + "%. Поливать кактус не нужно.");
        }
    }
}
