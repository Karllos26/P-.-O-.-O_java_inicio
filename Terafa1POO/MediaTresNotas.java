package tarefa;

import javax.swing.JOptionPane;

public class MediaTresNotas {

	/*2.Faça uma classe que peça as 3notas bimestrais 
	 e mostre a média. 
	*/
	public static void main(String[] args) {
		
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a primeira nota: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a segunda nota:"));
		float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a terceira nota:"));
	
		
		float media = (nota1 + nota2 + nota3) /3 ;
		
		JOptionPane.showMessageDialog(null, "A média do aluno é: "+ media);
	}
}
