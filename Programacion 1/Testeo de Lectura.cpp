#include <iostream>
#include <fstream>
using namespace std;

int main(int argc, char *argv[]) {
	
	string testo = "";
	string x;
	
	ifstream miArchivo("MiTexto.txt");
	
	if(miArchivo.is_open()){
		cout<<"el archivo se abrio correctamente"<<"\n";
		/*while (miArchivo >> x){
			cout<<x<<"\n";
		}*/
		while (miArchivo >> x){
			testo += x;
		}
		cout<<testo;
	}else{
		cout<<"el archivo no se pudo abrir"<<"\n";
	}

	return 0;
}

