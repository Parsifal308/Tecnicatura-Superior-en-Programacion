#include <iostream>
#include <fstream>
#include <math.h>
#include<vector>

using namespace std;

ifstream archivoTXT("datos4.txt");

int cabezalDia, cabezalMes, cabezalAnio;
int diasHabil;
int contadorFechas = 0;

vector<vector<int>> fechas;

int menorFecha[3];
int mayorFecha[3];

//---------------------------------------------------------------------------------------------------
//PROCEDIMIENTO QUE RECORRE LA MATRIZ DE FECHAS, Y ALMACENA LA MENOR Y LA MAYOR FECHA ENTRE TODAS
void MenorMayorFecha(){
	int menorDia, menorMes, menorAnio, mayorDia, mayorMes, mayorAnio;
	bool primerComparacion = true;
	int cantidadFechas = fechas[0].size();
	
	
	menorDia = fechas[2][0];
	menorMes = fechas[1][0];
	menorAnio = fechas[0][0];
	mayorDia = fechas[2][0];
	mayorMes = fechas[1][0];
	mayorAnio = fechas[0][0];
	
	//CALCULO MENOR FECHA
	for(int i = 0; i < cantidadFechas; i++){	
		if(fechas[0][i] < menorAnio){
			menorAnio = fechas[0][i];
		}
	}
	for(int j = 0; j < cantidadFechas; j++){
		if((fechas[0][j] == menorAnio) && (fechas[1][j] < menorMes)){
			menorMes = fechas[1][j];
		}
	}
	for(int k = 0; k < cantidadFechas; k++){
		if((fechas[1][k] == menorMes) && (fechas[2][k] < menorDia)){
			menorDia = fechas[2][k];
		}
	}
	
	
	//CALCULO MAYOR fechas
	for(int i = 0; i < cantidadFechas; i++){	
		if(fechas[0][i] > mayorAnio){
			mayorAnio = fechas[0][i];
		}
	}
	for(int j = 0; j < cantidadFechas; j++){
		if((fechas[0][j] == mayorAnio) && (fechas[1][j] > mayorMes)){
			mayorMes = fechas[1][j];
		}
	}
	for(int k = 0; k < cantidadFechas; k++){
		if((fechas[1][k] == mayorMes) && (fechas[2][k] > mayorDia)){
			mayorDia = fechas[2][k];
		}
	}
	
	menorFecha[0] = menorAnio;
	menorFecha[1] = menorMes;
	menorFecha[2] = menorDia;
	mayorFecha[0] = mayorAnio;
	mayorFecha[1] = mayorMes;
	mayorFecha[2] = mayorDia;
}

	//---------------------------------------------------------------------------------------------------	
	//FUNCION QUE DADOS UN DIA, MES Y AÑO, DEVUELVE TRUE O FALSE DEPENDIENDO SI ES EL ULTIMO DIA DE DICHO MES/AÑO
	bool UltimoDiaDelMes(int mesIngresado, int anioIngresado, int diaActual){
		int mes;
		bool ultimoDia;
		mes = mesIngresado;
		switch(mes){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(diaActual < 31){
				ultimoDia = false;
			}else{
				ultimoDia = true;
			}
			break;
		case 4: case 6: case 9: case 11:
			if(diaActual < 30){
				ultimoDia = false;
			}else{
				ultimoDia = true;
			}
			break;
		case 2:
			if(((anioIngresado & 4 == 0) && (anioIngresado % 100 !=0)) || (anioIngresado % 400 == 0)){ 
				if(diaActual < 29){
					ultimoDia = false;
				}else{
					ultimoDia = true;
				}
			}else{
				if(diaActual < 28){
					ultimoDia = false;
				}else{
					ultimoDia = true;
				}
			}
			break;
		}
		return ultimoDia;
	}
		
	
