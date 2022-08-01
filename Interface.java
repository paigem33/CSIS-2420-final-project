import javax.swing.*;

public class Interface {

    static Deck deck;

    static JButton button1 = new JButton("Submit");
    static JTextArea textArea1;

    static JButton button2 = new JButton("Submit");
    static JTextArea textArea2;

    static JButton button3 = new JButton("Submit");
    static JTextArea textArea3;


    public static void main(String[ ] args) {

        JFrame frame = new JFrame();

        startScreen(frame);

        frame.setSize(600,500); //400 width and 500 height
        frame.setLayout(null); //using no layout managers
        frame.setVisible(true); //making the frame visible

        button1.addActionListener(e -> {

            String result = textArea1.getText();
            if(result != null && result.length() > 0){
                // call next screen
                showCards(frame, Integer.parseInt(result), true);

            }
        });

    }

    public static void startScreen(JFrame frame){

        JLabel label = new JLabel("How many Bingo cards would you like?");
        label.setBounds(175,150,250, 40);

        textArea1 = new JTextArea("");
        textArea1.setBounds(175,189,120, 30);
        frame.add(textArea1);

        button1 = new JButton("Submit");
        button1.setBounds(300,185,125, 40);

        frame.add(label);
        frame.add(button1);

    }

    public static void showCards(JFrame frame, int amount, boolean newDeck){

        frame.getContentPane().removeAll();
        frame.repaint();

        if(newDeck || deck == null){
            deck = new Deck(amount);
        }

        int x = 25;
        int y = -175;

        for(int i = 0; i < amount; i++){

            JLabel label = new JLabel("<html>" + deck.getCard(i) + "<br></html>");
            label.setBounds(x,y,600, 500);
            frame.add(label);

            if(i + 1 == 4){
                x = 25;
                y = -50;
            } else if(i + 1 == 8){
                x = 25;
                y = 75;
            }else {
                x = x + 125;
            }

        }

        JLabel label2 = new JLabel("See Specific Card: ");
        label2.setBounds(50,y + 75,600, 500);

        textArea2 = new JTextArea("");
        textArea2.setBounds(170,y + 310,30, 30);

        button2 = new JButton("Submit");
        button2.setBounds(200,y + 305,75, 40);

        frame.add(label2);
        frame.add(textArea2);
        frame.add(button2);

        JLabel label3 = new JLabel("Create New Deck: ");
        label3.setBounds(308,y + 75,600, 500);

        textArea3 = new JTextArea("");
        textArea3.setBounds(425,y + 310,30, 30);

        button3 = new JButton("Submit");
        button3.setBounds(455,y + 305,75, 40);

        frame.add(label3);
        frame.add(textArea3);
        frame.add(button3);

        button3.addActionListener(e3 -> {

            String result3 = textArea3.getText();
            if(result3 != null && result3.length() > 0){
                // call next screen
                showCards(frame, Integer.parseInt(result3), true);
            }
        });

        button2.addActionListener(e2 -> {

            String result2 = textArea2.getText();
            if (result2 != null && result2.length() > 0) {
                // call next screen
                showCard(frame, Integer.parseInt(result2));
            }

        });

    }

    public static void showCard(JFrame frame, int card){

        frame.getContentPane().removeAll();
        frame.repaint();

        JLabel label = new JLabel("<html>" + deck.getCard(card) + "<br></html>");
        label.setBounds(25,-175,600, 500);
        frame.add(label);

        JLabel label2 = new JLabel("See All Cards: ");
        label2.setBounds(50,-175 + 75,600, 500);

        button2 = new JButton("Submit");
        button2.setBounds(135,-175 + 305,75, 40);

        frame.add(label2);
        frame.add(button2);

        JLabel label3 = new JLabel("Create New Deck: ");
        label3.setBounds(308,-175 + 75,600, 500);

        textArea3 = new JTextArea("");
        textArea3.setBounds(425,-175 + 310,30, 30);

        button3 = new JButton("Submit");
        button3.setBounds(455,-175 + 305,75, 40);

        frame.add(label3);
        frame.add(textArea3);
        frame.add(button3);

        button3.addActionListener(e3 -> {

            String result3 = textArea3.getText();
            if(result3 != null && result3.length() > 0){
                // call next screen
                showCards(frame, Integer.parseInt(result3), true);
            }
        });

        button2.addActionListener(e2 -> {

            showCards(frame,deck.getSize(), false);

        });

    }

}
