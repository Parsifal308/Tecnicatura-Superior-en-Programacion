/*
Desarrole un programa (para cada caso) para:
	1-Leer un valor y determinar si es par o impar.
	2-Leer dos valores y:
		->Si se puede, dividir el primero por el segundo.
		->Dividir el mayor de los dos por el menor.
	3-Leer 3 valores y:
		->Determinar cual es el mayor
		->Mostrarlos ordenados de menor a mayor
*/
#include <iostream>
using namespace std;


int numA;
int numB;
int numC;

//EJERCICIO 1:
	void DetParidad(){
		cout<<"\nPARTE 1\nDETERMINAR SI UN NUMERO ES PAR: \n";
		cout<<"Por favor, ingrese un numero entero: \n";
		cin>>numA;
		if(numA % 2 == 0){
			cout<<"El numero ingresado es par";
		}else{
			cout<<"El numero ingresado es impar";
		}
	}


//EJERCICIO 2:
	void DivMayorPorMenor(){
		cout<<"\nPARTE 2\nDIVIDIR EL MAYOR DE LOS NUMEROS POR MENOR\n";
		float resultado;
		cout<<"Por favor, ingrese el primer numero entero: ";
		cin>>numA;
		cout<<"Por favor, ingrese el segundo numero entero: ";
		cin>>numB;
		if(numA>numB){
			resultado = static_cast<float>(numA)/numB;
			cout<<"El resultado de dividir "<<numA<<" entre "<<numB<<" es: "<<resultado;
		}else{
			resultado = static_cast<float>(numB)/numA;
			cout<<"El resultado de dividir "<<numB<<" entre ->"<<numA<<" es: "<<resultado;
		}
	}
		
	void OrdenarMayorAMenor(){
		cout<<"PARTE 3\nORDENAR DE MAYOR A MENOR\n";
		cout<<"\nPor favor, ingrese el primer numero: ";
		cin>>numA;
		cout<<"\nPor favor, ingrese el segundo numero: ";
		cin>>numB;
		cout<<"\nPor favor, ingrese el tercer numero: ";
		cin>>numC;
		if(numA > numB){
			if(numA > numC){
				cout<<"\nEl numero mayor es: "<<numA;
				cout<<"\nEl segundo numero mayor es: "<<numC;
				cout<<"\nEl numero menor es: "<<numB;
			}else{
				cout<<"\nEl numero mayor es: "<<numC;
				cout<<"\nEl segundo numero mayor es: "<<numA;
				cout<<"\nEl numero menor es: "<<numB;
			}
			
			
		}else{
			if(numB > numC){
				cout<<"\nEl numero mayor es: "<<numB;
				if(numA>numC){
					cout<<"\nEl segundo numero mayor es: "<<numA;
					cout<<"\nEl numero menor es: "<<numC;
				}else{
					cout<<"\nEl Segundo numero mayor es: "<<numC;
					cout<<"\nEl numero menor es: "<<numA;
				}
			}else{
				cout<<"\nEl numero mayor es: "<<numC;
				cout<<"\nEl segundo numero mayor es: "<<numB;
				cout<<"\nEl numero menor es: "<<numA;
			}
		}
	}
	
int main(int argc, char *argv[]) {

	OrdenarMayorAMenor();
	return 0;
}

