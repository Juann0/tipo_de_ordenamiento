package tipos_de_ordenamiento;

import ordenamientos.burbleProcess;
import ordenamientos.quickProcess;

public class menuMain {

	public static void main(String[] args) {
		/*Variables del menu*/
		int numberVarOption = 0;
		int numberVarMenu2 = 0;
		int numberVarMenu3 = 0;
		String menu = "1. Burbuja.\n2. Shell.\n3. Quick.\n0. Salir.";
		String menu2 = "1. Ingreso de numeros.\n2. Ingreso de letras.\n0. Atras.";
		String menu3 = "1. menor a mayor.\n2. mayor a menor.\n0. Atras.";
		/*Variables del menu*/
		
		/*Ciclo del menu*/
		while(true) {
			numberVarOption = read.readInteger(menu);
			if(numberVarOption == 1) {
				//Condicion del burble
				numberVarMenu2 = read.readInteger(menu2);
				if(numberVarMenu2 == 1) {
					numberVarMenu3 = read.readInteger(menu3);
					if(numberVarMenu3 == 1) {
						new burbleProcess(numberVarMenu2, numberVarMenu3);
					}else if(numberVarMenu3 == 2) {
						new burbleProcess(numberVarMenu2, numberVarMenu3);
					}else {
						//atrás
					}
				}else if(numberVarMenu2 == 2) {
					numberVarMenu3 = read.readInteger(menu3);
					if(numberVarMenu3 == 1) {
						new burbleProcess(numberVarMenu2, numberVarMenu3);
					}else if(numberVarMenu3 == 2) {
						new burbleProcess(numberVarMenu2, numberVarMenu3);
					}else {
						//atrás
					}
				}else {
					//atrás
				}
				//Condicion del burble
			}else if(numberVarOption == 2) {
				
				System.out.println("Shell");
				
			}else if(numberVarOption == 3) {
				//Condiciones del quick
				numberVarMenu2 = read.readInteger(menu2);
				if(numberVarMenu2 == 1) {
					new quickProcess(numberVarMenu2);
				}else if(numberVarMenu2 == 2) {
					new quickProcess(numberVarMenu2);
				}else {
					//Atrás
				}
				//Condiciones del quick
			}else if(numberVarOption == 0) {
				break; /*Condicion de salida*/
			}
		}
		/*Ciclo del menu*/
	}

}
