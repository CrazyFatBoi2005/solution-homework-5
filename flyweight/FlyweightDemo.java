package hw5.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        MapMarker[] markers = new MapMarker[10];

        markers[0] = new MapMarker(10, 20, MarkerStyleCreator.getStyle("⛽", "синий", "Gothic"));
        markers[1] = new MapMarker(15, 25, MarkerStyleCreator.getStyle("⛽", "синий", "Times new Roman"));
        markers[2] = new MapMarker(30, 40, MarkerStyleCreator.getStyle("🍔", "красный", "No Label"));
        markers[3] = new MapMarker(35, 45, MarkerStyleCreator.getStyle("🍔", "красный", "Gothic"));
        markers[4] = new MapMarker(50, 60, MarkerStyleCreator.getStyle("🏥", "зеленый", "Times new Roman"));

        for (int i = 5; i < 10; i++){
            markers[i] = new MapMarker(i * i, i * 10, MarkerStyleCreator.getRandomStyle());
        }

        for (MapMarker marker:
             markers) {
            marker.display();
        }

        System.out.println(String.format("Unique styles count: %d",MarkerStyleCreator.countUnique()));
    }
}
