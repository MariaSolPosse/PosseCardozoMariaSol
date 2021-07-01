package Model;

public class Carga extends Avion implements iIngreso {
private int cantMax;
private int cant; 
private String productos; 

public Carga() {
	// TODO Auto-generated constructor stub
}




public Carga(String modelo, String marca, float capacidadCombustible, String tipoDeMotor, int cantidadDeAsientos,
		int estado, int cantMax, int cant, String productos) {
	super(modelo, marca, capacidadCombustible, tipoDeMotor, cantidadDeAsientos, estado);
	this.cantMax = cantMax;
	this.cant = cant;
	this.productos = productos;
}




public int getCantMax() {
	return cantMax;
}

public int getCant() {
	return cant;
}

public String getProductos() {
	return productos;
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

public String Descarga()
{return "descargando"; 
}


@Override
public String toString() {
	return super.toString()+"Carga [cantMax=" + cantMax + ", cant=" + cant + ", productos=" + productos + "]";
}



	
}
