package composite;

/**
 * Leaf khác – hình tròn (kế thừa Dot để tái sử dụng tọa độ).
 */
public class Circle extends Dot {
    private final int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("  Vẽ hình tròn tại (" + x + ", " + y + ") bán kính " + radius);
    }
}
