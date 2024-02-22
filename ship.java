public class ship {
    coordinate[] shipCoordinates;
    short ship_length;
    boolean is_horizontal;
    ShipType shipType;
    ship(int xn, int xy, boolean is_horizontaln, ShipType shipTypen){
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

        }
        else if (shipTypen == ShipType.TORPEDOBOAT){
            this.shipCoordinates = new coordinate[1];

        }



    }
    enum ShipType{
        BATTLESHIP,
        CRUISER,
        DESTROYER,
        TORPEDOBOAT
    }



}
