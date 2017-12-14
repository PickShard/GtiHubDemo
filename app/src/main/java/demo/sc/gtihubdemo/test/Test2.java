package demo.sc.gtihubdemo.test;

/**
 * Created by sc on 2017/4/28.
 */

public class Test2 {

    public static void main(String[] args) {

        Point point=new Point();

        a(point);

        System.out.println("Point.x = "+point.x);
        System.out.println("Point.y = "+point.y);
    }

    public static  void a(Point point){
        point.x = 100;
        point.y =200;
    }
}
