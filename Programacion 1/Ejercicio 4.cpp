/*
	Desarrole un programa par aencontrar las raices de la siguiente ecuacion:
	-> a . x^2 + b . x + c = 0 <-
*/


#include <iostream>
#include <cmath>
using namespace std;

double a;
double b;
double c;
double raizX1;
double raizX2;
double varAux1;

int main(int argc, char *argv[]) {
	cout<<"Desarrole un programa par aencontrar las raices de la siguiente ecuacion:\n---> a.X^2 + b.X + c = 0 <---\n";
	cout<<"\nPor favor, ingrese valor 'a': ";
	cin>>a;
	cout<<"\nPor favor, ingrese valor 'b': ";
	cin>>b;
	cout<<"\nPor favor, ingrese valor 'c': ";
	cin>>c;
	
	varAux1 = (b*b) + (4*a*c);
	
	raizX1 = ((-b) + sqrt(varAux1)) / (2*a);
	cout<<"\nLa primer raiz de la funcion es: "<<raizX1;
	raizX2 = ((-b) - sqrt(varAux1)) / (2*a);
	cout<<"\nLa segunda raiz de la funcion es: "<<raizX2;
}

