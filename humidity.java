import java.util.Random;

public class humidity {
    public int GetSensor(){
        Random rnd = new Random();
        int sensorHumidity = rnd.nextInt(0, 100);
        return sensorHumidity;
    }
}
