import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
String Input=JOptionPane.showInputDialog("How old are you?");
int age =Integer.parseInt(Input);
if(age>18) {
System.out.println("who do you think the next president sould be?");
}

else {
	System.out.println("nobody cares what you think!!!");
}



}
}
