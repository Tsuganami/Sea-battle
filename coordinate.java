public class coordinate {
    int x;
    int y;
    State state = State.EMPTY;
    enum State{
        EMPTY,
        SHIP,
        DESTROYED
    }
    boolean coordinateCheck(){
        return ((this.x > 0 && this.x < 10) && (this.y > 0 && this.y < 10));
    }
    coordinate(State state1, int x, int y){
        this.state = state1;
        this.x = x;
        this.y = y;

    }


}
