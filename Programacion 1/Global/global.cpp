#include <iostream>
#include <fstream>
#include <math.h>
#include<vector>

using namespace std;

ifstream miArchivo("datos1.txt");

double antenaCercana[100][100];	//matriz que indica la antena mas cercana
double distanciaCercana[100][100];	//matriz que guarda la distancia a antena mas cercana
double distanciaAlCentro[100][100]; //matriz que almacena la distancia al centro desde cada celda
vector<vector<double>> posAntenas; //matriz dinamica para almacenar los pares ordenads correspondientes a las ubicacines de las antenas

double x;	
double y;

int cantAntenas;
int contador = 0;
bool primerLectura = true;
double minX, minY, maxX, maxY;	//variables para almacenar los limites X e Y
double distCuadX, distCuadY;
int proxAntenaX, proxAntenaY;


double cabezalX; //variables para lectura del primer valor del renglon
double cabezalY;	//varible para lectura del segundo valor del rengon

	//CONSIGNA 2
	//procedimiento que carga los datos desd el archivo de text y los almacena
void CargarAntenas(){
	if(miArchivo.is_open()){
		cout<<"El archivo se abrio correctamente\n--------------------------";
		
		while(miArchivo >> cabezalX >> cabezalY){  //Se leen del archivo de a pares desde el archivo de texto
			x = cabezalX;
			y = cabezalY;
			if((x==0) && (y ==0)){ //si X,Y son ambos 0, se finaliza la lectura del archivo
				break;
			}
			contador++;
				
			if(primerLectura == true){ //primer lectura realizada, se asigna automaticamente como el amayor
				primerLectura = false;
			}else{
				posAntenas[0].push_back(x); //se almacenan los primeros valores en la primer columna de la matriz dinamica
				posAntenas[1].push_back(y);	//se alamacenan los segundos valores dentro de la segunda columna de la matriz
			}
				
			
		}
		cantAntenas = posAntenas[0].size(); //se guarda en una variable la cantidad de antenas ingresadas por .txt
		miArchivo.close(); //se cierra el archivo de texto
	}else{
		cout<<"No se pudo abrir el archivo\n--------------------------";
	}
}

	//CONSIGNA 3
	//procedimiento que calcula los valores minimos y maximos para los X e Y
void MinMaxXY(){
	primerLectura=true;
	for(int i=0; i< posAntenas[0].size(); i++){
		if(primerLectura){
			minX = posAntenas[0][i]; //se asigna el primer valor como minimo
			primerLectura=false;
		}else{
			if(posAntenas[0][i] < minX){//se comparan los siguientes valores
				minX = posAntenas[0][i];
			}
		}
	}
	primerLectura = true;
	for(int i=0; i< posAntenas[0].size(); i++){
		if(primerLectura){
			maxX = posAntenas[0][i];	//se asigna el primer valor como el maximo
			primerLectura=false;
		}else{
			if(posAntenas[0][i] > maxX){//se comparan los siguientes valores
				maxX = posAntenas[0][i];
			}
		}
	}
	primerLectura = true;
	for(int i=0; i< posAntenas[1].size(); i++){
		if(primerLectura){
			minY = posAntenas[1][i];//se asigna el primer valor como minimo
			primerLectura=false;
		}else{
			if(posAntenas[1][i] < minY){//se comparan los siguientes valores
				minY = posAntenas[1][i];
			}
		}
	}
	primerLectura = true;
	for(int i=0; i< posAntenas[1].size(); i++){
		if(primerLectura){
			maxY = posAntenas[1][i];//se asigna el primer valor como el maximo
			primerLectura=false;
		}else{
			if(posAntenas[1][i] > maxY){//se comparan los siguientes valores
				maxY = posAntenas[1][i];
			}
		}
	}
}

	//CONSIGNA 4
	//Procedimiento que divide el tamaño de x e Y entre 100
void GenerarMatrizDePosicion(){
	distCuadX = (maxX + abs(minX)) / 100; //valor absoluto de X, dividido entre 100
	distCuadY = (maxY + abs(minY)) / 100;	//valor absoluto de Y, dividido entre 100
}
	
	
	
	
	//CONSIGNA 5
	//Funcion que dados dos valores y el tamaño de la matriz que componen,
	//devuelve las coordenadas cartesianas correspondientes a las mismas
vector<double> CoorCart(double x, double y, double tam){
	double xAux,yAux;
	vector<double> coordenada;
	coordenada.resize(2);
	coordenada[0] = y - ((tam+1)/2);
	coordenada[1] = (-x) + ((tam+1)/2);
	if(coordenada[0] < 0){
		coordenada[0] = floor(coordenada[0]);	//redondea hacia abajo si el numero es negativo
	}else{
		coordenada[0] = ceil(coordenada[0]);	//redondea hacia arriba si es positivo
	}
	if(coordenada[1] < 0){
		coordenada[1] = floor(coordenada[1]);	//redondea hacia abajo si el numero es negativo
	}else{
		coordenada[1] = ceil(coordenada[1]);	//redondea hacia arriba si es positivo
	}
	return coordenada;
}
	
	
	
	
	//procedimiento que recorre toda la matriz, y guardando la distancia al centro
