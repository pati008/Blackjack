public class Player {

    public int currentValue;
    public Card []hand;
    public String playerName;
    public boolean isPlayer;
    public boolean hit;
    public boolean stay;

    public int numCards;


    public Player (){
        currentValue= 0;
        playerName= "Pati";
        isPlayer=true;
        hand= new Card[2];
        numCards= 0;

    }




    public void print(){


        if(isPlayer==true) {
            System.out.println("Hi " + playerName + "! I see that it is  " + isPlayer + " that you are a player." + playerName + ", you have " + currentValue + " points.");
        }else{
            System.out.println("Hi Dealer!!");
        }

        for(int i=0; i<hand.length; i++){

            hand[i].print();
        }


    }



    public void addCard( Card c){
        hand[numCards]=c;
        numCards= numCards+1;
    }

}
