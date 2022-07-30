import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Numbers {

    private List<List<Integer>> cardNumbers;

    public Numbers() {

        this.cardNumbers = generateNumbers();

    }

    public List<List<Integer>> getCardNumbers(){
        return cardNumbers;
    }

    private List<List<Integer>> generateNumbers() {
        List<List<Integer>> listOfIntegers = new LinkedList<>();
        int min = 1;
        int max = 12;

        for (int i = 0; i < 5; i++) {
            List<Integer> list = new LinkedList<>();

            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2)
                    list.add(0);
                else
                    list.add(ThreadLocalRandom.current().nextInt(min, max + 1));
            }
            listOfIntegers.add(list);
            max += 12;
            min += 12;
        }
        return listOfIntegers;
    }
}
