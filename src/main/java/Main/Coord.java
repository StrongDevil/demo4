package Main;

public class Coord {

  public   int x;
public int y;
public Coord(int x,int y){
    this.x=x;
    this.y=y;
}
@Override
    public boolean equals(Object o){
    if (o instanceof Coord coord){
        return coord.x==this.x && coord.y==this.y;
    }
    return super.equals(o);

}


}
