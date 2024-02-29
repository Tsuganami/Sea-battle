import java.util.Scanner;
public class Ship {
    Scanner scanner = new Scanner(System.in);
    private Coordinate[] shipCoordinates;
    short ship_length;
    boolean is_horizontal;
    private ShipType shipType;

    int coordintes[] = new int[2];

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


    private static int[] coordinateConverter(char y, int x){
        y = Character.toLowerCase(y);
        int[] coordinates = new int[2];
        int change = y;
        coordinates[0] = (x - 1);
        coordinates[1] = (change - 97);

        return coordinates;

    }

    public Coordinate[] getCoordinates(){
        return this.shipCoordinates;
    }
    Ship(int xn, int yn){
        System.out.print("Put the Coordinates for the bow of your battleship in the following format: A 1 H B.\n");
        System.out.print("H for vertical, V for Horizontal\n");
        System.out.print("B for 4-squares ship, C for 3-squares ship , D for 2-squares ship, T for 1-square ship\n");
        String input = scanner.nextLine();
        coordintes = coordinateConverter(input.split(" ")[0].charAt(0),Integer.parseInt(input.split(" ")[1]));

        if (input.split(" ")[2].toLowerCase() == "h" || input.split(" ")[2].toLowerCase() == "v" ){
            this.is_horizontal = input.split(" ")[2] == "H";
        }
        else{
            throw new IllegalArgumentException("Unknown ship position flag");
        }

        if (input.split(" ")[3].toLowerCase() == "b"){
            this.shipType = ShipType.BATTLESHIP;
            this.shipCoordinates = new Coordinate[4];
        }
        else if (input.split(" ")[3].toLowerCase() == "c"){
            this.shipType = ShipType.CRUISER;
            this.shipCoordinates = new Coordinate[3];
            if (new Coordinate(Coordinate.State.SHIP,xn,yn).coordinateCheck()){
                for(int i = 0; i < this.getLength();i++){
                    if (! is_horizontal) {
                        shipCoordinates[i] = new Coordinate(Coordinate.State.SHIP, xn, yn+i);
                    }
                    else{
                        shipCoordinates[i] = new Coordinate(Coordinate.State.SHIP, xn+i, yn);
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
                for(int i = 0; i < this.getLength();i++){
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
