import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	
String Input=JOptionPane.showInputDialog(null, "How tall are you, in inches?");
	int hieght= Integer.parseInt(Input);
	if(hieght>48){
	System.out.println("You can go onto the rollercoaster");
	}
	else {
		System.out.println("You have to grow taller!!");
	}
	
}
}
