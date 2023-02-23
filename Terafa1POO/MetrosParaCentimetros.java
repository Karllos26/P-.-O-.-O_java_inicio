package tarefa;

import javax.swing.JOptionPane;

public class MetrosParaCentimetros {

	/*3.Faça uma classe que converta metros para 
	 centímetros. 
	*/
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Transformar metros em centimetros!");
		float metros = Float.parseFloat(JOptionPane.showInputDialog("Digite quantos metros quer transfomar em centimetros: "));
		
		float centimetros = metros * 100;
		
		JOptionPane.showMessageDialog(null,metros +" metros, são: "+centimetros+"centimetros");
	}
	
}
