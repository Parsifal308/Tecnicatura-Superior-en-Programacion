#include <iostream>
#include <fstream>
#include<vector>
#include <math.h>
using namespace std;

/*
IMPORTANTE: DEBIDO A QUE EL EJERCICIO EN EL CAMPUS DICE QUE SON 100 VALORES, PERO DENTRO DE LA MUESTRA SE ENCUENTRAN INDICA QUE SON 80
	HE DECIDIDO, ELIMINAR DEL DOCUMENTO DE TEXTO EL PRIMER VALOR QUE INDICA LA CANTIDAD DE VALORES, PARA ASI LOGRAR
	QUE EL CODIGO FUNCIONE PARA DOCUMENTOS DE TEXTO DE CUALQUIER CANTIDAD DE MUESTRAS.
*/



int contador = 0;
double cabezal;



//Funcion que se encarga de leer el documento de texto y cargar los valores del mismo dentro de un vector
vector<double> CargarVector(){
	ifstream miArchivo("datos3.txt");
	double cabezal;
	bool primerLectura = true;
	
	if(miArchivo.is_open()){
		cout<<"El archivo se abrio correctamente\n";
		vector<double> miVector;	//se crea el vector con el tamaño necesario
		
		while(miArchivo >> cabezal){  //Se leen los valores del documento
			if((cabezal==0)){ //si se lee un 0, se finaliza la lectura del archivo
				break;
			}
			miVector.push_back(cabezal); //se carga en el vector el numero leido por el cabezal
		}
		
		miArchivo.close(); //se cierra el archivo de texto
		return miVector;
	
	}else{
		cout<<"No se pudo abrir el archivo";
		exit(1);
	}
}
//-------------------------------------------------------------------------------------------------
	
	
	
	
//Funcion que, dado un vector cargado de valores, calcula la desviacion estandar de los mismo
double DesviacionEstandar(vector<double> vectorDeValores){
	double aux1;
	double mediaAritmetica = 0;
	double desviacionEstandar;
	for (int i=0; i < vectorDeValores.size(); i++){	//se calcula la media aritmetica de los numeros contenidos en el vector
			mediaAritmetica += vectorDeValores[i];
	}
	mediaAritmetica = mediaAritmetica / vectorDeValores.size();
	
	for (int i=0; i < vectorDeValores.size(); i++){	//sumatoria de cada elemento menos la media aritmetica, elevado al cuadrado
		aux1 += pow(vectorDeValores[i] - mediaAritmetica, 2);
	}
	desviacionEstandar = sqrt( aux1 / vectorDeValores.size()); //calculo final para la desviacion estandar
	
	return desviacionEstandar;
}//------------------------------------------------------------------------------------------------

	
	
int main(int argc, char *argv[]) {
	double desviacion;
	vector<double> misValores;
	misValores = CargarVector();
	desviacion = DesviacionEstandar(misValores);
	cout << "La desviacion tipica, o estandar, es: " << desviacion;
	
	
	return 0;
}

