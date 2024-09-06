package classesAndObjects.trafficLight;

public class TrafficLight {
    String colors;
    float duration;

    void setColors(String colr){
        this.colors = colr;
    }
    void checkColor() {
        if (colors == "Green") System.out.println("Good to Go");
        else if (colors == "Red") System.out.println("Stop");
        else System.out.println("Hold on till the light switch to Green!");
    }

    public static void main(String[] args) {
        TrafficLight tl = new TrafficLight();
        tl.setColors("Yellow");
        System.out.println(tl.colors);
        tl.checkColor();
    }
}
