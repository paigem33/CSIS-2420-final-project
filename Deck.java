import java.util.Stack;

public class Deck {

    // deck of bingo cards
    private int amount;
    private Stack<Card> cards = new Stack<>();

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

    public StringBuilder getAllCards(){

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < cards.size(); i++){
            sb.append(getCard(i));
            sb.append("\n");
        }

        return sb;

    }

}
