
public class Notas {
//Atributos
	double notas;

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	public boolean AprobadosYReprobados()
	{
	  if (this.notas>=6) {
		return true;
	}else {
		return false;
	}
		
		
		
	}

	
}
