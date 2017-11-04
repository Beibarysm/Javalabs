public class OverloadMethod {
  public  int a;
  public  double b;

    public OverloadMethod() {
        this.a=0; this.b=0;
    }

    public OverloadMethod(int a) {
        this.a = a;
    }

    public OverloadMethod(double b) {
        this.b = b;
    }

    public OverloadMethod(int a, double b) {
        this.a = a;
        this.b = b;
    }

    int sum(int a, int b){
        return a+b;
    }
    double sum(double a, double b){
        return a+b;
    }
    int mult(int a, int b){
        return a*b;
    }
    double mult(double a, double b){
        return a*b;
    }
    int div(int a, int b){
        return a/b;
    }
    double div(double a, double b){
        return a/b;
    }
    int minus(int a, int b){
        return a-b;
    }
    double minus (double a, double b){
        return a-b;
    }
    int abs(int a){
        if (a<0)
            a = a*-1;
        return a;
    }
    double abs(double a){
        return (a<0) ? -a : a;
    }
     private static long abs(long a){
        if (a<0)
            return -a;
        else return a;
    }





    public static void main(String[] args) {
        long z=255;
        OverloadMethod.abs(z);
        //System.out.println("OverloadMethod() a = "+OverloadMethod.a+ " b = " + OverloadMethod.b);

        OverloadMethod ob1 = new OverloadMethod();
        System.out.println("OverloadMethod() a = "+ob1.a+ " b = " + ob1.b);

        OverloadMethod ob2 = new OverloadMethod(5);
        System.out.println("OverloadMethod() a = "+ob2.a+ " b = " + ob2.b);

        OverloadMethod ob4 = new OverloadMethod(5.0);
        System.out.println("OverloadMethod() a = "+ob4.a+ " b = " + ob4.b);


        OverloadMethod ob3 = new OverloadMethod(5,7.0);
        System.out.println("OverloadMethod() a = "+ob3.a+ " b = " + ob3.b);

  /*
        int result = ob.sum(2,5);
        System.out.println("ob.sum(2,5) = " + result);
        double result2 = ob.sum(1.3,1.4);
        System.out.println("ob.sum(1.3,1.4)=" + result2);
        int result3 = ob.mult(4,5);
        System.out.println("ob.mult(4,5)=" + result3);
        double result4 =  ob.mult(1.2,5.4);
        System.out.println("ob.mult(1.2,5.4)=" + result4);
        int result5 = ob.div(6,3);
        System.out.println("div(6,3)= " + result5);
        double result6 = ob.div(12.8,2.4);
        System.out.println("div(12.8,2.4)= " + result6);

        int result7 = ob.minus(16,9);
        System.out.println("minus(16,9)= " + result7);
        double result8 = ob.minus(84.28,2.6);
        System.out.println("minus(84.28,2.6)= "  + result8);

        int res9 = ob.abs(15);
        System.out.println("abs(-15)= " + res9);
        double res10 = ob.abs(12.35);
        System.out.println("abs(-12.35)= " + res10);
        long res11 = ob.abs(233);
        System.out.println("abs(-233)= " + res11);
        System.out.println("check github");
        */
    }
}
