public interface Structure extends CompositeBlock {


    void findBlocksByMaterial(String material);
    void findByColor(String color);
    int count();
}
