#include <iostream>
#include <fstream>
using namespace std;

ifstream archivoTXT("02-datos.txt");

int ascensores[6] = {0, 0, 0, 0, 0, 0};	//arreglo que guarda la posicion actual de cada ascensor
int pisosRecorridos[6] = {0, 0, 0, 0, 0, 0};	//arreglo que guarda la cantidad de pisos recorridos por cada ascensor
int distanciaDestino[6];	//ascensor que guarda la distancia desde la ubicacion de cada ascensor al proximo destino (origen o destino)
bool distanciasSimilares[6] ={false, false, false, false, false, false };	//arreglo que indica si los ascensores se encuentran a una misma distancia del destino(origen o destino)

int cantPisos;
int cantAscensores;
int origen;	//primer dato del renglon
int destino;	//segundo dato del renglon

int ascensorMasCercano;
int ascensorMasRecorre;
int proximoAscensor;


int totalPisosRecorridos;
int llamadasRealizadas = 0; //contador de llamadas realizadas a ascensores

int cabezalA;	//cabezal de lectura de primer dato
int cabezalB;	//cabezal de lectura de segundo dato

bool primerLectura = true;	//bandera para primer lectura, correspondiente a cantidad de pisos y de ascensores
bool aux = true;


int main(int argc, char *argv[]) {
	
	if(archivoTXT.is_open()){	//verificacion de correcta lectura del archivo
		cout<<"\nEl archivo de texto '02-datos.txt' se abrio correctamente";
		while(archivoTXT >> cabezalA >> cabezalB){	//bucle de lectura de datos del archivo datos3.txt
				if(cabezalA < 0){	//punto de interrupcion de lectura, para este caso en particualr "0.0"
					break;
				}else{
					if(primerLectura == true){	//verificacion de primer lectura de datos
						
						if((cabezalA >= 2) && (cabezalB >= 2)){
							
							cantPisos = cabezalA;	//primer numero es la cantidad de pisos
							cantAscensores = cabezalB;	//segundo numero la cantidad de ascensores
							primerLectura = false;	//se asigna bandera "false" luego de la primer lectura
						}else{
							return 0;
						}
					}else{
						origen = cabezalA;	// se guarda el primer valor leido del par, como el origen al que se debe dirigir el ascensor
						destino = cabezalB;	//se guarda el segundo valor, como el destino al que se debe dirigir el ascensor a continuacion
						
						if((origen != destino) && (origen >= -1) && (origen < cantPisos) && (destino >= 0) && (destino < cantPisos)){
							llamadasRealizadas++;	//contado de llamadas
							for(unsigned int i=0; i < (sizeof(ascensores)/sizeof(ascensores[0])); i++){ //se recorre el arreglo de ascensores
								
								distanciaDestino[i] = abs(ascensores[i] - origen); //se calcula la distancia hasta el origen para cada ascensor
								
								if(i == 0){ //se asigna el primer ascensor como el mas cercano
									ascensorMasCercano = i;
									
								}else{ //se comparan todos los ascensores con el primero para averiguar cual es el mas cercano
									
									if(distanciaDestino[ascensorMasCercano] > distanciaDestino[i]){
										ascensorMasCercano = i; //si es mas cercano, se guarda el indice correspondiente a dicho ascensor
										
									}
								}
							}
							distanciasSimilares[ascensorMasCercano] = true;
							for(unsigned int i=0; i < (sizeof(ascensores)/sizeof(ascensores[0])); i++){
								if(distanciaDestino[i] == distanciaDestino[ascensorMasCercano]){
									distanciasSimilares[i] = true;
								}
							}
							for(unsigned int i=0; i < (sizeof(ascensores)/sizeof(ascensores[0])); i++){
								if(distanciasSimilares[i] == true){
									if(aux == true){
										
										proximoAscensor = i;
										aux=false;
									}else{
										if(pisosRecorridos[i] < pisosRecorridos[proximoAscensor]){
											proximoAscensor = i;
										}
									}
								}
								
								
							}
							distanciasSimilares[0] = false;
							distanciasSimilares[1] = false;
							distanciasSimilares[2] = false;
							distanciasSimilares[3] = false;
							distanciasSimilares[4] = false;
							distanciasSimilares[5] = false;
							
							pisosRecorridos[proximoAscensor] += abs(origen - ascensores[proximoAscensor]); //se acumulan los pisos recorridos desde el la ubicacion del ascensor hasta el origen
							totalPisosRecorridos += abs(origen - ascensores[proximoAscensor]); //se acumulan los pisos recorridos en totalPisosRecorridos
							ascensores[proximoAscensor] = origen;	//se actualiza posicion del ascensor a la del origen
							pisosRecorridos[proximoAscensor] += abs(destino - ascensores[proximoAscensor]); // se acumulan los pisos recorridos desde el origen hasta el destino
							totalPisosRecorridos += abs(destino - ascensores[proximoAscensor]);	//se acumulan los pisos recorridos en totalPisosRecorridos
							ascensores[proximoAscensor] = destino;	//se actualiza la posicion del ascensor al destino
						}
					}
				}
		}
		for(unsigned int i=0; i < (sizeof(pisosRecorridos)/sizeof(pisosRecorridos[0])); i++){//se recorren todos los ascensores para averiguar cual fue el que mas recorrio
			if(i == 0){	
				ascensorMasRecorre = i;
			}else{
				if(pisosRecorridos[i] < pisosRecorridos[ascensorMasRecorre]){
					ascensorMasRecorre = i; //se va guardando el indice del ascensor que mas recorrio
				}
			}
		}
		cout<<"\nEl ascensor mas chingon es el: "<<ascensorMasRecorre +1<<" ,con una cantidad de pisos recorridos de: "<<pisosRecorridos[ascensorMasRecorre];
		cout<<"\nLa cantidad de pisos recorridos EN PROMEDIO por todos los ascensores es de: "<<(float)totalPisosRecorridos/(float)llamadasRealizadas;
	}else{
		cout<<"\nNo se pudo abrir el archivo de texto '02-datos.txt'"; //muestra en pantalla mensaje, en caso de no poder acceder al archivo de texto
	}
	return 0;
}


