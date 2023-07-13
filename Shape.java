package tasks;

public abstract class Shape {
    protected  double area ;
    protected double volume;

    public abstract void computeArea();
    public abstract void computeVolume();
    public abstract void display();

}

 class Points extends Shape{
    protected double x;
    protected double y;

    public Points() {

        x=0.0;
        y=0.0;
    }

    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void computeArea() {
    area=0.0;
    }

    @Override
    public void computeVolume() {
    volume=0.0;
    }

    @Override
    public void display() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("area = " + area);
        System.out.println("volume = " + volume);

    }
}
    class Circlee extends Points {

    protected double radius ;

        public Circlee() {
            radius = 0.0;
        }

        public Circlee(double x, double y, double radius) {
            super(x, y);
            this.radius = radius;
        }

        @Override
        public void computeArea() {
             area =Math.PI*radius*radius;
        }

        @Override
        public void computeVolume() {
            volume=0.0;
        }

        @Override
        public void display() {
            System.out.println("radius = " + radius);
            System.out.println("area = " + area);
            System.out.println("volume = " + volume);
        }
    }

    class Cylinder extends Circlee{
    protected  double height;

        public Cylinder() {
            height = 0.0;
        }

        public Cylinder(double x, double y, double radius, double height) {
            super(x, y, radius);
            this.height = height;
        }

        public Cylinder(double x, double y, double radius) {
            super(x, y, radius);
        }

        @Override
        public void computeArea() {
            area=Math.PI*Math.pow(radius,2);
        }

        @Override
        public void computeVolume() {
            volume=Math.PI*Math.pow(radius,2)*height;
        }

        @Override
        public void display() {
            System.out.println("height = " + height);
            System.out.println("area = " + area);
            System.out.println("volume = " + volume);
        }
    }
