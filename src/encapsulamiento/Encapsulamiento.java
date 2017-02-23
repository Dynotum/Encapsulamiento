
package encapsulamiento;

/**
 *
 * @author dyno
 */

 import java.util.Scanner;

public class Encapsulamiento{

    static final int ENERO = 1;
    static final int FEBRERO = 2;
    static final int MARZO = 3;
    static final int ABRIL = 4;
    static final int MAYO = 5;
    static final int JUNIO = 6;
    static final int JULIO = 7;
    static final int AGOSTO = 8;
    static final int SEPTIEMBRE = 9;
    static final int OCTUBRE = 10;
    static final int NOVIEMBRE = 11;
    static final int DICIEMBRE = 12;    
   
    
	class MiFecha{
		private int dia;
		private int mes;
		private int anio;

		MiFecha(){
			dia = 16;
			mes = 11;
			anio = 1993;
		}

		public int dameDia(){
			return dia;
		}
		public int dameMes(){
			return mes;
		}
		public int dameAnio(){
			return anio;
		}

		private boolean verificaFecha(int dia, int mes, int anio){
			if(mes >= ENERO && mes <= DICIEMBRE && dia >= 1 && dia <= 31){
				if(anio >= 0 && anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)){
                                    
                                    switch (mes) {
                                        case ENERO:
                                        case MARZO:
                                        case MAYO:
                                        case JULIO:
                                        case AGOSTO:
                                        case OCTUBRE:
                                        case DICIEMBRE:
                                            return true;
                                            
                                        case ABRIL:
                                        case JUNIO:
                                        case SEPTIEMBRE:
                                        case NOVIEMBRE:
                                            return dia <= 30;

                                        default:
                                            return dia <= 29;

                                    }
				}
				else{
                                    switch (mes) {
                                        case ENERO:
                                        case MARZO:
                                        case MAYO:
                                        case JULIO:
                                        case AGOSTO:
                                        case OCTUBRE:
                                        case DICIEMBRE:
                                                        return true;
                                            
                                        case ABRIL:
                                        case JUNIO:
                                        case SEPTIEMBRE:
                                        case NOVIEMBRE:
                                                        return dia <= 30;
                                    
                                        default:
                                              return dia <= 28;
                                    }
				}
			}
			else{
				return false;
			}
		}

		public boolean fijaDia(int newDia, int mes, int anio){
			boolean retorno = verificaFecha(newDia, mes, anio);
			if(retorno){
				dia = newDia;
			}

			return retorno;
		}

		public boolean fijaMes(int dia, int newMes, int anio){
			boolean retorno = verificaFecha(dia, newMes, anio);
			if(retorno){
				mes = newMes;
			}

			return retorno;
		}

		public boolean fijaAnio(int dia, int mes, int newAnio){
			boolean retorno = verificaFecha(dia, mes, newAnio);
			if(retorno){
				anio = newAnio;
			}

			return retorno;
		}

	}

	public static void main(String[] args){
		int opc = 0;
		int dato = 0;

		MiFecha fecha;
		fecha = new Encapsulamiento().new MiFecha();
		Scanner scanner = new Scanner(System.in);

		do{
			System.out.println("Fecha Actual: "+fecha.dameDia()+"/"+fecha.dameMes()+"/"+fecha.dameAnio());
			System.out.println(" 1- Cambiar el dia. \n 2- Cambiar el mes. \n 3- Cambiar el anio. \n 0- Salir.");
			System.out.println("Ingrese una opcion: ");
			opc = scanner.nextInt();

			switch (opc){
			case 1:
				System.out.println("Ingrese nuevo dia: ");
				dato = scanner.nextInt();

				if(fecha.fijaDia(dato, fecha.dameMes(), fecha.dameAnio())){
					System.out.println("La fecha se cambio con exito.");
				}
				else{
					System.out.println("Error: conflicto con el dia.");
				}
				break;

			case 2:
				System.out.println("Ingrese nuevo mes: ");
				dato = scanner.nextInt();

				if(fecha.fijaMes(fecha.dameDia(), dato, fecha.dameAnio())){
					System.out.println("La fecha se cambio con exito.");
				}
				else{
					System.out.println("Error: conflicto con el mes.");
				}
				break;

			case 3:
				System.out.println("Ingrese nuevo anio: ");
				dato = scanner.nextInt();

				if(fecha.fijaAnio(fecha.dameDia(), fecha.dameMes(), dato)){
					System.out.println("La fecha se cambio con exito.");
				}
				else{
					System.out.println("Error: conflicto con el anio.");
				}
				break;

			case 0:
				break;

			default:
				System.out.println("Opcion no valida.");
				break;
			}
		}while(opc != 0);
	}
}
