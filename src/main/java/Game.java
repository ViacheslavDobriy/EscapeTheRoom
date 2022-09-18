/**
 * Main is here
 */
public class Game {
    public static void main(String[] args) {
//        Room newRoom = new Room(3);
//        System.out.println(newRoom.getSideOfSquare());
//        System.out.println(newRoom.drawRoom());
        ObjectsInRoom chest = new Chest();
        System.out.println(chest.generateCoords(3, 3));
    }
}
