public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public String toString(boolean on) {
        if (on)
            return "Speed = " + speed + "\nColor = " + color + "\nRadius = " + radius + "\nFan is on";
        else return "Color = " + color + "\nRadius = " + radius + "\nFan is off";
    }

    public static void main(String[] args) {
        Fan newFan1 = new Fan();
        newFan1.setSpeed(FAST);
        newFan1.setRadius(10);
        newFan1.setOn(true);
        newFan1.setColor("yellow");
        newFan1.toString(true);

        Fan newFan2 = new Fan();
        newFan2.setSpeed(MEDIUM);
        newFan2.setRadius(5);
        newFan2.setOn(false);
        newFan2.setColor("blue");
        newFan2.toString(false);
    }
}
