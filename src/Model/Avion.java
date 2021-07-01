package Model;

public class Avion {
private String modelo; 
private String marca; 
private float capacidadCombustible; 
private String tipoDeMotor; 
private int cantidadDeAsientos; 
private int estado; /// 0 vuela , 1 aterriza, 2 despega

public Avion() {
	// TODO Auto-generated constructor stub
}
public Avion(String modelo) {
	this.modelo= modelo; 
	// TODO Auto-generated constructor stub
}




public Avion(String modelo, String marca, float capacidadCombustible, String tipoDeMotor, int cantidadDeAsientos,
		int estado) {
	super();
	this.modelo = modelo;
	this.marca = marca;
	this.capacidadCombustible = capacidadCombustible;
	this.tipoDeMotor = tipoDeMotor;
	this.cantidadDeAsientos = cantidadDeAsientos;
	this.estado = estado;
}



public String getModelo() {
	return modelo;
}

public String getMarca() {
	return marca;
}

public float getCapacidadCombustible() {
	return capacidadCombustible;
}

public String getTipoDeMotor() {
	return tipoDeMotor;
}

public int getCantidadDeAsientos() {
	return cantidadDeAsientos;
}

public int getEstado()
{
	return estado; 
}
public int despegar()
{
  this.estado=2;
  return 2; 
}
public int aterrizar()
{
	this.estado=1; 
	return 1; 
}
public int vuelan ()
{
this.estado=0; 
return 0; 
}



@Override
public String toString() {
	return "\n Avion [modelo=" + modelo + ", marca=" + marca + ", capacidadCombustible=" + capacidadCombustible
			+ ", tipoDeMotor=" + tipoDeMotor + ", cantidadDeAsientos=" + cantidadDeAsientos + ", estado=" + estado
			+ "]";
}

@Override
	public boolean equals(Object obj) {
	boolean flag= false; 	
	if(obj != null)
		{
		if(obj instanceof Avion)
		{
			 Avion avion= (Avion)obj; 
			 if(this.getModelo().equalsIgnoreCase(avion.getModelo()))
			 {
				 flag=true; 
			 }
		}
		}
		return flag;
	}
	
}
