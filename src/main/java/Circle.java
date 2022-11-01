public class Circle extends Shape {
    private float radius;

    @Override
    public float getArea() {
        return radius*radius*PI;
    }

    public void setRadius(float radius){
        this.radius = radius;
    }
}
