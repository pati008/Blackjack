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
            for(int i=0; i<hand.length; i++){

                hand[i].print();
            }

        }else{
            System.out.println("Hi Dealer!!");
            System.out.println("the dealer has"+ hand[0].value + "points");
            hand[0].print();
        }



    }



    public void addCard( Card c){
        if(numCards>=2){
            Card[] moreCards=new Card[hand.length+1];
            for(int i=0; i<2; i++){
                moreCards[i]=hand[i];
            }
            hand=moreCards;
        }
        hand[numCards]=c;
        numCards= numCards+1;
        currentValue= currentValue+c.value;
    }

}
