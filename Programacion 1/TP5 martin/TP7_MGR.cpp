#include <iostream>
#include <cmath>
#include <fstream>
#include <vector>
using namespace std;

typedef struct tipoAscensor{
	int pisoActual =0;
	int pisosRecorridos=0;
}ascensor;

int ascensorPrioritario(ascensor* arrAscensores,int cantAscen,int origen){
	int prioritario=0;
	int distancia=abs(arrAscensores->pisoActual-origen);	//el primer ascensor es el prioritario por defecto
	for(int i=1;i<cantAscen;i++){
		if(distancia>abs((arrAscensores+i)->pisoActual-origen)){	//si un ascensor tiene menor distancia que el prioritario
			distancia=abs((arrAscensores+i)->pisoActual-origen);	//tomamos su distancia como la de referencia
			prioritario=i;											//y lo tomamos como nuevo prioritario
		}
		else if(distancia==abs((arrAscensores+i)->pisoActual-origen)){									//si un ascensor tiene la misma distancia que el prioritario
			if(((arrAscensores+prioritario)->pisosRecorridos)>(arrAscensores+i)->pisosRecorridos){		//vemos si tiene menor cantidad de pisos recorridos
				prioritario=i;																			//y lo tomamos como nuevo prioritario
			}
		}
	}
	return prioritario;
}

int main(int argc, char *argv[]) {
	ifstream datos;
	datos.open("datos.txt");
	if (!datos) {
		cout << "No se pudo encontrar el documento.";
		exit(1);
	}
	int contador=0;
	int ascensor2=0;
	int pisos=0;
	int x=0;
	int y=0;
	vector <int> origen2;
	vector <int> destino2;
	do{
		datos >> x >> y;
		if (ascensor2 ==0 && pisos ==0){
			ascensor2=y;
			pisos=x;
		}else{
			origen2.push_back(x);
			destino2.push_back(y);
		}
		contador++;
	}while(x!=-1);
		
	cout << "Cantidad de pisos= "<<pisos<<endl;
	cout << "Cantidad de ascensores= "<<ascensor2<<endl;
	
	int cantPisos=0;
	int cantAscensores=0;
	int origen=0;
	int destino=0;
	int prioridad=0;
	int menorRecorrido;

	cantPisos=pisos;

	cantAscensores=ascensor2;
	
	ascensor* arregloDeAscensores;
	arregloDeAscensores = (ascensor*)calloc(cantAscensores,sizeof(ascensor));
	
	contador=0;
	while(contador<origen2.size()){
		
		origen=origen2[contador];		
		if(origen<0){
			break;
		}
		destino=destino2[contador];
		contador++;
		if(origen>cantPisos||destino<0||destino>cantPisos||destino==origen){//EN DESTINO==ORIGEN
			continue;			//"continue" hace que ignore todo lo que sigue en el while y haga la proxima iteracion
		}
		prioridad=ascensorPrioritario(arregloDeAscensores,cantAscensores,origen);
		cout <<"Moviendo el ascensor "<<prioridad+1<<" del piso "<<(arregloDeAscensores+prioridad)->pisoActual<<" desde "<<origen<<" hasta "<<destino<<endl;
		(arregloDeAscensores+prioridad)->pisosRecorridos+=abs((arregloDeAscensores+prioridad)->pisoActual-origen)+abs(origen-destino);
		(arregloDeAscensores+prioridad)->pisoActual=destino;
		
	}
	menorRecorrido=arregloDeAscensores->pisosRecorridos;		//pongo el recorrido del primer ascensor como referencia
	prioridad=0;
	for (int i=0; i<cantAscensores;i++){
		cout << "El ascensor "<<i+1<<" se ha movido "<<(arregloDeAscensores+i)->pisosRecorridos<<" pisos"<<endl;
		if((arregloDeAscensores+i)->pisosRecorridos<menorRecorrido){	//comparo cual ascensor tiene menor recorrido la actual referencia
			menorRecorrido=(arregloDeAscensores+i)->pisosRecorridos;	//y lo pongo como nueva referencia			
			prioridad = i;												//reciclo la variable "prioridad" porque basicamente tengo paja de crear otra variable para saber cuál es el ascensor de menor recorrido
		}
	}
	cout << "El ascensor "<< prioridad+1 <<" es el de menor recorrido, con un valor de: "<<menorRecorrido<<endl;
	return 0;
}

