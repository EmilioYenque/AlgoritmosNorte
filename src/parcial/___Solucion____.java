package parcial;

public class ___Solucion____ {

	double[] s = {1200.5,1600.2,600.4,1000.3,4700.1,700.0,3400.8,3600.6,5100.9,2000.7};
	
	
	public int tamaño(){
		return s.length ;
	}
	
	public double obtener(int pos){
		return s[pos];
	}
	//Precio promedio
	public double promedio(){
		double suma=0;
		for(double pro:s ){
		suma+=pro;
			}
		return suma/s.length;
	}
	//Precio mayor
	public double mayor(){
		double may=s[0];
		for(double pro:s){
			if(pro>may){
				may=pro;
			}
		}
		return may;
	}
	//Precio menor
	public double menor(){
		double men=s[0];
		for(double pro:s){
			if(pro<men){
				men=pro;
			}
		}
		return men;
	}
	
	//cantidades mayores al precio
	public int mayorPromedio(){
		int c=0;
		for(double aux:s){
			if(aux<promedio())
				c++;
		}
		return c;
	}
	
	//Cantidades menores al precio
	public int menorPromedio(){
		int c=0;
		for(double aux:s){
			if(aux>promedio())
				c++;
		}
		return c;
	}
	
	//Buscar Primer precio menor al minimo
	public int buscarUltPrecMenorMin(){
		int buscar=-1,c=0;
		for(int i=0; i<s.length; i++){
			if(s[i]>1000){
				buscar=i;
				break;
			}
		}
		return buscar;
	}
	//buscar primer precio mayor al minimo
	public int buscarUltPrecMayMin(){
		int buscar= -1,c=0;
		for(int i=0; i<s.length;i++){
			if(s[i]<1000){
				buscar=i;
				break;
			}
		}
		return buscar;
	}
	
	
	
	
	
}











