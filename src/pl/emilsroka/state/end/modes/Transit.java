package pl.emilsroka.state.end.modes;

public class Transit implements TravelMode {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
