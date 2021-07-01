package app;

import Model.Aeropuerto;
import Model.Privado;
import Model.Comercial;
import Model.Militar;
import Model.Carga;

public class Main {

	public static void main(String[] args) {
	
		Aeropuerto astor= new Aeropuerto("Astor Piazzola", "1555", "ruta 2 20000", 5000);
		
		boolean flag; 

		Privado p1= new Privado("boing", "sony", 10000, "tipo", 100, 0, true, "elAvion"); 
		flag= astor.aterrizar(p1); 
		
	    confirmacion(flag);
		
	    Privado p2= new Privado("boing2", "sony2", 10000, "tipo", 100, 0, true, "elAvioncito");
		flag= astor.aterrizar(p2); 
		
		confirmacion(flag); 
		
        System.out.println( astor.listarAvionesPrivados());
        
        Comercial c1= new Comercial("avion13", "sony2", 10000, "tipo", 100, 0,10, "catering, baño, sofa cama");
         flag= astor.aterrizar(c1); 
         confirmacion(flag); 
         
        Comercial c2= new Comercial("avion14", "sony2", 10000, "tipo", 100, 0,10, "catering, baño, sofa cama"); 
        flag=astor.aterrizar(c2); 
        confirmacion(flag); 
        
       System.out.println("AVIONES COMERCIALES \n \n\n "+ astor.listarAvionesComerciales());
      
       astor.despegarTodosComerciales(); 
       System.out.println("SE HA LIBERADO EL HANGAR COMERCIAL ");
       System.out.println("AVIONES COMERCIALES \n \n\n "+ astor.listarAvionesComerciales());
     
        
        }
public static void confirmacion (boolean flag)
{
	if(!flag)
	{
		System.out.println("NO HAT CAPACIDAD ");
	}
	else 
	{
	  System.out.println("HA INGRESADO UN AVION ");
	}	
}

}
