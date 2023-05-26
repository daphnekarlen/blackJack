import java.util.ArrayList;

public class Casino {

    ArrayList<Card>deck;

    public static void main(String[] args) {
       Casino table = new Casino();
    }

    public Casino(){
        createDeck();

        printDeck();
    }

    public void createDeck(){

        deck = new ArrayList<>();
        // loop through each suit 0-3
        // loop through each card number (13 of them, 2 through ace)
        for(int x=0; x<4; x++){
            for(int y=2; y<15; y++){
                deck.add(new Card(x,y));
            }
        }
    }


    public void printDeck(){
        for(int a=0; a<52; a++){
            deck.get(a).printCardInfo(); // card (you can do . any of the card stuff
        }

    }
    public void shuffle(){}
    public void deal(){}


}