public class main {

    //function responsible for drawing the battlelfield
    public static void printBattleField(coordinate[][] battlefield){
        System.out.print("  1 2 3 4 5 6 7 8 9 10\n");
        for(short y = 0;y<10;y++){
            for(short x = -1; x<10;x++){
                if (x == -1){
                    char letter = (char) ('A'+ (y+1) -1);
                    System.out.print(letter+"|");
                }
                else{
                    if (battlefield[x][y].state == coordinate.State.EMPTY){
                        System.out.print("_|");

                    }
                    else if (battlefield[x][y].state == coordinate.State.SHIP){
                        System.out.print("$|");
                    }
                    else if (battlefield[x][y].state == coordinate.State.DESTROYED){
                        System.out.print("X|");
                    }
                }

                }
            System.out.print("\n");
            }


        }

    public static coordinate[][] defaultBattleField(coordinate[][] battlefield){
        for(short x = 0; x<10;x++){
            for(short y = 0; y<10;y++){
                battlefield[x][y] = new coordinate(coordinate.State.EMPTY);
            }
        }
        return battlefield;


    }


    public static void main(String[] args){
        coordinate[][] battlefield = new coordinate[10][10];
        System.out.print("Welcome to the Sea battle.\n");
        System.out.print("Here is the battle field.\n");
        printBattleField(defaultBattleField(battlefield));
        System.out.print("You need to place 10 ships.\n");
        System.out.print("One Battleship: $$$$\n");
        System.out.print("Two Cruisers: $$$\n");
        System.out.print("Three Destroyers: $$\n");
        System.out.print("Four Torpedo boats: $\n");

        System.out.print("Put the coordinates for the bow of your battleship.");



    }

    }






