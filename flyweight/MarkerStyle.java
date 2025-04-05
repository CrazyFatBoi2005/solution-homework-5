package hw5.flyweight;

public class MarkerStyle {
    private String icon;
    private String color;
    private String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle){
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void displayStyle(){
        System.out.println(String.format("Icon: %s, Color: %s, Label Style: %s", icon, color, labelStyle));
    }
}
