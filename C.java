public class C {
    int i;
    A1 a = new A1();
    B b = new B();

    public C(int i) {
        this.i = i;
    }

    C sum(){
        C c = new C(a.x + b.y);

        return c;
    }

    public static void main(String[] args) {
        C c = new C(0 );
        int  res = c.i;
        System.out.println(res);
        c = c.sum();
        System.out.println(c.i);

    }
}
class A1{
    int x = 10;
}
class B{
    int y = 20;
}


