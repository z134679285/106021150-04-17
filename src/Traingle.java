public class Triangle implements iShape2D {
    int base;
    int height1;
    public Triangle(int a,int b){
        base=a;
        height1=b;
    }
    public  void area(){
        System.out.println("triangle area="+base*height1);

}
