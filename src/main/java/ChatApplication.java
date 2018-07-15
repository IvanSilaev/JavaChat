import javax.swing.*;

public class ChatApplication extends JFrame {
    private String tittle;

    private final int initialWidth = 800;
    private final int initialHeigth = 600;

    public ChatApplication(String tittle) {
        this.tittle = tittle;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(initialWidth, initialHeigth);
        setTitle(tittle);
        setVisible(true);
    }


    public static void main(String[] args) {
        ChatApplication chatApplication = new ChatApplication("Chatty");
    }
}
