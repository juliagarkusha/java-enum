import controller.AdvisorController;
import view.AdvisorView;
import model.Day;

public class App {
    public static void main(String[] args) {
        AdvisorView view = new AdvisorView();
        AdvisorController controller = new AdvisorController(view);

        controller.getAdvice(Day.MONDAY);
        controller.getAdvice(Day.FRIDAY);
        controller.getAdvice(Day.SUNDAY);
    }
}
