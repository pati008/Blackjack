
import java.util. Scanner;
public class Casino {

    public Card[] deck;
    public int  numDealtCard;
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
        String decision= "";
        String totalValue="";

        while(!decision.equals("stand")&&p.currentValue<=21){


            System.out.println("Do you want to stand or hit?");
            decision = scan.nextLine();
            if (decision.equals("hit")) {
                isHit = true;
                p.addCard(deck[numDealtCard]);
                numDealtCard++;
                p.print();

                System.out.println("You decided to hit.");

            } else{
                isHit = false;
                System.out.println("You decided to stand.");
            }

            System.out.println("Do you want to see your total value?");
            totalValue=scan.nextLine();
            if(totalValue.equals("yes")) {
                printTotalValue();
            }else {
                System.out.println("You have decided to do the math");
            }



        }
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
        numDealtCard=4;

    }

    public void printTotalValue() {
        int totalValue = 0;
        for (int i = 0; i < numDealtCard; i++) {
            totalValue += p.hand[i].value;
        }
        System.out.println(p.playerName + "'s total hand value is: " + totalValue);
    }
}









