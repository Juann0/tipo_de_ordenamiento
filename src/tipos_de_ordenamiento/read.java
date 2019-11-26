package tipos_de_ordenamiento;
import javax.swing.*;

public class read {

	@SuppressWarnings("finally")
	public static int readInteger(String warning) {
		int number = 0, error = 0;
		do {
			try {
				error = 0;
				number = Integer.parseInt(JOptionPane.showInputDialog(warning));
			}catch(Exception e) {
				error = 1;
				JOptionPane.showMessageDialog(null, "Solo numeros enteros.");
			}finally {
				break;
			}
		}while(error == 1);
		return number;
	}
	
	@SuppressWarnings("finally")
	public static String readString(String warning) {
		String var = "";
		int error = 0;
		do {
			try {
				error = 0;
				var = JOptionPane.showInputDialog(null, warning);
			}catch(Exception e) {
				error = 1;
				JOptionPane.showMessageDialog(null, "Error en la lectura.");
			}finally {
				break;
			}
		}while(error == 1);
		return var;
	}
}
