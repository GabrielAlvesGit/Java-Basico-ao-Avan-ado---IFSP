package testejava;

import javax.swing.JOptionPane;

	public class principal {
		
		public static void main(String[] args) {
			float nota1;
			float nota2;
			float media;
			
			nota1= Float.parseFloat(JOptionPane.showInputDialog("Digite uma nota"));
			nota2= Float.parseFloat(JOptionPane.showInputDialog("Digite uma nota"));
			
			media = (nota1 +  nota2)/2;
			JOptionPane.showMessageDialog(null,"Media = " + media);
			
	
			
		}
		
}
