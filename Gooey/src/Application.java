import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;


public class Application extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -2517616123689799182L;

	public Application() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setSize(getSize().width, getSize().height);
        setBackground(Color.BLACK);

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Application ex = new Application();
                ex.setVisible(true);
            }
        });
    }
}