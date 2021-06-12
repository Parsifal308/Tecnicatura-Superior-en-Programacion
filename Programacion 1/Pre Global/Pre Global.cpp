#include <iostream>
#include <fstream>
#include <math.h>
using namespace std;

ifstream archivoDeTexto("MisDatos.txt"); //CAMBIAR EL NOMBRE SEGUN EL DOCUMENTO DADO POR EL PROFESOR
double cabezal;	//CAMBIAR EL TIPO DE DATO DE ESTA VARIABLE SEGUN LOS DATOS DADOS DENTRO DEL TEXTO


void CargarArchivo (ifstream archivo){
	if(archivo.is_open()){
		cout<<"El archivo se abrio correctamente\n";
	}
}



int main(int argc, char *argv[]) {
	
	return 0;
}

