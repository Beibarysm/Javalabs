public class Box2 {
    double width;
    double heigth;
    double depth;

    Box2(Box2 ob){
        width = ob.width;
        heigth = ob.heigth;
        depth = ob.depth;
    }
    Box2(double a,double b,double c){
        width = a;
        heigth = b;
        depth = c;
    }

}
