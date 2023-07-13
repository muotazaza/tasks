package tasks;

public class Circle extends Point {
private float radius;


    public Circle() {
        super();
    }

    public Circle(Point point ,float radius) {
        super(point.getX(), point.getY());
        this.radius = radius;
    }

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public  double circumference(){
        return 2* Math.PI*radius;
    }
    public double calRadius (){
       double raisus =circumference()/(2*Math.PI);
        return radius;
        }


}
