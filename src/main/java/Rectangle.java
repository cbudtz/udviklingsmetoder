public class Rectangle extends Shape{
    private float side1;
    private float side2;

    @Override
    public float getArea() {
        return side1*side2;
    }

    public void setSides(float side1, float side2){
        this.side1=side1;
        this.side2=side2;
    }
}
