package pl.emilsroka.state.end;

import pl.emilsroka.state.end.modes.Walking;

public class Demo {
    public static void main(String[] args){
        show();
    }

    public static void show() {
        var service = new DirectionService();
        service.setTravelMode(new Walking());
        service.getEta();
        service.getDirection();
    }
}
