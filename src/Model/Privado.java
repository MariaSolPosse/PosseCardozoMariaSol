package Model;

public class Privado extends Avion{

	private boolean tieneJacuzzi; 
	private String claveWifi; 
	
	public Privado() {
		// TODO Auto-generated constructor stub
	}



	public Privado(String modelo, String marca, float capacidadCombustible, String tipoDeMotor, int cantidadDeAsientos,
			int estado, boolean tieneJacuzzi, String claveWifi) {
		super(modelo, marca, capacidadCombustible, tipoDeMotor, cantidadDeAsientos, estado);
		this.tieneJacuzzi = tieneJacuzzi;
		this.claveWifi = claveWifi;
	}



	public boolean isTieneJacuzzi() {
		return tieneJacuzzi;
	}


	public String getClaveWifi() {
		return claveWifi;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Privado [tieneJacuzzi=" + tieneJacuzzi + ", claveWifi=" + claveWifi + "]";
	}
	
	
	
}
