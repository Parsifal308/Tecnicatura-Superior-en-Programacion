#include <iostream>
#include <fstream>
using namespace std;

int main(int argc, char *argv[]) {
	
	ifstream archivoTXT("datos09.txt");
	double cabezal;		//varible cabezal de lectura del archivo datos9.txt
	double sumatoria = 0;		//variable para ir almacenando la suma de valores
	double promedio = 0;
	int contador = 0;
	
	if(archivoTXT.is_open()){	//verificacion de correcta lectura del archivo
		cout<<"El archivo de texto 'datos09.txt' se abrio correctamente";
		while(archivoTXT >> cabezal){	//bucle de lectura de datos del archivo datos9.txt
			if(cabezal == 0){	//punto de interrupcion de lectura, para este caso en particualr "0"
				break;
			}else{
				sumatoria += cabezal;
				contador++;
			}
		}
		promedio = sumatoria / contador;
		cout<<"\nEl promedio de los "<<contador<<" numeros leidos es: "<<promedio;	//se muestra en pantalla el numero mayor, al final del recorrido
	}else{
		cout<<"No se pudo abrir el archivo de texto 'datos03.txt'"; //muestra en pantalla mensaje, en caso de no poder acceder al archivo de texto
	}
	
	return 0;
}
