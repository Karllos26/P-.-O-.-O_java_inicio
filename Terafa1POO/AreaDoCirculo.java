package tarefa;

import javax.swing.JOptionPane;

public class AreaDoCirculo {

	/*4.Faça uma classe que peça o raio de um círculo, 
	 calcule e mostre sua área. 
	*/
	public static void main(String[] args) {
		
		float raio = Float.parseFloat(JOptionPane.showInputDialog("Entre com o raio da circunferência em centimentros"));
	
	float areacirc = 3.14f * (raio * raio);
	
	JOptionPane.showMessageDialog(null, "A área da circunferência é de: "+areacirc+ "cm²");
	}
	
	
}
