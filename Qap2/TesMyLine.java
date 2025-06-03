public class TesMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        MyLine line1 = new MyLine(p1, p2);

        MyLine line2 = new MyLine(0, 0, 3, 4);

        System.out.println(line1); 
        System.out.println(line2); 

        line2.setBeginXY(1, 1);
        line2.setEndXY(2, 2);
        System.out.println("Begin X: " + line2.getBeginX());
        System.out.println("End Y: " + line2.getEndY()); 

        System.out.printf("Length of line1: %.2f\n", line1.getLength());
        System.out.printf("Gradient of line1: %.2f radians\n", line1.getGradient());
    }
}