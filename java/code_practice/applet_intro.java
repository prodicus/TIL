/*import java.awt.*;
import java.applet.*;

class applet_intro{
	public static void main(String[] args) {
		System.out.println(""); 
	}
}*/

import java.awt.*;
import java.applet.*;

public class applet_intro extends Applet {
	public void paint(Graphics g){
		g.drawOval(40, 40, 120 , 250);
	}
}