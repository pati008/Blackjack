public class Player {

    public int currentValue;
    public Card []hand;
    public String playerName;
    public boolean isPlayer;
    public boolean hit;
    public boolean stay;


    public Player (int pcurrentValue, Card pHand, String pPlayerName, boolean pIsPlayer, boolean pHit, boolean pStay){

    }

    public void print(){
        System.out.println("Hi " + playerName+ "! I see that it is  " + isPlayer +" that you are a player." + playerName+ "you currently hold " + hand +" with the value of " + currentValue);
    }

}
