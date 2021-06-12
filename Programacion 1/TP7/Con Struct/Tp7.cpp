#include <iostream>
using namespace std;

//ASI SE DECLARA UNA ESTRUCTURA
struct ascensor{
	int numero;
	int piso;
	int pisosRecorridos;
	double promedioPisosRecorridos;
	int distancia;
		
};

int cabezalA;
int cabezalB;

bool primerLectura = true;

int cantPisos;
int cantAscen;
int origen;
int destino;

void CalcularDistanciasOrigen(){
	as1.distancia = abs(origen - as1.piso);
	as2.distancia = abs(origen - as2.piso);
	as3.distancia = abs(origen - as3.piso);
	as4.distancia = abs(origen - as4.piso);
	as5.distancia = abs(origen - as5.piso);
}
void CalcularDistanciasDestino(){
	
}

int main(int argc, char *argv[]) {
	
	//ASI SE DECLARA E INICIALIZA A PARTIR DE UNA ESTRUCTURA
	struct ascensor as1 = {1, 0, 0, 0.00, 0};
	struct ascensor as2 = {2, 0, 0, 0.00, 0};
	struct ascensor as3 = {3, 0, 0, 0.00, 0};
	struct ascensor as4 = {4, 0, 0, 0.00, 0};
	struct ascensor as5 = {5, 0, 0, 0.00, 0};
	struct ascensor as6 = {6, 0, 0, 0.00, 0};
	
	
	//ASI SE ACCEDE A LOS ATRIBUTOS DE CADA ESTRUCTURA(nombre.atributo)
	cout << as1.numero <<"\n";
	cout << as2.numero <<"\n";
	cout << as3.numero <<"\n";
	cout << as4.numero <<"\n";
	
	if(archivoTXT.is_open()){	//verificacion de correcta lectura del archivo
		cout<<"\nEl archivo de texto '02-datos.txt' se abrio correctamente";
		while(archivoTXT >> cabezalA >> cabezalB){
			if(cabezalA < 0){	//punto de interrupcion de lectura, para este caso en particualr "0.0"
				return 0;
			}else{
				if(primerLectura == true){	//verificacion de primer lectura de datos
					cantPisos = cabezalA;
					cantAscen = cabezalB;
					primerLectura = false;
				}else{
					origen = cabezalA;
					destino = cabezalB;
				}
				CalcularDistanciasOrigen();
				
				
			}
		}
	}
	return 0;
}

