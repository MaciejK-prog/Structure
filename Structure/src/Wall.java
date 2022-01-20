import java.util.ArrayList;
import java.util.List;

public class Wall implements Structure{

    private static String material;
    private static String name;
    private static String color;
    private static int count;
    private static List<Wall> wallsList;


    public Wall(String name, String color, String material, int count) {
        this.name = name;
        this.color=color;
        this.material=material;
        this.count=count;
    }

    @Override
    public String getColor() {
        return color;
    }
    @Override
    public String getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public List<Wall> getBlocks() {
        return wallsList;
    }

    @Override
    public void findBlocksByMaterial(String material) {
        List<String> blocksMadeFromMaterial = new ArrayList<>();
        if(material.equals(Wall.material)) {
           blocksMadeFromMaterial.add(Wall.name);
            System.out.println(blocksMadeFromMaterial.toString());
        } else {
            System.out.println("Nie posiadamy elementu z tego materiału");
        }
    }

    @Override
    public void findByColor(String color) {
        List<String> blocksInSameColor = new ArrayList<>();
        if (material.equals(Wall.material)) {
            blocksInSameColor.add(Wall.name);
            System.out.println(blocksInSameColor.toString());
        } else {
            System.out.println("Nie posiadamy materiału w tym kolorze");
        }
    }


}







