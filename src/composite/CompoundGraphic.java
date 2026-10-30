package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite – chứa nhiều Graphic (có thể là Leaf hoặc Composite khác).
 */
public class CompoundGraphic implements Graphic {
    private final List<Graphic> children = new ArrayList<>();

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    @Override
    public void move(int x, int y) {
        // Ủy thác xuống tất cả các con
        for (Graphic child : children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        System.out.println("=== Bắt đầu vẽ nhóm ===");
        for (Graphic child : children) {
            child.draw();
        }
        System.out.println("=== Kết thúc nhóm ===");
    }
}
