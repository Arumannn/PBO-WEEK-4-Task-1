public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(5, 10);
        String Information1 = c1.toString();
        System.out.println(Information1 + "\n" + "Cylinder:"
        + " radius=" + c1.getRadius()
        + " height=" + c1.getHeight()
        + " base area=" + c1.getArea()
        + " volume=" + c1.getVolume());
        
        Cylinder c2 = new Cylinder(100,25);
        String Information2 = c2.toString();

        System.out.println(Information2 + "\n" + "Cylinder:"
        + " radius=" + c2.getRadius()
        + " height=" + c2.getHeight()
        + " base area=" + c2.getArea()
        + " volume=" + c2.getVolume());
        c2.toString();


        Cylinder c3 = new Cylinder(50, 5);
        String Information3 = c3.toString();
        System.out.println(Information3 + "\n" + "Cylinder:"
        + " radius=" + c3.getRadius()
        + " height=" + c3.getHeight()
        + " base area=" + c3.getArea()
        + " volume=" + c3.getVolume());
        c3.toString();

        


    }
}
