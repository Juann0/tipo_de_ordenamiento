package ordenamientos;

import tipos_de_ordenamiento.read;

public class burbleProcess {

	int tamIntArray = 0;
	int arrayInt[];
	String arrayString[];
	
	public burbleProcess(int numberVarMenu2, int numberVarMenu3) {/*Constructor*/
		if(numberVarMenu2 == 1 /*numeros*/) {
			if(numberVarMenu3 == 1 /*menor a mayor*/) {
				tamIntArray = read.readInteger("Ingrese tamaño del arreglo.");
				arrayInt = new int[tamIntArray];
				llenadoInt();
				printInt();
				ordenamientoMenorMayorEntero();
				printInt();
			}else /*mayor a menor*/{
				tamIntArray = read.readInteger("Ingrese tamaño del arreglo.");
				arrayInt = new int[tamIntArray];
				llenadoInt();
				printInt();
				ordenamientoMayorMenorEntero();
				printInt();
			}
		}else /*letras*/{
			if(numberVarMenu3 == 1 /*menor a mayor*/) {
				tamIntArray = read.readInteger("Ingrese tamaño del arreglo.");
				arrayString = new String[tamIntArray];
				llenadoString();
				printString();
				ordenamientoMenorMayorEnteroString();
				printString();
			}else /*mayor a menor*/{
				tamIntArray = read.readInteger("Ingrese tamaño del arreglo.");
				arrayString = new String[tamIntArray];
				llenadoString();
				printString();
				ordenamientoMayorMenorEnteroString();
				printString();
			}
		}
	}/*Constructor*/
	
	private void ordenamientoMayorMenorEntero() {
		for(int i = 0; i < arrayInt.length - 1; i ++) {
			for(int j = 0; j < arrayInt.length - 1; j ++) {
				if(arrayInt[j] < arrayInt[j + 1]) {
					int auxVar = arrayInt[j + 1];
					arrayInt[j + 1] = arrayInt[j];
					arrayInt[j] = auxVar;
				}
			}
		}
	}
	
	private void ordenamientoMenorMayorEntero() {
		for(int i = 0; i < arrayInt.length - 1; i ++) {
			for(int j = 0; j < arrayInt.length - 1; j ++) {
				if(arrayInt[j] > arrayInt[j + 1]) {
					int auxVar = arrayInt[j + 1];
					arrayInt[j + 1] = arrayInt[j];
					arrayInt[j] = auxVar;
				}
			}
		}
	}
	
	private void ordenamientoMenorMayorEnteroString() {
		for(int i = 0; i < arrayString.length - 1; i ++) {
			for(int j = 0; j < arrayString.length - 1; j ++) {
				if(arrayString[j].compareToIgnoreCase(arrayString[j + 1]) > 0) {
					String auxVar = arrayString[j + 1];
					arrayString[j + 1] = arrayString[j];
					arrayString[j] = auxVar;
				}
			}
		}
	}
	
	private void ordenamientoMayorMenorEnteroString() {
		for(int i = 0; i < arrayString.length - 1; i ++) {
			for(int j = 0; j < arrayString.length - 1; j ++) {
				if(arrayString[j].compareToIgnoreCase(arrayString[j + 1]) < 0) {
					String auxVar = arrayString[j + 1];
					arrayString[j + 1] = arrayString[j];
					arrayString[j] = auxVar;
				}
			}
		}
	}
	
	private void llenadoInt() {
		for(int i = 0; i < arrayInt.length; i ++) {
			arrayInt[i] = read.readInteger("Ingrese numero posicion (" + (i + 1) + ")");
		}
	}
	
	private void llenadoString() {
		for(int i = 0; i < arrayString.length; i ++) {
			arrayString[i] = read.readString("Ingrese letra/nombre posicion (" + (i + 1) + ")");
		}
	}
	
	private void printInt() {
		System.out.println("");
		for(int i = 0; i < arrayInt.length; i ++) {
			System.out.print(" " + arrayInt[i] + " ");
		}
		System.out.println("");
	}
	
	private void printString() {
		System.out.println("");
		for(int i = 0; i < arrayString.length; i ++) {
			System.out.print(" " + arrayString[i] + " ");
		}
		System.out.println("");
	}

}
