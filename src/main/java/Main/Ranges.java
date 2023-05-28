package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Ranges {
    private static Coord size;
    private static ArrayList<Coord> allCoords;


    public static Coord getSize() {
        return size;
    }

    public static void setSize(Coord _size) {
        size = _size;
        ///allCoords = new ArrayList<Coord>();
        for(int y = 0; y< _size.x ; y++){
            for(int x = 0; x<_size.y; x++){
                allCoords.add(new Coord(x,y));
            }
        }
    }

    public static ArrayList<Coord> getAllCoords(){
        return allCoords;
    }

    public static boolean inRange(Coord coord){
        return coord.x >= 0 && coord.x < size.x &&
                coord.y >= 0 && coord.y < size.y;
    }



    static List<Coord> getCoordsAround(Coord coord){
        Coord tempCoord;
        List<Coord> around = new ArrayList<>();
        for(int x = coord.x-1 ; x<=coord.x+1 ; x++){
            for(int y = coord.y-1 ; y<=coord.y+1 ; y++){
                tempCoord = new Coord(x,y);
                if(inRange(tempCoord) && !tempCoord.equals(coord)){
                    around.add(tempCoord);
                }
            }
        }
        return around;
    }
}
