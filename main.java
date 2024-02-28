
public class main {

    //function responsible for drawing the battlelfield
    public static  void updateBattleField(Ship newShip, Coordinate[][] battlefield){
        Coordinate[] coordinates = newShip.getCoordinates();

        for (int i = 0; i<newShip.getLength();i++){
            Coordinate temp_coordinate = newShip.getCoordinates()[i];
            battlefield[temp_coordinate.getx()][temp_coordinate.gety()].state = Coordinate.State.SHIP;
        }
    }
    public static void printBattleField(Coordinate[][] battlefield){
        System.out.print("  1 2 3 4 5 6 7 8 9 10\n");
        for(short y = 0;y<10;y++){
            for(short x = -1; x<10;x++){
                if (x == -1){
                    char letter = (char) ('A'+ (y+1) -1);
                    System.out.print(letter+"|");
                }
                else{
                    if (battlefield[x][y].state == Coordinate.State.EMPTY){
                        System.out.print("_|");

                    }
                    else if (battlefield[x][y].state == Coordinate.State.SHIP){
                        System.out.print("$|");
                    }
                    else if (battlefield[x][y].state == Coordinate.State.DESTROYED){
                        System.out.print("X|");
                    }
                }

                }
            System.out.print("\n");
            }


        }

    public static Coordinate[][] defaultBattleField(Coordinate[][] battlefield){
        for(short x = 0; x<10;x++){
            for(short y = 0; y<10;y++){
                battlefield[x][y] = new Coordinate(Coordinate.State.EMPTY,x,y);
            }
        }
        return battlefield;


    }

    public static int[] coordinateConverter(int x, char y){
        y = Character.toLowerCase(y);
        int[] coordinates = new int[2];
        int change = y;
        coordinates[0] = (x - 1);
        coordinates[1] = (change - 97);

        return coordinates;

    }

    public static void main(String[] args){

        System.out.println("Hello World");
        Coordinate[][] battlefield = new Coordinate[10][10];
        System.out.print("Welcome to the Sea battle.\n");
        System.out.print("Here is the battle field.\n");
        printBattleField(defaultBattleField(battlefield));
        System.out.print("You need to place 10 ships.\n");
        System.out.print("One Battleship: $$$$\n");
        System.out.print("Two Cruisers: $$$\n");
        System.out.print("Three Destroyers: $$\n");
        System.out.print("Four Torpedo boats: $\n");

        System.out.print("Put the Coordinates for the bow of your battleship.\n");
        Ship testShip = new Ship(7,7,true, Ship.ShipType.CRUISER);
        //updateBattleField(testShip, battlefield);
        //printBattleField(battlefield);
        int coordintes[] = new int[2];
        //coordintes = coordinateConverter(1,'B');
        //System.out.print(coordintes[0]);
        //System.out.print("\n");
        //System.out.print(coordintes[1]);



    }

}