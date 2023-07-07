package tasks;

public class Distance {
    public int feet;
    public int inches;

    public Distance() {
        this.feet=0;
        this.inches=0;
    }

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
    public void addDistance(Distance dis){

        this.feet= dis.feet + this.feet;
        this.inches = dis.inches + this.inches;

        if(this.inches>=12) {
            int temp =  (this.inches % 12);
            this.feet += this.inches / 12;
            this.inches = temp;

        }
        System.out.println("feet = " + feet);
    }
    public boolean isGreater(Distance d){
        int sum1=this.feet * 12 + this.inches;
        int sum2=d.feet * 12 + d.inches;
        return sum1>sum2;
    }

}
 