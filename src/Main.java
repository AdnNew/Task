import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Wall blockList = new Wall(new ArrayList<>());

        blockList.addToList("red", "metal");
        blockList.addToList("red", "wood");
        blockList.addToList("blue", "metal");
        System.out.println(blockList.count());
        System.out.println(blockList.findBlockByColor("red"));
        System.out.println(blockList.findBlockByColor("blue"));
        System.out.println(blockList.findBlocksByMaterial("metal"));
        System.out.println(blockList.getBlocks());
        System.out.println(blockList.getBlocks().get(0).getColor());
        System.out.println(blockList.getBlocks().get(1).getMaterial());
    }
}