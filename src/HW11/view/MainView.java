package HW11.view;

import HW11.model.TrafficLight;

import java.util.Scanner;

public class MainView {

    private final Scanner scannerTraffic = new Scanner(System.in);

    public TrafficLight getData() {
        System.out.print("Please, enter the traffic light (RED; YELLOW; GREEN): ");
        return TrafficLight.valueOf(scannerTraffic.nextLine().trim().toUpperCase());
    }

    public void getOutput(String output) {
        scannerTraffic.close();
        System.out.println(output);
    }
}
