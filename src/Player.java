public class Player {

    public int currentValue;
    public Card []hand;
    public String playerName;
    public boolean isPlayer;
    public boolean hit;
    public boolean stay;


    public Player (){
        currentValue= 0;
        playerName= "Pati";
        isPlayer=true;
        hand= new Card[2];
    }


    public void print(){
        if(isPlayer=true) {
            System.out.println("Hi " + playerName + "! I see that it is  " + isPlayer + " that you are a player." + playerName + ", you have " + currentValue + " points.");
        }else{
            System.out.println("Hi Dealer!!");
        }


    }

}
