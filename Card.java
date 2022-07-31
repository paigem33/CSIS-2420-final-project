import java.util.List;

public class Card {

    // single bingo card

    private List<List<Integer>> cardNumbers;

    public Card(int id){

        Numbers numbers = new Numbers();
        this.cardNumbers = numbers.getCardNumbers();

    }

    public String toString(){

        List<Integer> list;
        StringBuilder sb = new StringBuilder();
        String[] strPrefix = {"B", "I", "N", "G", "O"};

        for (int i = 0; i < cardNumbers.size(); i++) {
            sb.append(String.format("    %s  ", strPrefix[i]));
        }
        sb.append("\n");

        for (int i = 0; i < cardNumbers.size(); i++) {
            list = cardNumbers.get(0);

            for (int j = 0; j < cardNumbers.size(); j++) {
                if(list.get(i) == 0){
                    sb.append(String.format(" %s  ", "FREE"));
                } else {
                    sb.append(String.format("%5d  ", list.get(i)));
                }
                if(j + 1 != 5){
                    list = cardNumbers.get(j + 1);
                }
            }

            sb.append("\n");

        }
        return sb.toString();
    }

}
