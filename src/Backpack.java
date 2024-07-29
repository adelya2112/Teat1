public class Backpack {
    private String color;
    private int wight;

    public Backpack(String color, int wight) {
        this.color = color;
        this.wight = wight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "color='" + color + '\'' +
                ", wight=" + wight +
                '}';
    }
}
