package hw5.flyweight;

public class MapMarker {
    private int x, y;
    private MarkerStyle style;

    public MapMarker(int x, int y, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void display() {
        System.out.println(String.format("Marker (%d %d) with Style:", x, y));
        style.displayStyle();
    }
}
