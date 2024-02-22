public class coordinate {
    int x;
    int y;
    State state = State.EMPTY;
    enum State{
        EMPTY,
        SHIP,
        DESTROYED
    }
    coordinate(State state1){
        this.state = state1;

    }


}
