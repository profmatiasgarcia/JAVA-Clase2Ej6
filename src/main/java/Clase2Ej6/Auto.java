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
public class Auto extends Vehiculos {

    private String Motor;
    private int LitrosCombustible;

    public Auto() {
    }
    
    public Auto(String medioLocomocion, int capacidadPersonas, String utilizacionGeneral) {
        super(medioLocomocion, capacidadPersonas, utilizacionGeneral);
    }

    public Auto(String medioLocomocion, int capacidadPersonas, String utilizacionGeneral, String motor,
            int litrosCombustible) {
        super(medioLocomocion, capacidadPersonas, utilizacionGeneral);
        this.Motor = motor;
        this.LitrosCombustible = litrosCombustible;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        this.Motor = motor;
    }

    public int getLitrosCombustible() {
        return LitrosCombustible;
    }

    public void setLitrosCombustible(int LitrosCombustible) {
        this.LitrosCombustible = LitrosCombustible;
    }

    public String toString() {
        {
            return "Motor: " + getMotor() + "\nCantidad de litros " + getLitrosCombustible() + super.toString();
        }
    }

}
