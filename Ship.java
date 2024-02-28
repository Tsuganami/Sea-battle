
public class Ship {
    private Coordinate[] shipCoordinates;
    short ship_length;
    boolean is_horizontal;
    private ShipType shipType;
    public int getLength(){
        switch(this.shipType){
            case ShipType.BATTLESHIP:
                return 4;
            case ShipType.CRUISER:
                return 3;
            case ShipType.DESTROYER:
                return 2;
            case ShipType.TORPEDOBOAT:
                return 1;
            default:
                return -1;
        }

    }

    public Coordinate[] getCoordinates(){
        return this.shipCoordinates;
    }
    Ship(int xn, int yn, boolean is_horizontaln, ShipType shipTypen){

        this.is_horizontal = is_horizontaln;
        this.shipType = shipTypen;
        if (shipTypen == ShipType.BATTLESHIP){
            this.shipCoordinates = new Coordinate[4];
        }
        else if (shipTypen == ShipType.CRUISER){
            this.shipCoordinates = new Coordinate[3];
            if (new Coordinate(Coordinate.State.SHIP,xn,yn).coordinateCheck()){
                for(int i = 1; i < this.getLength();i++){
                    if (! is_horizontal) {
                        shipCoordinates[1] = new Coordinate(Coordinate.State.SHIP, xn, yn+i);
                    }
                    else{
                        shipCoordinates[1] = new Coordinate(Coordinate.State.SHIP, xn+i, yn);
                    }
                }
            }
            else{
                System.out.print("Ship position is not valid.");
            }
        }
        else if (shipTypen == ShipType.DESTROYER){
            this.shipCoordinates = new Coordinate[2];
            if (new Coordinate(Coordinate.State.SHIP,xn,yn).coordinateCheck()){
                shipCoordinates[0] = new Coordinate(Coordinate.State.SHIP,xn,yn);
                for(int i = 1; i < this.getLength();i++){
                    if (! is_horizontal) {
                        shipCoordinates[1] = new Coordinate(Coordinate.State.SHIP, xn, yn+i);
                    }
                    else{
                        shipCoordinates[1] = new Coordinate(Coordinate.State.SHIP, xn+i, yn);
                    }
                    }

            }
            else{
                System.out.print("Ship position is not valid.");
            }

        }
        else if (shipTypen == ShipType.TORPEDOBOAT){
            this.shipCoordinates = new Coordinate[1];
            if (new Coordinate(Coordinate.State.SHIP,xn,yn).coordinateCheck()){
                shipCoordinates[0] = new Coordinate(Coordinate.State.SHIP,xn,yn);
            }
            else{
                System.out.print("Ship position is not valid.");
            }

        }




    }
    enum ShipType{
        BATTLESHIP,
        CRUISER,
        DESTROYER,
        TORPEDOBOAT
    }



}
