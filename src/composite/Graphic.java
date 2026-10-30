package composite;

/**
 * Component interface – giao diện chung cho cả Leaf và Composite.
 */
public interface Graphic {
    void move(int x, int y);
    void draw();
}
