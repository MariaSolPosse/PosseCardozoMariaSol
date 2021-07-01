package Model;

import java.util.ArrayList;

public class Aeropuerto {
	private String nombre; 
	private String codigoInternacional; 
	private String direccion; 
	private int capacidadOperacionMax;
	private ArrayList<Comercial> comerciales;
	private ArrayList<Privado> privados;
	private ArrayList<Carga> cargas;
	private ArrayList<Militar> militares;
	
	public Aeropuerto() {
		comerciales= new ArrayList<>(); 
		privados= new ArrayList<>(); 
		cargas= new ArrayList<>(); 
		militares= new ArrayList<>(); 
	}

	public Aeropuerto(String nombre, String codigoInternacional, String direccion, int capacidadOperacionMax)
	{
		super();
		this.nombre = nombre;
		this.codigoInternacional = codigoInternacional;
		this.direccion = direccion;
		this.capacidadOperacionMax = capacidadOperacionMax;
		comerciales= new ArrayList<>(); 
		privados= new ArrayList<>(); 
		cargas= new ArrayList<>(); 
		militares= new ArrayList<>(); 
	}

	public String getNombre() {
		return nombre;
	}

	public String getCodigoInternacional() {
		return codigoInternacional;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getCapacidadOperacionMax() {
		return capacidadOperacionMax;
	}
 
	
	
   public void agregarUnAvion(Object obj)
   {
	   if(obj != null)
	   {
		   if(obj instanceof Privado)
		   {
			   Privado priv= (Privado)obj; 
			   privados.add(priv); 
		   }
		   else if (obj instanceof Comercial)
		   {
			   Comercial come= (Comercial)obj; 
			   comerciales.add(come);		 
			   }else if(obj instanceof Carga)
			   {
				   Carga carga= (Carga)obj; 
				   cargas.add(carga); 
			   }
			   else if (obj instanceof Militar)
			   {
				   Militar mili= (Militar)obj; 
				   militares.add(mili); 
			   }
	   }
   }
   public int cuentaComerciales() {
      return comerciales.size(); 	   
   }
   public int cuentaPrivados() 
   {
	   return privados.size(); 
   }
   public int cuentaCargas() {
	   return cargas.size(); 
   }
	
  public int cuentaMilitares() 
  {
	  return militares.size(); 
  }
  public int cantidadDeAvionesActuales()
  {
	  int total= 0; 
	  total= this.cuentaComerciales()+this.cuentaPrivados()+this.cuentaMilitares()+this.cuentaCargas(); 
	  return total;  
  }
	public boolean aterrizar(Object obj)  /// se fija si la capacidad da para que ingrese otro avion de otro modo lo rechaza 
	{
		boolean flag= false; 
		if (this.getCapacidadOperacionMax() < this.cantidadDeAvionesActuales())
		{
		    this.agregarUnAvion(obj);
			flag= true;
		}
		else 
		{
			flag= false;
		}
		return flag; 
	}
	
	public int buscarAvionComerciales(String modelo) {
		Avion buscado= new Avion(modelo); 
		int index= -1; 
		int i =0; 
		for(i=0; i <this.cuentaComerciales(); i++)
		{
			if(buscado.equals(comerciales.get(i)))
			{
				index= i; 
			}
		}
		
		
		return index; 
	}
		
	public int buscarAvionPrivado(String modelo) {
		Avion buscado= new Avion(modelo); 
		int index= -1; 
		int i =0; 
		for(i=0; i <this.cuentaPrivados(); i++)
		{
			if(buscado.equals(privados.get(i)))
			{
				index= i; 
			}
		}
		
		return index; 
	}
	public int buscarAvionCargas(String modelo) {
		Avion buscado= new Avion(modelo); 
		int index= -1; 
		int i =0; 
		for(i=0; i <this.cuentaCargas(); i++)
		{
			if(buscado.equals(cargas.get(i)))
			{
				index= i; 
			}
		}
		
		return index; 
	}
	
	public int buscarAvionMilitar(String modelo) {
		Avion buscado= new Avion(modelo); 
		int index= -1; 
		int i =0; 
		for(i=0; i <this.cuentaMilitares(); i++)
		{
			if(buscado.equals(militares.get(i)))
			{
				index= i; 
			}
		}
		 
		
		return index; 
	}
	
	public Avion buscarAvion(String modelo)
	{
		Avion avion= new Avion();
		int rta=-1;
		rta=this.buscarAvionCargas(modelo);
        if(rta>0)
        {
        	avion=cargas.get(rta); 
        }
		if (rta== -1) {
			rta=this.buscarAvionComerciales(modelo);
		}else if(rta>0)
		{
			avion=comerciales.get(rta); 
		}
		if (rta== -1) {
			rta=this.buscarAvionPrivado(modelo);
		}else if(rta>0)
		{
			avion=privados.get(rta); 
		}
		if (rta== -1) {
			rta=this.buscarAvionMilitar(modelo);
		}else if(rta>0)
		{
			avion=militares.get(rta); 
		}
		return avion; 
		
	}
	
	
    public void eliminaUnAvion(String modelo)
    {
    	Avion avion= new Avion(); 
    	avion= this.buscarAvion(modelo);
    	int index; 
    	if(avion.getModelo().equalsIgnoreCase(modelo))
    	{
    		if(avion instanceof Privado)
    		{
    			index=this.buscarAvionPrivado(modelo); 
    			privados.remove(index); 
    		}
    		else if(avion instanceof Comercial)
    		{
    			index= this.buscarAvionComerciales(modelo); 
    			comerciales.remove(index); 
    		}
    		else if (avion instanceof Militar)
    		{
    			index=this.buscarAvionMilitar(modelo); 
    			militares.remove(index);
    		}
    		else 
    		{
    			index=this.buscarAvionCargas(modelo); 
    		    cargas.remove(index);
    		}
    		
    		
    		
    	}
    }
		
   public String listarAvionesPrivados()
   {
	   StringBuilder builder = new StringBuilder(); 
	   int i = 0; 
	   for(i=0 ; i< privados.size(); i++)
	   {
		   builder.append(privados.get(i).toString()); 
	   }
	   return builder.toString(); 
	   
	   
   }
   public String listarAvionesComerciales()
   {
	   StringBuilder builder = new StringBuilder(); 
	   int i = 0; 
	   for(i=0 ; i< comerciales.size(); i++)
	   {
		   builder.append(comerciales.get(i).toString()); 
	   }
	   return builder.toString(); 
	   
	   
   }
   
   public String listarAvionesMilitares()
   {
	   StringBuilder builder = new StringBuilder(); 
	   int i = 0; 
	   for(i=0 ; i< militares.size(); i++)
	   {
		   builder.append(militares.get(i).toString()); 
	   }
	   return builder.toString(); 
	   
	   
   }
   
   public String listarAvionesCarga()
   {
	   StringBuilder builder = new StringBuilder(); 
	   int i = 0; 
	   for(i=0 ; i< cargas.size(); i++)
	   {
		   builder.append(cargas.get(i).toString()); 
	   }
	   return builder.toString(); 
   }

   public void despegarTodosPrivados()
   {
	   this.privados.clear();
   }
   public void despegarTodosComerciales()
   {
	   this.comerciales.clear();
   }
   public void despegarTodosMilitares ()
   {
	   this.militares.clear();
	   
   } 
   public void despegarTodosCargas()
   {
	   this.cargas.clear();
   } 
   
   public void despegarUnAvion(String modelo) 
   { 
	  this.eliminaUnAvion(modelo); 
	  
   }
   
   
   
}
