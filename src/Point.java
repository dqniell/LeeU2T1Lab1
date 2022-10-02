public class Point {

    //instance variables
    private int x;
    private int y;

    //constructor that accepts both instance variables
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //constructor that accepts one value and sets both x and y to the same value
    public Point(int anyNum) {
        x = anyNum;
        y = anyNum;
    }

    //constructor that has no parameters and sets x and y to 0
    public Point() {
        x = 0;
        y = 0;
    }

    //getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setter methods
    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    //method coordinate
    public String coordinate() {
        return "( " + x + ", " + y + ")";
    }

    //method quadrant
    public String quadrant() {
        String quadrant = null;

        if (x == 0 && y == 0) {
            quadrant = "on origin";
        } else if (x > 0 && y > 0) {
            quadrant = "I";
        } else if (x < 0 && y > 0) {
            quadrant = "I";
        } else if (x < 0 && y < 0) {
            quadrant = "III";
        } else if (x > 0 && y < 0) {
            quadrant = "IV";
        } else {
            quadrant = "on axis";
        }
        return quadrant;
    }
}
