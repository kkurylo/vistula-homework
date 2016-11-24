public class Rectangle {

    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int field() {
        return x * y;
    }

    public int perimeter() {
        return (x*2)+(y*2);
    }
}
