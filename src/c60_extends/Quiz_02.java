package c60_extends;

//연습문제 -  자식클래스 디자인
/**
 *--------------------------------------
 * 다음의 출력결과가 표시되도록 함께 제공되는 Rectangle클래스에
 * 기능을 추가하시오.
 *
 *
 * [실행결과 예시]
 *--------------------------------------
 *      Form [width=20, height=5]
 *      사각형의 면적: 100
 *      Form [width=30, height=10]
 *      사각형의 둘레: 80
 */

class Form {

    private int width;
    private int height;

    public Form(int width, int height) {
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

    public int getArea() {
        return 0;
    }

    public int getRound() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape [width=" + width + ", height=" + height + "]";
    }

}

class Rectangle extends Form {
    /**
     * 생성자
     * @param width     - 가로길이
     * @param height    - 세로길이
     */
    public Rectangle(int width, int height) {
        super(width, height);
    }
    
    /**
     * 면적을 구해서 리턴한다.
     */
    @Override
    public int getArea() {
        int x = this.getWidth();
        int y = this.getHeight();
        int z = x * y;
        return z;
    }

    /**
     * 둘레의 길이를 구해서 리턴한다.
     */
    @Override
    public int getRound() {
        int x = this.getWidth();
        int y = this.getHeight();
        int z = (x * 2) + (y * 2);
        return z;
    }
    
    public int getArea(int w, int h) {
        this.setWidth(w);
        this.setHeight(h);
        return w*h;
    }
    
    public int getRound(int w, int h) {
        this.setWidth(w);
        this.setHeight(h);
        return w*2+h*2;
    }
}


public class Quiz_02 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(0, 0);
        
        int a = r.getArea(20, 5);
        System.out.println(r.toString());
        System.out.println("사각형의 면적: " + a);
        
        int b = r.getRound(30, 10);
        System.out.println(r.toString());
        System.out.println("사각형의 둘레: " + b);
    }
}
