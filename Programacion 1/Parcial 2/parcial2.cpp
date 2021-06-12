#include <iostream>
#include <fstream>
#include <math.h>
using namespace std;

int main(int argc, char *argv[]) {
	
	ifstream miArchivo("datos01.txt");
	double cabezalX; 	//variable cabezal de lectura para valores de X
	double cabezalY;	//variable cabezal del lectura para valores de Y
	
	double x; //donde se guarda el valor X leido
	double y; //donde se guarda el valor Y leido
	
	double mayor;	//donde se va guardando el modulo mayor de cada par ordenado
	double modulo;	//el calculo del modulo, es una variable auxiliar
	
	bool primerLectura = true; //bandera para realizar la primer asignacion del mayor
	int contadoNumeroMayor;		//variable para almacenar el numero de antena mayor
	int contador=0;		//contador de numero de antena
	
	if(miArchivo.is_open()){
		cout<<"El archivo se abrio correctamente\n";
		
		while(miArchivo >> cabezalX >> cabezalY){  //Se leen del archivo de a pares desde el archivo de texto
			x = cabezalX;
			y = cabezalY;
			if((x==0) && (y ==0)){ //si X,Y son ambos 0, se finaliza la lectura del archivo
				break;
			}
			contador++;
			if ((x < 0) && (y > 0)){ //SI X ES NEGATIVO E Y ES POSITIVO, ENTONCES SE ENCUENTA EN EL CUADRANTE 2
				
				modulo = abs(sqrt(pow(x,2)+pow(y,2))); //MODULO DE UN VECTOR, VALOR ABSOLUTO DE LA HIPOTENUSA ENTRE X E Y
				
				if(primerLectura == true){ //primer lectura realizada, se asigna automaticamente como el amayor
					mayor = modulo;
					contadoNumeroMayor = contador;
					primerLectura = false;
					
				}else{		//al ya haber un valor con el que comparar, se compara
					if(modulo > mayor){
						mayor = modulo;
						contadoNumeroMayor = contador;				}
				}
				cout<<"|"<<x<<" | "<<y<<"|   ---   Distancia:"<<modulo<<"   ---   Antena Numero: "<<contador<<"\n";
			}

		}
		cout<<"\nLa antena mas alejadas es la :"<<contadoNumeroMayor<<", con una distancia de: "<<mayor;
		miArchivo.close(); //se cierra el archivo de texto
	}else{
		cout<<"No se pudo abrir el archivo";
	}
	
	return 0;
}

