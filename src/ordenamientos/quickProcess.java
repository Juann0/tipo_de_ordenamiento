package ordenamientos;

import tipos_de_ordenamiento.read;

public class quickProcess {
	
	Integer arrayIntegerQuick[];
	String arrayStringQuick[];
	int tamanioArray = 0;
	static final int zero = 0;
	
	public quickProcess(int numberVarMenu2) {
		if(numberVarMenu2 == 1) {
			tamArrayInteger();
			printInteger();
			getPreQuickSort();
			printInteger();
		}else {
			tamArrayString();
			printString();
			getPreQuickSortString();
			printString();
		}
	}
	 /*String Quick*/
	private void tamArrayString() {
		tamanioArray = read.readInteger("Ingrese tamaño del arreglo.");
		arrayStringQuick = new String[tamanioArray]; //Asignacion de tamaño
		/*Llenamos arreglo*/
		llenadoArrayString();
		/*Llenamos arreglo*/
	}
	
	private void llenadoArrayString() {
		for(int i = 0; i < arrayStringQuick.length; i ++) {
			arrayStringQuick[i] = read.readString("Ingrese letra/nombre en la posicion (" + ( i + 1) + ")");
		}
	}
	
	private void getPreQuickSortString() {
		preQuickSort_set_quickSortSizeArrayPositionString(arrayStringQuick);
	}
	
	/*Punteros metodo de proceso*/
    private void preQuickSort_set_quickSortSizeArrayPositionString(String array[]) {
        POST_set_quickSortProcsString(array, zero, array.length - 1);
    }
    /*Fin de punteros de metodo de proceso*/
    
    private String[] POST_set_quickSortProcsString(String arrayStringQuick[], Integer punteroIzquierdo, Integer punteroDerecho) {
        int i = punteroIzquierdo;
        int j = punteroDerecho;
        String auxiliarReferent;
		int numberReferent;
        if(punteroIzquierdo >= punteroDerecho)
            return arrayStringQuick;
        if(punteroIzquierdo != punteroDerecho) {
            numberReferent = punteroIzquierdo;
            while(punteroIzquierdo != punteroDerecho) {
                while(arrayStringQuick[punteroDerecho].compareToIgnoreCase(arrayStringQuick[numberReferent]) >= 0 && punteroIzquierdo < punteroDerecho) {
                    punteroDerecho --;
                    while(arrayStringQuick[punteroIzquierdo].compareToIgnoreCase(arrayStringQuick[numberReferent]) < 0 && punteroIzquierdo < punteroDerecho) {
                        punteroIzquierdo ++;
                    }
                }
                if(punteroDerecho != punteroIzquierdo) {
                    auxiliarReferent = arrayStringQuick[punteroDerecho];
                    arrayStringQuick[punteroDerecho] = arrayStringQuick[punteroIzquierdo];
                    arrayStringQuick[punteroIzquierdo] = auxiliarReferent;
                }
                if(punteroIzquierdo == punteroDerecho) {
                    POST_set_quickSortProcsString(arrayStringQuick, i, punteroIzquierdo - 1);
                    POST_set_quickSortProcsString(arrayStringQuick, punteroIzquierdo + 1, j);
                }
            }
        }else {
            return arrayStringQuick;
        }
        return  this.arrayStringQuick;
    }
	
	private void printString() {
		 System.out.print("\n");
	        for(int i = 0; i < arrayStringQuick.length; i ++) {
	            System.out.print(" " + arrayStringQuick[i] + " ");
	        }
	        System.out.print("\n");
	}
	/*String Quick*/
	
	/*Integer Quick*/
	private void tamArrayInteger() {
		tamanioArray = read.readInteger("Ingrese tamaño del arreglo.");
		arrayIntegerQuick = new Integer[tamanioArray]; //Asignacion de tamaño
		/*Llenamos arreglo*/
		llenadoArrayInteger();
		/*Llenamos arreglo*/
		tamanioArray = 0;
	}
	
	private void getPreQuickSort() {
		preQuickSort_set_quickSortSizeArrayPosition(arrayIntegerQuick);
	}
	
	/*Punteros metodo de proceso*/
    private void preQuickSort_set_quickSortSizeArrayPosition(Integer array[]) {
        POST_set_quickSortProcs(array, zero, array.length - 1);
    }
    /*Fin de punteros de metodo de proceso*/
    
    private Integer[] POST_set_quickSortProcs(Integer arrayIntegerQuick[], Integer punteroIzquierdo, Integer punteroDerecho) {
        int i = punteroIzquierdo;
        int j = punteroDerecho;
        int auxiliarReferent, numberReferent;
        if(punteroIzquierdo >= punteroDerecho)
            return arrayIntegerQuick;
        if(punteroIzquierdo != punteroDerecho) {
            numberReferent = punteroIzquierdo;
            while(punteroIzquierdo != punteroDerecho) {
                while(arrayIntegerQuick[punteroDerecho] >= arrayIntegerQuick[numberReferent] && punteroIzquierdo < punteroDerecho) {
                    punteroDerecho --;
                    while(arrayIntegerQuick[punteroIzquierdo] < arrayIntegerQuick[numberReferent] && punteroIzquierdo < punteroDerecho) {
                        punteroIzquierdo ++;
                    }
                }
                if(punteroDerecho != punteroIzquierdo) {
                    auxiliarReferent = arrayIntegerQuick[punteroDerecho];
                    arrayIntegerQuick[punteroDerecho] = arrayIntegerQuick[punteroIzquierdo];
                    arrayIntegerQuick[punteroIzquierdo] = auxiliarReferent;
                }
                if(punteroIzquierdo == punteroDerecho) {
                    POST_set_quickSortProcs(arrayIntegerQuick, i, punteroIzquierdo - 1);
                    POST_set_quickSortProcs(arrayIntegerQuick, punteroIzquierdo + 1, j);
                }
            }
        }else {
            return arrayIntegerQuick;
        }
        return  this.arrayIntegerQuick;
    }
	
	private void llenadoArrayInteger() {
		for(int i = 0; i < arrayIntegerQuick.length; i ++) {
			arrayIntegerQuick[i] = read.readInteger("Ingrese numero en la posicion (" + ( i + 1) + ")");
		}
	}
	
	private void printInteger() {
		 System.out.print("\n");
	        for(int i = 0; i < arrayIntegerQuick.length; i ++) {
	            System.out.print(" " + arrayIntegerQuick[i] + " ");
	        }
	        System.out.print("\n");
	}
	/*Integer Quick*/
}
