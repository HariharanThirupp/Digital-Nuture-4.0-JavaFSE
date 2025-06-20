public class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null || type.isEmpty()) return null;
        if (type.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (type.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        return null;
    }
}
