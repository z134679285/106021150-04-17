public class CCircle implements iShape2D {
    double radius;

    public  CCircle(double r)
    {
        radius=r;
    }
    public  void area(){
        System.out.println("circle area="+PI*radius*radius);
    }
}
