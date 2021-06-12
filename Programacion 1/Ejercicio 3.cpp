/*
	Desarrolle dos programas para:
		->Dado un año y un mes, muestre la fecha del ultimo dia de ese mes y ese año.
		->Dado un año, un mes y un dia, calcule el numero de dias transcurridos desde el 31 de diciembte del año anterior
*/

#include <iostream>
using namespace std;

int anio;
int mes;
int dia;

bool Bisiesto(){
	if(((anio % 4 == 0) && (anio % 100 !=0)) || (anio % 400 == 0)){
		return true;
	}else{
		return false;
	}
} 
	
void Parte1(){
	cout<<"\nEJERCICIO: DADO UN AÑO Y UN MES; MUESTRE LA FECHA DEL ULTIMO DIA DE ESE MES Y ESE AÑO:";
	cout<<"\nPor favor, ingrese un numero entero correspondiente al año: ";
	cin>>anio;
	cout<<"\nPor favor, ingrese un numero entero correspondiente al mes: ";
	cin>>mes;
	switch(mes){
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		cout<<"\n31/"<<mes<<"/"<<anio;
		break;
	case 2:
		Bisiesto();
		if(Bisiesto() == true){
			cout<<"\n29/"<<mes<<"/"<<anio;
		}else{
			cout<<"\n28/"<<mes<<"/"<<anio;
		}
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		cout<<"\n30/"<<mes<<"/"<<anio;
		break;
	}
}

void Parte2(){
	int diasTranscurridos;
	int diaExtra = 0;
	bool diaCorrecto = false;
	cout<<"\nEJERCICIO: DADO UN AÑO, UN MES Y UN DIA, CALCULE EL NUMERO DE DIAS TRANSCURRIDOS DESDE EL 31 DE DICIEMBRE DEL AÑO ANTERIOR";
	cout<<"\nPor favor, ingrese un numero entero correspondiente al año: ";
	cin>>anio;
	do{
		cout<<"\nPor favor, ingrese un numero entero correspondiente al mes: ";
		cin>>mes;
	} while(0 > mes || mes > 13);
	do{
		cout<<"\nPor favor, ingrese un numero entero correspondiente al dia: ";
		cin>>dia;
		switch(mes){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (0 < dia && dia < 32){
				diaCorrecto=true;
			}
			break;
		case 2:
			if(Bisiesto() == true){
				if(0 < dia && dia <=29){
					diaCorrecto=true;
				}
			}else{
				if(0 < dia && dia <=28){
					diaCorrecto=true;
				}
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(0 < dia && dia <=30){
				diaCorrecto=true;
			}
			break;
		}
	} while(diaCorrecto == false);
	if(Bisiesto() == true){
		diaExtra = 1;
	}else{
		diaExtra = 0;
	}
	switch (mes){
	case 1: 
		diasTranscurridos = dia + diaExtra;
		break;
	case 2:
		diasTranscurridos = 31 + dia + diaExtra;
		break;
	case 3:
		diasTranscurridos = 59 + diaExtra + dia;
		break;
	case 4:
		diasTranscurridos = 90 + diaExtra + dia;
		break;
	case 5:
		diasTranscurridos = 120 + diaExtra + dia;
		break;
	case 6:
		diasTranscurridos = 151 + diaExtra + dia;
		break;
	case 7:
		diasTranscurridos = 181 + diaExtra + dia;
		break;
	case 8:
		diasTranscurridos = 212 + diaExtra + dia;
		break;
	case 9:
		diasTranscurridos = 243 + diaExtra + dia;
		break;
	case 10:
		diasTranscurridos = 273 + diaExtra + dia;
		break;
	case 11:
		diasTranscurridos = 304 + diaExtra + dia;
		break;
	case 12:
		diasTranscurridos = 334 + diaExtra + dia;
	}
	cout<<"\nHan transcurrido "<<diasTranscurridos<<" dias desde la fecha ingresada al 31 de diciembre del año anterior";
}


int main(int argc, char *argv[]) {
	//Parte1();
	Parte2();
	return 0;
}

