import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class BeepApplet extends Applet {
  
   /**
	 * 
	 */
	private static final long serialVersionUID = 6611741614426653902L;

public void init () {
   
     // Construct the button
     Button beep = new Button("Beep");

     // add the button to the layout
     this.add(beep);

     // specify that action events sent by this
     // button should be handled by a new BeepAction object
     beep.addActionListener((ActionListener) new Button("Beep"));
   
   }

}