public class Card {

    public String name;
    public String suit;
    public int cardValue; // total points of dealt cards , score

    public Card (int suitNum, int cardNum){

        // CHOOSING A SUIT
        if(suitNum == 0){
            suit = "spades";
        }
        else if(suitNum == 1){
            suit = "daimonds";
        }
        else if(suitNum == 2){
            suit = "clubs";
        }
        else if(suitNum == 3){
            suit = "hearts";
        }

        //CHOOSING A CARD
        if(cardNum == 2){
            name = "two";
            cardValue = 2;
        }
        if(cardNum == 3){
            name = "three";
            cardValue = 3;
        }
        if(cardNum == 4){
            name = "four";
            cardValue = 4;
        }
        if(cardNum == 5){
            name = "five";
            cardValue = 5;
        }
        if(cardNum == 6){
            name = "six";
            cardValue = 6;
        }
        if(cardNum == 7){
            name = "seven";
            cardValue = 7;
        }
        if(cardNum == 8){
            name = "eight";
            cardValue = 8;
        }
        if(cardNum == 9){
            name = "nine";
            cardValue = 9;
        }
        if(cardNum == 10){
            name = "ten";
            cardValue = 10;
        }
        if(cardNum == 11){
            name = "jack";
            cardValue = 10;
        }
        if(cardNum == 12){
            name = "queen";
            cardValue = 10;
        }
        if(cardNum == 13){
            name = "king";
            cardValue = 10;
        }
        if(cardNum == 14){
            name = "ace";
            cardValue = 11;
        }




    }

    public void printCardInfo(){
        System.out.println(name + " of " + suit);
    }




}
