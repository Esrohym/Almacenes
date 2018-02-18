/**
 * 
 * @author Esrohym
 *
 */

/*
 * Implementar un almac�n de enteros mediante una tabla de huecos
 * se supone que no puede contener el valor 0 ya que indica posiciones libre.
 */
public class Almacen2 {

	
	// Array con los valores almacenados
	private int tvalores[];
	private int valoresAlmacenados = 0;
	
	// Constructores sin par�metros creo una tabla de 10 elementos
	public Almacen2(){
		this(10);  // Llamo al constructor con par�metros
	}

	// Constructor donde se fija tama�o m�ximo del Almac�n
	public Almacen2( int tama�o){
		tvalores = new int [tama�o];
		init();
	}
	
	// Pone todas las posiciones a LIBRES
	public void init (){
		valoresAlmacenados = 0;
	}
	
	// Muestra una cadena con los valores de la tabla
	public String toString (){
		
		StringBuilder cadena=new StringBuilder();
		
			for (int i=0;i<tvalores.length;i++) {
			
			if(tvalores[i]==0) {
				
				cadena.append("["+"E"+"]");
				
			}
			else{
				cadena.append("["+tvalores[i]+"]");
			}
			
			
				
			}
		
		return cadena.toString();
	}
	
	// Devuelve el n�meros de posiciones libres
	public int numPosicionesLibres(){
		return tvalores.length-valoresAlmacenados;
	}
	
	// Devuelve el n�mero de posiones ocupadas
	public int numPosicionesOcupadas(){
		return valoresAlmacenados;
	}
	
	// Devuelve verdadero o falso si est� almacenado el valor en la tabla
	public boolean estaValor ( int num){
		
			for (int i=0;i<tvalores.length;i++) {
			
				if(num==tvalores[i]) {
				
					return true;
				}
			}
	return false;
	}
	
	// Almacena el valor el la tabla, devuelve false sin no puede almacenarlo
	public boolean ponValor (int num){
		
		
		if(!estaLleno()) {
			
			tvalores[valoresAlmacenados]=num;
			
			valoresAlmacenados++;
			
			return true;
	
		}
		
	return false;
	}
	
	// Elimina el elemento de la tabla, si no esta devuelve false
	public boolean sacarValor (int num){
		
		if(estaValor(num)) {
			for(int i=0;i<valoresAlmacenados;i++) {
				if(tvalores[i]==num) {
				
					for(int j=i;j<valoresAlmacenados;j++) {
					
						if(j==tvalores.length-1) {
							
							tvalores[j]=0;
						}
						else {
							
							tvalores[j]=tvalores[j+1];
						
						}
							
						
					
					}
					
					
					valoresAlmacenados--;
					break;
					}
				
				
				
				
				}
			return true;
		}
		
	return false;
	}
      // Indica si el almac�n esta lleno
	public boolean estaLleno (){	
	
		if(tvalores.length==valoresAlmacenados) {
			
			return true;
		}
		
		
		return false;
	}
}


