#include <iostream>
#include <fstream>
using namespace std;

int main(int argc, char *argv[]) {
	
	ifstream archivoTXT("datos03.txt");
	double cabezal;		//varible cabezal de lectura del archivo datos3.txt
	double mayor;		//variable para ir almacenando el mayor
	bool primerLectura = true;	//bandera para realizar la primer asignacion a la varible mayor, al comienzo del bucle While
	
	if(archivoTXT.is_open()){	//verificacion de correcta lectura del archivo
		cout<<"El archivo de texto 'datos03.txt' se abrio correctamente";
		
		while(archivoTXT >> cabezal){	//bucle de lectura de datos del archivo datos3.txt
			if(cabezal == 0.0f){	//punto de interrupcion de lectura, para este caso en particualr "0.0"
				break;
			}else{
				if(primerLectura == true){	//verificacion de primer lectura de datos
					mayor = cabezal;
					primerLectura = false;	//se asigna bandera "false" luego de la primer lectura
				}else{
					if(cabezal > mayor){
						mayor = cabezal;
					}
				}
			}
		}
		cout<<"\nEl numero mayor es: "<<mayor;	//se muestra en pantalla el numero mayor, al final del recorrido
	}else{
		cout<<"No se pudo abrir el archivo de texto 'datos03.txt'"; //muestra en pantalla mensaje, en caso de no poder acceder al archivo de texto
	}
	
	return 0;
}

