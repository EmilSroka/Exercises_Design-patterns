package pl.emilsroka.state.end;

import pl.emilsroka.state.end.modes.TravelMode;

public class DirectionService {
    private TravelMode travelMode;

    public Object getEta() {
        return travelMode.getEta();
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
