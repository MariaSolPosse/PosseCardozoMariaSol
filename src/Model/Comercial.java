package Model;

public class Comercial extends Avion {
private int cantAzafatas; 
private String listaServicios; 

public Comercial() {
	// TODO Auto-generated constructor stub
}

public Comercial(int cantAzafatas, String listaServicios) {
	super();
	this.cantAzafatas = cantAzafatas;
	this.listaServicios = listaServicios;
}


public Comercial(String modelo, String marca, float capacidadCombustible, String tipoDeMotor, int cantidadDeAsientos,
		int estado, int cantAzafatas, String listaServicios) {
	super(modelo, marca, capacidadCombustible, tipoDeMotor, cantidadDeAsientos, estado);
	this.cantAzafatas = cantAzafatas;
	this.listaServicios = listaServicios;
}

public int getCantAzafatas() {
	return cantAzafatas;
}

public String getListaServicios() {
	return listaServicios;
}

public String sirveComida() {
	return"COMIDA SERVIDA"; 
}
public String mantaDeFrio() {
	return"MANTA DE FRIO"; 
}

@Override
public String toString() {
	return super.toString()+"Comercial [cantAzafatas=" + cantAzafatas + ", listaServicios=" + listaServicios + "]";
}



}
