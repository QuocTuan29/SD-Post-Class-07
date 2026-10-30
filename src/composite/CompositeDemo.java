package composite;

/**
 * Demo chạy mẫu Composite.
 * Trong Eclipse: Run As → Java Application
 */
public class CompositeDemo {
    public static void main(String[] args) {
        // Tạo các leaf
        Dot dot1 = new Dot(1, 2);
        Circle circle = new Circle(5, 3, 10);
        Dot dot2 = new Dot(10, 20);

        // Tạo composite (nhóm)
        CompoundGraphic group = new CompoundGraphic();
        group.add(dot1);
        group.add(circle);

        // Composite lồng nhau
        CompoundGraphic bigGroup = new CompoundGraphic();
        bigGroup.add(group);      // nhóm con
        bigGroup.add(dot2);       // leaf

        System.out.println("===== Vẽ toàn bộ cấu trúc cây =====");
        bigGroup.draw();

        System.out.println("\n===== Di chuyển toàn bộ nhóm (+3, +4) =====");
        bigGroup.move(3, 4);

        System.out.println("\n===== Vẽ lại sau khi di chuyển =====");
        bigGroup.draw();

        System.out.println("\n→ Client chỉ gọi draw()/move() trên Graphic,");
        System.out.println("  không cần biết bên trong là chấm, hình tròn hay nhóm phức tạp.");
    }
}
