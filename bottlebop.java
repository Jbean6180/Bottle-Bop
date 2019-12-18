import java.util.Scanner;
class Main {
 
   
    public static void main(String[] args) {
        int beerBottles = 99;
        String word;
        while(beerBottles >= 0) {
            word = "bottles";
            if(beerBottles != 0) {
                System.out.println(beerBottles + " " + word + " of beer on the wall, "+ beerBottles + " " + word + " of beer." );
                beerBottles--;

                if(beerBottles == 1) {
                    word = "bottle";
                }

                if(beerBottles > 0) {
                    System.out.println("Take one down and pass it around, " + beerBottles + " " + word +" of beer on the wall.");           
                } else {
                    System.out.println("Take one down and pass it around, no more " + word +" of beer on the wall.");           
                }
            } else {
                System.out.println("No more " + word + " of beer on the wall, no more " + word + " of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
                break;
            }
            System.out.println();
        }

    }
}
