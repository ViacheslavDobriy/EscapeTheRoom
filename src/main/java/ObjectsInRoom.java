/**
 * There is description of all exists objects in the room
 */
public abstract class ObjectsInRoom {

    protected Room room1;
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
    public int[] generateCoords(int maxX, int maxY) {
        int[] result = new int[2];
        result[0] = (int) (Math.random()*(maxX-1))+1;
        result[1] = (int) (Math.random()*(maxY-1))+1;
        return result;
    }

    public String putObjectOnMap(Room room1, int[] coordsOfObject) {
        String result = "";
        for (int i = 0; i < room1.getSideOfSquare(); i++) {
            result += "---";
        }
        result += "\n";
        for (int i = 0; i < room1.getSideOfSquare(); i++) {
            if(i == coordsOfObject[0]) {
                for (int j = 0; j < room1.getSideOfSquare()*2+1; j++) {
                    if (j == 0 || j == room1.getSideOfSquare()*2-1) {
                        result += "|";
                    } else if(j != coordsOfObject[1]) {
                        result += "  ";
                    } else {
                        result += " " + this.picture + " ";
                    }
                }
            } else {
                for (int j = 0; j < room1.getSideOfSquare() * 2 + 1; j++) {
                    if (j == 0 || j == room1.getSideOfSquare() * 2 - 1) {
                        result += "|";
                    } else
                        result += "  ";
                }
            }
            result += "\n";
        }
        for (int i = 0; i < room1.getSideOfSquare(); i++) {
            result += "---";
        }
        return result;
    }
}
