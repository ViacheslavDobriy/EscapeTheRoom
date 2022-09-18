/**
 * There is description of room, which should be left
 */
public class Room {
    private int sideOfSquare;
    public Room(){
        this.sideOfSquare = (int) (Math.random()*6)+2;
    }
    public Room(int roomSize){
        this.sideOfSquare = roomSize;
    }

    public int getSideOfSquare() {
        return sideOfSquare;
    }

    public String drawRoom() {
        String result = "";
        for (int i = 0; i < sideOfSquare; i++) {
            result += "---";
        }
        result += "\n";
        for (int i = 0; i < sideOfSquare; i++) {
            for (int j = 0; j < sideOfSquare*2+1; j++) {
                if (j == 0 || j == sideOfSquare*2-1) {
                    result += "|";
                } else result += "  ";
            }
            result += "\n";
        }
        for (int i = 0; i < sideOfSquare; i++) {
            result += "---";
        }
        return result;
    }
}
