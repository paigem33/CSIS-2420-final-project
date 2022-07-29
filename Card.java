import java.util.List;

public class Card {

    // single bingo card

    private List<List<Integer>> cardNumbers;

    public Card(int id){

        Numbers numbers = new Numbers();
        this.cardNumbers = numbers.generateNumbers();

    }

    public String toString(){

        // TODO: format card in the following when it is called
        // B I N  G  O
        // 1 6 11 16 21
        // 2 7 12 17 22
        // 3 8 FREE 18 23
        // 4 9 14 19 24
        // 5 10 15 20 25

        return null;

    }

}
