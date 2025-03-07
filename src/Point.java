public class Point {
    public double x,y;
    public String to_String()
    {
        return "x= "+x+" y= "+y;
    }
    public String toSvg(){
       return  "<svg height=\"100\" width=\"100\" xmlns=\"http://www.w3.org/2000/svg\">"+
               "<circle r=\"45\" cx="+x+"cy="+y+"fill=\"red\" />"+
               "</svg>";

    }
}