void DistCentro(){
	for(int i=0; i<100; i++){
		for(int j=0; j<100; j++){
			double x, y;
			vector<double> celda;
			celda.resize(2);
			celda=CoorCart(i+1, j+1, 100);
			if(celda[0] < 0){
				if(celda[1] < 0){ //cuadrante (-x,-y)
					x = (celda[0] * distCuadX) + (distCuadX / 2);
					y = (celda[1] * distCuadX) + (distCuadY / 2);
					
				}else{	//cuadrante (-x, +y)
					x = (celda[0] * distCuadX) + (distCuadX / 2);
					y = (celda[1] * distCuadX) - (distCuadY / 2);
				}
			}else{
				
				if(celda[1] < 0){	//cuadrante (+x, -y)
					x = (celda[0] * distCuadX) - (distCuadX / 2);
					y = (celda[1] * distCuadX) + (distCuadY / 2);
					
				}else{	//cuadrante (+x, +y)
					x = (celda[0] * distCuadX) - (distCuadX / 2);
					y = (celda[1] * distCuadX) - (distCuadY / 2);
				}
			}
			distanciaAlCentro[i][j] = abs(sqrt(pow(x,2)+pow(y,2)));
		}
	}
}
	
	
	
	
	
	//procedimiento que calcula y almacena las matrices "antenaCercana" y "distanciaCercana", con la posicion de la antena y la distancia respectivamente
void DistMinAntena(){
	for(int i=0; i<100; i++){			//recorre filas de matriz
		for(int j=0; j<100; j++){		//recorre columnas de matriz
			double distanciaAntenaX;	//variable auxiliar para guardar la distancia a una antena X
			primerLectura = true;
			for(int k=0; k< posAntenas[0].size(); k++){	//recorre las antenas
				distanciaAntenaX = sqrt(pow(posAntenas[0][k] - distanciaAlCentro[i][j],2)+pow(posAntenas[1][k] - distanciaAlCentro[i][j],2)); //calcula distancia entre dos puntos cartesianos
				if(primerLectura == true){
					antenaCercana[i][j] = k;	//se guarda QUE antena es la mas cercana
					distanciaCercana[i][j] = distanciaAntenaX;	//se guarda la distancia a la antena mas cercana
				}else{
					if(distanciaAntenaX < distanciaCercana[i][j]){	//si la distancia a la antena siguiente es menor
						distanciaCercana[i][j] = distanciaAntenaX;	//se almacena en la matriz de distancias a antena mas cercana
						antenaCercana[i][k] = k;					//se guarda la posicion de dicha antena
					}
				}
			}
			
		}
	}
}
	
	
	
	
	//procedimiento que compara todas las posiciones y su antena mas cercana, para seleccionar el mayor minimo
void CompararAntenas(){
	primerLectura=true;	//se reinicia bandera para asignar primer valor
	for(int i=0; i<100; i++){
		for(int j=0; j<100; j++){
			if(primerLectura){
					proxAntenaX = i;	//se asigna los indices del primer elemento de la matriz
					proxAntenaY = j;
					primerLectura=false;
			}else{
				if(distanciaCercana[i][j] > distanciaCercana[proxAntenaX][proxAntenaY]){	//si el siguiente elemento es mayor que el almacenado como menor
						proxAntenaX = i;	//se guardan los indices de dicha posicion
						proxAntenaY = j;
				}
			}
		}
	}
}
	
	//procedimiento que agrega una nueva antena a la matriz de posiciones de antenas
void AgregarAntena(){
	double x, y;
	
	if(proxAntenaX < 0){
		if(proxAntenaX < 0){ //cuadrante (-x,-y)
			x = (proxAntenaX * distCuadX) + (distCuadX / 2);
			y = (proxAntenaY * distCuadX) + (distCuadY / 2);
			
		}else{	//cuadrante (-x, +y)
			x = (proxAntenaX * distCuadX) + (distCuadX / 2);
			y = (proxAntenaY * distCuadX) - (distCuadY / 2);
		}
	}else{
		
		if(proxAntenaY < 0){	//cuadrante (+x, -y)
			x = (proxAntenaX * distCuadX) - (distCuadX / 2);
			y = (proxAntenaY * distCuadX) + (distCuadY / 2);
			
		}else{	//cuadrante (+x, +y)
			x = (proxAntenaX * distCuadX) - (distCuadX / 2);
			y = (proxAntenaY * distCuadX) - (distCuadY / 2);
		}
	}
	
	posAntenas[0].push_back(x);	//agrega la posicion x de la nueva antena
	posAntenas[1].push_back(y);	//agrega la posicion y de la nueva antena
	cantAntenas++;
}

	
int main(int argc, char *argv[]) {
	
	posAntenas.resize(2);
	
	cout<<"\nAbriendo archivo 'datos1.txt'\n--------------------------\n";
	CargarAntenas();
	MinMaxXY();
	GenerarMatrizDePosicion();
	
	cout<<"\nCantidad de antenas: "<<cantAntenas;
	
	cout<<"\n\n| X minimo | X maximo |\n| "<<minX<<" | "<<maxX<<"  |";
	cout<<"\n\n| Y minimo | Y maximo |\n| "<<minY<<" | "<<maxY<<"  |";
	
	cout<<"\n\nDistancia X, dentro de matriz de posiciones: "<<distCuadX;
	cout<<"\nDistancia Y, dentro de matriz de posiciones: "<<distCuadY;
	
	cout<<"\n\nCOORDENADAS DE LAS ANTENAS";
	cout<<"\n|    X     |     Y    |";
	for(int i=0; i<cantAntenas; i++){
		cout<<"\n|"<<posAntenas[0][i]<<" | "<<posAntenas[1][i]<<" | ";
	}
	
	cout<<"SE AGREGARAN 5 ANTENAS";
	for(int i=0; i<5; i++){
			DistCentro();
			DistMinAntena();
			CompararAntenas();
			AgregarAntena();
	}

	cout<<"\n\nCOORDENADAS DE LAS ANTENAS NUEVAS";
	cout<<"\n|    X     |     Y    |";
	for(int i=cantAntenas-6; i<cantAntenas; i++){
		cout<<"\n|"<<posAntenas[0][i]<<" | "<<posAntenas[1][i]<<" | ";
	}
	


	
	return 0;
}

