package tarefa;

import javax.swing.JOptionPane;
/*3.Elabore uma aplicação que apresente no final o 
 somatório dos valores pares existentes na 
 faixa de 1 até 500.
 * */
public class SomaParUmAQuinhentos {

	public static void main(String[] args) {
		int soma = 0;
		for(int num = 1;num <=500;num++) {
			
			if(num % 2 == 0) {
				
				soma += num;
				
			}
		}
		JOptionPane.showMessageDialog(null, "A soma dos números pares de 1 a 500 é: " + soma);
	}
	
}
