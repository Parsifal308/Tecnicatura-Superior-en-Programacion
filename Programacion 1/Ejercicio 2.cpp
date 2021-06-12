/*
	Dado un numero entero, calcular si:
		->Tiene un digito
		->Tiene dos digitos.
		->Tiene tres digitos
		->Tiene cuatro digitos o mas.
*/


#include <iostream>
using namespace std;


int numA;
int main(int argc, char *argv[]) {
	
	
	cout<<"Dado un numero entero, calcular si:\n->Tiene un digito\n->Tiene dos digitos.\n->Tiene tres digitos\n->Tiene cuatro digitos o mas.\n";
	cout<<"Por favor, ingrese un numero entero: ";
	cin>>numA;
	if(-10 < numA && numA < 10){
		cout<<"\nEl numero ingresado tiene 1 digito";
	}else{
		if(-100 < numA && numA < 100){
			cout<<"\nEl numero ingresado tiene 2 digitos";
		}else{
			if(-1000 < numA && numA < 1000){
				cout<<"\nEl numero ingresado tiene 3 digitos";
			}else{
				cout<<"\nEl numero ingresado tiene 4 digitos o mas";
			}
		}
	}
	return 0;
}

