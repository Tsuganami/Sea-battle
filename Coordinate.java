public class Coordinate {
    private int x;
    private int y;
    State state = State.EMPTY;

    public int getx(){
        return this.x;
    }

    public int gety(){
        return this.y;
    }

    enum State{
        EMPTY,
        SHIP,
        DESTROYED
    }
    boolean coordinateCheck(){
        return ((this.x > 0 && this.x < 10) && (this.y > 0 && this.y < 10));
    }
    Coordinate(State state1, int x, int y){
        this.state = state1;
        this.x = x;
        this.y = y;

    }


}
