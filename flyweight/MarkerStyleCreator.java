package hw5.flyweight;
import java.util.*;

public class MarkerStyleCreator {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();
    private static Random rand = new Random();

    public static MarkerStyle getStyle(String icon, String color, String labelStyle) {
        String key = icon + "_" + color;
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(icon, color, labelStyle));
            System.out.println("Создан новый стиль: " + key);
        }
        return styles.get(key);
    }

    public static MarkerStyle getRandomStyle(){
        List<String> keys = new ArrayList<>(styles.keySet());
        String randomKey = keys.get(rand.nextInt(keys.size()));
        return styles.get(randomKey);
    }

    public static int countUnique(){
        return styles.size();
    }
}
