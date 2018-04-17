public interface iShape2D {
    final  double PI=3.14;
    abstract  void area();
}
class CRectangle implements iShape2D {
    int width, height;
    public CRectangle(int w, int h) {
            width=w;
            height=h;
    }
//class Triangle implements iShape2D{
//        int base, height1;
//        public Triangle(int a,int b){
//            base=a;
//            height1=b;
//        }
//}
    public  void area()
    {
        System.out.println("rectangle area="+width*height);
    }
//    public void area(){
//        System.out.println("triangle area="+base*height1);
//    }
}

