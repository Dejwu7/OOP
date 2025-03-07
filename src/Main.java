public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.x = 10.0;
        point.y = 12.0;
        System.out.println(point.x + " \n" + point.y);
        System.out.println(point.to_String());
        System.out.println(point.toSvg());
    }
}