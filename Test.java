public class Test {
    int a,b;
    Test (int i,int j){
        a = i;
        b = j;

    }
    boolean equals(Test q) {
        if (q.a == a && q.b == b)
            return true;
        else return false;
    }
}
class PassOb {
    public static void main(String[] args) {
        Test obj1 = new Test(10,5);
        Test obj2 = new Test(12,15);
        Test obj3 = new Test(12,15);

        System.out.println("ob1 = ob2 " + obj1.equals(obj2));
        System.out.println("ob2 = ob3 " + obj2.equals(obj3));
    }
}
