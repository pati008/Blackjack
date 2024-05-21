
import java.util. Scanner;
public class Casino {

    public Card[] deck;
    public boolean isHit= false; //help us keep track of whether user has chosen to hit or stay
    public Player p;
    public Player d;


    public static void main(String[] args) {

        Casino c = new Casino();
    }

    public Casino() {
        System.out.println("welcome to Pati's Casino!");
        makeDeck();
        shuffle();
        printDeck();
        p = new Player();
        p.isPlayer=true;
        d= new Player();
        d.isPlayer=false;
        deal();

        Scanner scan = new Scanner (System.in);
        System.out.println("What is your name?");
        String userName = scan.nextLine();
        System.out.println(userName);
        p.playerName= userName;
        p.print();
        d.print();








    }

    public void shuffle(){
        for(int x=0; x<52; x++){
          int randomIndex =  (int)(Math.random()*52);
           Card randomCard = deck[randomIndex];



           Card temp= deck[x];
           deck[x]= randomCard;
           deck[randomIndex]= temp;


        }


    }

    public void printDeck(){
        for(int i=0;i<deck.length;i++){
            deck[i].print();
        }
    }



    public void makeDeck(){

        deck = new Card[52];
        int count = 0;

        for (int t = 0; t < 13; t++) {
            for (int s = 0; s < 4; s++) {
                deck[count] = new Card(t, s);
                deck[count].print();
                count++;
            }
        }
    }
    public void deal (){
        p.hand[0]= deck[0];
        p.hand[1]= deck[1];

        p.addCard(deck[0]);
        p.addCard(deck[1]);


        d.addCard(deck[2]);
        d.addCard(deck[3]);

    }



}





