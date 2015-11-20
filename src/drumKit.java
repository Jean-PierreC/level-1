


import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class drumKit extends MouseAdapter {

    JLabel drumlabel;
    JLabel drumlabel2;

    public static void main(String[] args) throws Exception {
   	 new drumKit().getGoing();
    }

    private void getGoing() throws MalformedURLException {
   	 // 1. Make a JFrame variable and initialize it using "new JFrame()"
   	 JFrame one = new JFrame();
   	 // 2. Make the frame visible
   	 one.setVisible(true);
   	 // 3. Set the size of the frame
   	 one.setSize(2000, 2000);
   	 // 4. Set the title of the frame
   	 one.setTitle("Drum Kit");
   	 // 5. Make a JPanel and initialize it.
   	 JPanel two = new JPanel();
   	 // 6. Add the panel to the frame. (The panel is invisible.)
    one.add(two);
   	 // 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".
   	 // 8. Put the name of your image in a String variable.
    String drum = "PP327_Shimetaiko_Drum_with_Bachi.jpg";
   	 // 9. Use the "createLabelImage()" method to initialize the drumLabelWithImage variable.
   	 drumlabel = createLabelImage(drum);
   	 // 10. Add the image to the panel
    two.add(drumlabel);
   	 // 11. Set the layout of the panel to "new GridLayout()"
    two.setLayout(new GridLayout());
   	 // 12. call the pack() method on the frame

   	 // 13. add a mouse listener to drumLabelWithImage.
   	 drumlabel.addMouseListener(this);
   	 
   	JPanel cool = new JPanel();
  	 // 6. Add the panel to the frame. (The panel is invisible.)
   one.add(cool);
  	 // 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".
  	 // 8. Put the name of your image in a String variable.
   String drum2 = "PP327_Shimetaiko_Drum_with_Bachi.jpg";
  	 // 9. Use the "createLabelImage()" method to initialize the drumLabelWithImage variable.
  	 drumlabel2 = createLabelImage(drum2);
  	 // 10. Add the image to the panel
   two.add(drumlabel2);
  	 // 11. Set the layout of the panel to "new GridLayout()"
   two.setLayout(new GridLayout());
  	 // 12. call the pack() method on the frame
  	 one.pack();
  	 // 13. add a mouse listener to drumLabelWithImage.
  	 drumlabel2.addMouseListener(this);
  	 
    }

    public void mouseClicked(MouseEvent e) {
   	 // 14. When the mouse is clicked, print "mouse clicked"
System.out.println("mouse clicked");
   	 JLabel drumClicked = (JLabel) e.getSource();
   	 // 15. Download a drum sound and drop it into your "default package". There are some sounds here: http://bit.ly/drum-sounds or you can also get them from freesound.org
   	 // 16. If they clicked on the drumImage...
   	 String sound2="256954__jmayoff__drum-loop.wav";
 if (drumClicked.equals(drumlabel2)){
	 playSound(sound2);
 }
   		 // 17. ...use the playSound method to play a drum sound.
String sound = "139501__robertmcdonald__big-hit-1 (1).wav";
if (drumClicked.equals(drumlabel)){
playSound(sound);
}
   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
    }

    private JLabel createLabelImage(String fileName)
			throws MalformedURLException
	{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null)
		{
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}


    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}