//---------------------------------------------------------------------------------------------------
//FUNCION QUE CUENTA LOS DIAS HABILES DE ENTRE DOS FECHAS INGRESADAS
int DiasHabiles(int anioInicio, int mesInicio, int diaInicio, int anioFin, int mesFin, int diaFin){
	int contadorDiasHabiles = 1;
	int h;
	int dia = diaInicio;
	int mes = mesInicio;
	int anio = anioInicio;
	
	do{
		int a = (14 - mes) / 12;
		int y = anio - a;
		int	m = mes + 12 * a - 2;
			
		h = (dia + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
		
		if ((1 < h) && (h <= 6)){
			contadorDiasHabiles++;
		}
		if(UltimoDiaDelMes(mes, anio, dia) != true){
			dia++;
		}else{
			if((mes < 12)){
				mes++;
				dia = 1;
			}else{
				anio++;
				mes = 1;
				dia = 1;
			}
		}
	} while(((anio == anioFin) && (mes == mesFin) && (dia == diaFin)) == false);
	
	
	return contadorDiasHabiles;
}
	
//---------------------------------------------------------------------------------------------------
//FUNCION QUE DEVUELVE LA CANTIDAD DE DIAS DE UN MES Y AÑO INGRESADOS, TENIENDO EN CUENTA AÑOS BISIESTOS
int cantDias(int mesIngresado, int anioIngresado){

	int dia, mes;
	mes = mesIngresado;
	switch(mes){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			dia = 31;
			break;
		case 4: case 6: case 9: case 11:
			dia = 30;
			break;
	case 2:
		if(((anioIngresado & 4 == 0) && (anioIngresado % 100 !=0)) || (anioIngresado % 400 == 0)){ 
			dia = 29;
		}else{
			dia = 28;
		}
		break;
	}
	return dia;
}
	

//---------------------------------------------------------------------------------------------------
//PROCEDIMIENTO QUE LEE EL ARCHIVO TXT Y LO ALMACENA EN UNA MATRIZ DINAMICA 3XN
void Entrada(){
	if(archivoTXT.is_open()){
		cout<<"El archivo se abrio correctamente :)\n-----------------------------------------------";
		
		while(archivoTXT >> cabezalAnio >> cabezalMes >> cabezalDia){  //Se leen del archivo de a pares desde el archivo de texto

			if((cabezalAnio == 0) && (cabezalMes == 0) && (cabezalDia == 0)){ //año, mes y dia son '0', se detiene la lectura del txt
				break;
			}
			
			//if((cabezalAnio >= 2000) && (cabezalMes <= 12) && (cabezalMes >= 1) && (cabezalDia >= 1) && (cabezalDia >= cantDias(cabezalMes, cabezalAnio))){
				fechas[0].push_back(cabezalAnio); 	//se guarda el primer valor leido correspondiente al año
				fechas[1].push_back(cabezalMes);	//se guarda el segundo valor leido correspondiente al mes
				fechas[2].push_back(cabezalDia);	//se guarda el tercer valor leido correspondiente al dia
				contadorFechas++;
			//}
		}
		cout<<"\nLos datos fueron cargados correctamente :D\n-----------------------------------------------";
		archivoTXT.close(); //se cierra el archivo de texto
	}else{
		cout<<"No se pudo abrir el archivo T.T\n-----------------------------------------------";
	}
}
	
//---------------------------------------------------------------------------------------------------
//PRINCIPAL
int main(int argc, char *argv[]) {
	int diasEntreMenorYMayorFecha;
	
	cout<<"\nBIENVENIDO AL PROGRAMA\n-----------------------------------------------\n-----------------------------------------------\n";
	
	fechas.resize(3); //se inicializa el tamaño del vector para poder trabajar con tres columnas (año, mes, dia)
	Entrada();	//procedimiento que carga los datos de una archivo .txt en una matriz dinamica 3xN
	for(int i = 0; i < fechas[0].size(); i++){
		cout<<"\n"<<fechas[0][i]<<"/"<<fechas[1][i]<<"/"<<fechas[2][i];
	}
	MenorMayorFecha();
	diasEntreMenorYMayorFecha = DiasHabiles(menorFecha[0], menorFecha[1],menorFecha[2], mayorFecha[0], mayorFecha[1], mayorFecha[2]);
	cout<<"\nLa cantidad de dias habiles entre la menor fecha y la mayor es: "<<diasEntreMenorYMayorFecha;
	
	return 0;
}

