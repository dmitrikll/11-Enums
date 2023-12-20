package HW11.controller;

import HW11.view.MainView;
import HW11.model.TrafficLight;

public class MainController {

   private final MainView view = new MainView();

    public String getLight(TrafficLight light) {
        switch (light) {
            case RED:
                return "Please, stand still.";
            case YELLOW:
                return "Please, stand by.";
            case GREEN:
                return "GO !!!";
            default:
                return "Traffic lights do not work...";
        }
    }

    public  void  getResult(){
       view.getOutput(getLight(view.getData()));
    }
}
