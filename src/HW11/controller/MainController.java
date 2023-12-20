package HW11.controller;

import HW11.view.MainView;
import HW11.model.TrafficLight;

public class MainController {

    private final MainView view = new MainView();

    public String getLight(TrafficLight light) {

        return switch (light) {
            case RED -> "Please, stand still.";
            case YELLOW -> "Please, stand by.";
            case GREEN -> "GO !!!";
            default -> "Traffic lights do not work...";
        };
    }

    public void getResult() {
        try {
            view.getOutput(getLight(view.getData()));
        } catch (Exception error) {
            view.getOutput("Exception: " + error.getMessage());
        }

    }
}
