#include <iostream>
using namespace std;

double matriz[20][20];

void recorrerZona1(double miMatriz[20][20]){
	for(int i = 0; i < 20; i++){
		if(i < (sizeof(miMatriz)/sizeof(miMatriz[0]) - 1)/2){
			for(int j = sizeof(miMatriz)/sizeof(miMatriz[0]) - 1; j >= sizeof(miMatriz)/sizeof(miMatriz[0]) - 1 - i; j--){
				
			}
		}
		if(i == (sizeof(miMatriz)/sizeof(miMatriz[0]) - 1)/2){
			for(int j = 0; j < sizeof(miMatriz)/sizeof(miMatriz[0]); j++){
				
			}
		}
		if(i > (sizeof(miMatriz)/sizeof(miMatriz[0]) - 1)/2){
			for(int j = ((sizeof(miMatriz)/sizeof(miMatriz[0])) / 2 ) -1; j < sizeof(miMatriz)/sizeof(miMatriz[0])-(i-2); j--){
				
			}
		}
		
		
	}
}
	
	
void recorrerZona2(){
	
}
void recorrerZona3(){
	
}
void recorrerZona4(){
	
}
void recorrerZona5(){
	
}
void recorrerZona6(){
	
}
void recorrerZona7(){
	
}
void recorrerZona8(){
	
}



int main(int argc, char *argv[]) {
	
	cout<<("\nPor favor, el tamaño de la matriz que desea utilizar\n");
	
	int a = sizeof(matriz)/sizeof(matriz[0]);
	cout<<a;
	
	return 0;
}

