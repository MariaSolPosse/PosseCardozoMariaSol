package Model;

public class Militar extends Avion implements iIngreso {
private String sistemaArmas; 
private int cantidadDebalas; 

public Militar() {
	// TODO Auto-generated constructor stub
}

public Militar(String modelo, String marca, float capacidadCombustible, String tipoDeMotor, int cantidadDeAsientos,
		int estado, String sistemaArmas, int cantidadDebalas) {
	super(modelo, marca, capacidadCombustible, tipoDeMotor, cantidadDeAsientos, estado);
	this.sistemaArmas = sistemaArmas;
	this.cantidadDebalas = cantidadDebalas;
}


public String getSistemaArmas() {
	return sistemaArmas;
}

public int getCantidadDebalas() {
	return cantidadDebalas;
}

@Override
public boolean ingreso() {
	boolean flag= true; 
	if(this.getEstado()==2)
	{
		flag= false;
	}
	else if(this.getEstado()== 0) 
	{
		flag= false; 
	}
return flag ;
}

@Override
public String toString() {
	return super.toString()+"Militar [sistemaArmas=" + sistemaArmas + ", cantidadDebalas=" + cantidadDebalas + "]";
}



}
