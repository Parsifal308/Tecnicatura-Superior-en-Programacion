/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_2021_tema_2;

/**
 *
 * @author Guillermo Marinero
 */
public class Parcial_2021_Tema_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        

        
        Clinica clinica_1 = new Clinica();//Instancio mi clinica
         
        clinica_1.addEspecialidad(new Especialidad("Respiratorios")); //Instancio nueva especialidad en arrayList "especialidades"
        
        clinica_1.getEspecialidades().get(0).addHabitacion(new Habitacion(1));  //Instancio nueva habitacion en arraylist "habitaciones"
        clinica_1.getEspecialidades().get(0).getHabitaciones().get(0).addCama(new Cama(1));  //instancio nueva cama en arraylist "camas"
        clinica_1.getEspecialidades().get(0).getHabitaciones().get(0).addCama(new Cama(2));
       
        clinica_1.getEspecialidades().get(0).addHabitacion(new Habitacion(2));
        clinica_1.getEspecialidades().get(0).getHabitaciones().get(1).addCama(new Cama(3));
        clinica_1.getEspecialidades().get(0).getHabitaciones().get(1).addCama(new Cama(4));
        
        
        clinica_1.addEspecialidad(new Especialidad("Cirugia")); //Instancio nueva especialidad en arrayList "especialidades"
        
        clinica_1.getEspecialidades().get(1).addHabitacion(new Habitacion(3));
        clinica_1.getEspecialidades().get(1).getHabitaciones().get(0).addCama(new Cama(5));
        clinica_1.getEspecialidades().get(1).getHabitaciones().get(0).addCama(new Cama(6));
        
        clinica_1.getEspecialidades().get(1).addHabitacion(new Habitacion(4));
        clinica_1.getEspecialidades().get(1).getHabitaciones().get(1).addCama(new Cama(7));
        clinica_1.getEspecialidades().get(1).getHabitaciones().get(1).addCama(new Cama(8));

        //Instancio mis Medicos
        Medico medic_1 = new Medico(1111, 27867523,"Susana", "Torio", 'M');
        Medico medic_2 = new Medico(2222, 14546287,"Rubén ", "Fermizo", 'H');
        Medico medic_3 = new Medico(3333, 20587465,"Inés ", "Queleto", 'M');
        
        //Instamcio mis Pacientes
        Paciente p1 = new Paciente(37889231,"Elsa","Capunta", 'M');
        Paciente p2 = new Paciente(43587195,"Ramona","Ponte Alegre", 'M');
        Paciente p3 = new Paciente(17831908,"Dolores","Delano", 'M');
        
        //Asocio los objetos de la clase Medico a las especialidades
        clinica_1.getEspecialidades().get(0).addMedico(medic_1);
        clinica_1.getEspecialidades().get(1).addMedico(medic_2);
        clinica_1.getEspecialidades().get(1).addMedico(medic_3);
        
        //Asocio los pacientes a los medicos, para este ejemplo uno para cada uno.
        clinica_1.getEspecialidades().get(0).getMedicos().get(0).addPaciente(p1);
        clinica_1.getEspecialidades().get(1).getMedicos().get(0).addPaciente(p2);
        clinica_1.getEspecialidades().get(1).getMedicos().get(1).addPaciente(p3);
        
        //Setteo fecha de internacion de pacientes
        clinica_1.getEspecialidades().get(0).getMedicos().get(0).getPacientes().get(0).setFechaInternacion(new Fecha(8,5,2021));
        clinica_1.getEspecialidades().get(1).getMedicos().get(0).getPacientes().get(0).setFechaInternacion(new Fecha(5,3,2021));
        clinica_1.getEspecialidades().get(1).getMedicos().get(1).getPacientes().get(0).setFechaInternacion(new Fecha(1,2,2021));
        
        //Setteo diagnosticos de los pacientes
        clinica_1.getEspecialidades().get(0).getMedicos().get(0).getPacientes().get(0).setDiagnostico(new Diagnostico("covid", new NivelDiagnostico("urgente"), new Tratamiento("internacion y rezarle a la virgencita de guadalupe")));
        clinica_1.getEspecialidades().get(1).getMedicos().get(0).getPacientes().get(0).setDiagnostico(new Diagnostico("apendicitis", new NivelDiagnostico("urgente"), new Tratamiento("cirugia e internacion")));
        clinica_1.getEspecialidades().get(1).getMedicos().get(1).getPacientes().get(0).setDiagnostico(new Diagnostico("corte profundo en rodilla", new NivelDiagnostico("leve"), new Tratamiento("sutura y antibioticos")));
        
        //Asocio camas con los pacientes que las necesitan, para este ejemplo son el "p1" y el "p2, al paciente "p3" lo cosieron y se fue a su casa
        clinica_1.getEspecialidades().get(0).getHabitaciones().get(0).getCamas().get(0).setPaciente(p1);
        clinica_1.getEspecialidades().get(1).getHabitaciones().get(0).getCamas().get(0).setPaciente(p2);
        
        
        //Muestro por consola las especialidades, y sus medicos junto a sus datos
        System.out.println("------------------------------------------------------");
        System.out.println("|Especialidades: ");
        for (int i = 0; i < clinica_1.getEspecialidades().size(); i++) {
            System.out.println("    |" + clinica_1.getEspecialidades().get(i).getNombre());
            for (int j = 0; j < clinica_1.getEspecialidades().get(i).getMedicos().size(); j++) {
                System.out.print("        -" + clinica_1.getEspecialidades().get(i).getMedicos().get(j).getNombre());
                System.out.print(" " + clinica_1.getEspecialidades().get(i).getMedicos().get(j).getApellido());
                System.out.print(", DNI: " + clinica_1.getEspecialidades().get(i).getMedicos().get(j).getDni());
                System.out.print(", Matricula: " + clinica_1.getEspecialidades().get(i).getMedicos().get(j).getNroMatricula() + "\n");
            }
        }
        System.out.println("------------------------------------------------------");
        
        //Muestro por consola los pacientes junto a sus datos personales y de internacion
        System.out.println("|Internaciones: ");
        for (int i = 0; i < clinica_1.getEspecialidades().size(); i++) {
            System.out.println("    |" + clinica_1.getEspecialidades().get(i).getNombre() + ": ");
            for (int j = 0; j < clinica_1.getEspecialidades().get(i).getHabitaciones().size(); j++) {
                System.out.println("        |Habitacion Nº" + clinica_1.getEspecialidades().get(i).getHabitaciones().get(j).getNumero() + ":");
                for (int k = 0; k < clinica_1.getEspecialidades().get(i).getHabitaciones().get(j).getCamas().size(); k++) {
                    System.out.println("            |Cama Nº: " + clinica_1.getEspecialidades().get(i).getHabitaciones().get(j).getCamas().get(k).getNum());
                    if(clinica_1.getEspecialidades().get(i).getHabitaciones().get(j).getCamas().get(k).getPaciente() != null){
                        System.out.print("              |Paciente: " + clinica_1.getEspecialidades().get(i).getHabitaciones().get(j).getCamas().get(k).getPaciente().getNombre());
                        System.out.print(" " + clinica_1.getEspecialidades().get(i).getHabitaciones().get(j).getCamas().get(k).getPaciente().getApellido());
                        System.out.print(", DNI: " + clinica_1.getEspecialidades().get(i).getHabitaciones().get(j).getCamas().get(k).getPaciente().getDni() + "\n");
                        System.out.print("                |Fecha de internacion: " + clinica_1.getEspecialidades().get(i).getHabitaciones().get(j).getCamas().get(k).getPaciente().getFechaInternacion().getDia());
                        System.out.print("/" + clinica_1.getEspecialidades().get(i).getHabitaciones().get(j).getCamas().get(k).getPaciente().getFechaInternacion().getMes());
                        System.out.print("/" + clinica_1.getEspecialidades().get(i).getHabitaciones().get(j).getCamas().get(k).getPaciente().getFechaInternacion().getAnio() + "\n");
                        System.out.println("                |Diagnostico: " + clinica_1.getEspecialidades().get(i).getHabitaciones().get(j).getCamas().get(k).getPaciente().getDiagnostico().getTexto());
                        System.out.println("                |Severidad: " + clinica_1.getEspecialidades().get(i).getHabitaciones().get(j).getCamas().get(k).getPaciente().getDiagnostico().getNivelDiagnostico().getNivelSeveridad());
                        System.out.println("                |Tratamiento: " + clinica_1.getEspecialidades().get(i).getHabitaciones().get(j).getCamas().get(k).getPaciente().getDiagnostico().getTratamiento().getTexto());
                    }else{
                        System.out.println("                  DESOCUPADA");
                    }
                    
                }
                
                
            }
        }
    }
    
}
