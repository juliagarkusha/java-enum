package controller;

import model.Day;
import view.AdvisorView;

public class AdvisorController {

    private final AdvisorView view;

    public AdvisorController(AdvisorView view) {
        this.view = view;
    }

    public void getAdvice(Day day) {
        String advice = switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> "Stay focused and be productive!";
            case FRIDAY -> "Happy Friday!";
            case SATURDAY, SUNDAY -> "It's the weekend! How about visiting a park or going hiking?";
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };

        view.printAdvice(advice);
    }
}
