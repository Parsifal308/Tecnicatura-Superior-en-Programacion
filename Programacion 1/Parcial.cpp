#include <iostream>
using namespace std;
#include <program1.h>


principal
	
	real uno,dos,tres,cuatro;
limpiar;
leerM(uno,"Valor 1:");
leerM(dos,"Valor 2:");
leerM(tres,"Valor 3:");
leerM(cuatro,"Valor 4:");

si(uno <= dos Y unos <= tres Y uno <= cuatro) entonces
	si(dos <= tres Y dos <= cuatro) entonces
	mostrar << dos <<"," << uno <<",";
si (tres >= cuatro) entonces
	mostrar << tres << "," << cuatro;
sino
	mostrar << cuatro << "," << tres;
finSi
	mostrar << salto;
sinoSi(tres <= cuatro) entonces
	mostrar << tres << "," << uno<<",";
si( dos >= cuantro) entonces
	mostrar << dos << "," << cuatro;
	
