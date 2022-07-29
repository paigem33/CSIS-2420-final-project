import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Deck {

    // deck of bingo cards
    private int amount;
    private Stack<Card> cards;

    public Deck(int amount){

        this.amount = amount;

        for(int i = 0; i < amount; i++){

            Card card = new Card(i);
            cards.add(card);

        }

    }

    public String getCard(int id){

        Card card = cards.get(id);
        return card.toString();

    }

}
