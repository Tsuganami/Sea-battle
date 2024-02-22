public class ship {
    coordinate[] shipCoordinates;
    short ship_length;
    boolean is_horizontal;
    ShipType shipType;
    private int convertTypeToLenght(ShipType shiptypen){
        switch(shiptypen){
            case ShipType.BATTLESHIP:
                return 4;
            case ShipType.CRUISER:
                return 3;
            case ShipType.DESTROYER:
                return 2;
            case ShipType.TORPEDOBOAT:
                return 1;

        }

    }
    ship(int xn, int yn, boolean is_horizontaln, ShipType shipTypen){

        this.is_horizontal = is_horizontaln;
        this.shipType = shipTypen;
        if (shipTypen == ShipType.BATTLESHIP){
            this.shipCoordinates = new coordinate[4];
        }
        else if (shipTypen == ShipType.CRUISER){
            this.shipCoordinates = new coordinate[3];
        }
        else if (shipTypen == ShipType.DESTROYER){
            this.shipCoordinates = new coordinate[2];
            if (new coordinate(coordinate.State.SHIP,xn,yn).coordinateCheck()){
                shipCoordinates[0] = new coordinate(coordinate.State.SHIP,xn,yn);
                for(int i = 1; i < convertTypeToLenght(shipTypen);i++){

                }
            }
            else{
                System.out.print("Ship position is not valid.");
            }

        }
        else if (shipTypen == ShipType.TORPEDOBOAT){
            this.shipCoordinates = new coordinate[1];
            if (new coordinate(coordinate.State.SHIP,xn,yn).coordinateCheck()){
                shipCoordinates[0] = new coordinate(coordinate.State.SHIP,xn,yn);
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
