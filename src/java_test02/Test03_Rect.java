package java_test02;

class Shape {

    private int width;
    private int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //면적을 구하는 메소드
    public int getArea() {
        return 0;
    }

    //둘레의 길이를 구하는 메소드
    public int getRound() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape [width=" + width + ", height=" + height + "]";
    }

}

class Rect extends Shape {

    public Rect(int width, int height) {
        super(width, height);
    }
    
    // 1. 면적을 구하는 메소드 getArea()를 오버라이드 하시오(20점)
    
    
    // 2. 둘레의 길이를 구하는 메소드 getRound()를 오버라이드 하시오(20점)

}

public class Test03_Rect {
    public static void main(String[] args) {
        Rect r = new Rect(10, 5);
        System.out.println(r.toString());
        
        int a = r.getArea();
        int b = r.getRound();
        
        System.out.println("사각형의 면적: " + a);
        System.out.println("사각형의 둘레: " + b);
    }
}












