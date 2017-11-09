public class Box {
    int length;
    int width;
    int height;

    Box(int a, int b, int c){
        length = a;
        width = b;
        height = c;

    }
    int volume (){
        return width*length*height;
    }


    public static void main(String[] args) {
        Box b = new Box(2,5,7);
        int vol = b.volume();
        System.out.println(vol);



    }

}
