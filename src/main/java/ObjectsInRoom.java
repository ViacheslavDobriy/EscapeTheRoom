/**
 * There is description of all exists objects in the room
 */
public abstract class ObjectsInRoom {
    protected String name;
    protected String picture;
    public ObjectsInRoom(String name) {
        this.name = name;
    }
    public ObjectsInRoom(String name, String picture) {
        this.name = name;
        this.picture = picture;
    }

    /**
     * Generating coords of where will be placed object on the map
     * @param maxX - length of the room
     * @param maxY - wide of the room
     */
    public String generateCoords(int maxX, int maxY) {
        int x = (int) (Math.random()*(maxX-1))+1;
        int y = (int) (Math.random()*(maxY-1))+1;
        return x + "," + y;
    }
}
