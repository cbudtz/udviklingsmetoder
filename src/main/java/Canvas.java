public class Canvas {
    private Shape[] shapes;

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.runStuff();
    }

    private void runStuff() {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.setRadius(3);
        circle2.setRadius(7);
        Rectangle rect = new Rectangle();
        rect.setSides(10,20);

        Shape[] shapeArray = new Shape[3];
        shapeArray[0] = circle1;
        shapeArray[1] = circle2;
        shapeArray[2] = rect;

        this.shapes = shapeArray;

        float totalArea = 0;
        for (Shape s: this.shapes ) {
            totalArea+= s.getArea();
        }
        System.out.println("total: " +totalArea);
    }
}
