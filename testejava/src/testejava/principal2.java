package testejava;
import java.util.Iterator;

import javax.swing.JOptionPane;
public class principal2 {
	public static void main(String[] args) {
		String frase;
		int tam;
		
		frase = JOptionPane.showInputDialog("Digite uma frase");
		tam = frase.length();
		
		//imprimir a frase na tela Sem as vogais
		for (int i=0; i<tam;  i++) {
			if (frase.charAt(i) != 'a' && frase.charAt(i) != 'A' &&
				frase.charAt(i) != 'a' && frase.charAt(i) != 'A' &&
				frase.charAt(i) != 'a' && frase.charAt(i) != 'A' &&
				frase.charAt(i) != 'a' && frase.charAt(i) != 'A' &&
			    frase.charAt(i) != 'a' && frase.charAt(i) != 'A' &&)
				{
				
			}
		}
	}
}

