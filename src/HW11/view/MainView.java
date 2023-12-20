package HW11.view;

import java.util.Scanner;
import HW11.model.TrafficLight;

public class MainView {

    private final Scanner scannerTraffic = new Scanner(System.in);

    public TrafficLight getData() {
        System.out.print("Please, enter the traffic light (RED; YELLOW; GREEN): ");
        return TrafficLight.valueOf(scannerTraffic.nextLine().trim().toUpperCase()) ;
    }

    public void getOutput (String output) {
        scannerTraffic.close();
        System.out.println(output);
    }
}
