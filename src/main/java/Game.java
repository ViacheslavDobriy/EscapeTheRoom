/**
 * Main is here
 */
public class Game {
    public static void main(String[] args) {
        Room newRoom = new Room(3);
        System.out.println(newRoom.getSideOfSquare());
        System.out.println(newRoom.drawRoom());
    }
}
