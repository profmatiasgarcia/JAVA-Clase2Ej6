package Clase2Ej6;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
public class Test {

    public static void main(String[] args) {
        Auto au = new Auto("Tierra", 5, "Trabajo y paseo", "Si", 50);
        Barco ba = new Barco("Agua", 300, "Transporte de mercancia y cruceros", "Si", 500);
        Bicicleta bi = new Bicicleta("Tierra", 1, "Paseo y deporte", "no", 0);
        Avion av = new Avion("Aire", 240, "Transporte de mercancia y pasajeros", "Si", 1000);
        int opc = 0;
        while (opc == 0) {
            int x = EntradaSalida.leerDatoEntero(
                    "Ingrese el vehiculo que desee ver:\n1)Auto\n2)Barco\n3)Bicicleta\n4)Avion\n5)Salir");
            switch (x) {
                case 1:
                    EntradaSalida.mostrarCadena("AUTO:\n" + au + "\n");
                    break;
                case 2:
                    EntradaSalida.mostrarCadena("BARCO:\n" + ba + "\n");
                    break;
                case 3:
                    EntradaSalida.mostrarCadena("BICICLETA:\n" + bi + "\n");
                    break;
                case 4:
                    EntradaSalida.mostrarCadena("AVION:\n" + av + "\n");
                    break;
                case 5:
                    opc = 1;
            }
//            switch (x) {
//                case 1 -> EntradaSalida.mostrarCadena("AUTO:\n" + au + "\n");
//                case 2 -> EntradaSalida.mostrarCadena("BARCO:\n" + ba + "\n");
//                case 3 -> EntradaSalida.mostrarCadena("BICICLETA:\n" + bi + "\n");
//                case 4 -> EntradaSalida.mostrarCadena("AVION:\n" + av + "\n");
//                case 5 -> opc = 1;
//            }
        }
    }
}
