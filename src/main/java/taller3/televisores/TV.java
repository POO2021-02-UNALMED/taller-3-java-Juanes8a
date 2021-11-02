package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1 ;
	private int precio=500;
	private boolean estado=false;
	private int volumen=1;
	private Control control;
	
	private static int numTV=0;
	
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		setNumTV(getNumTV()+1);
	}
	public int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int num) {
		TV.numTV=num;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca mar) {
		this.marca=mar;
	}
	
	public Control getControl() {
			return control;
		}
	public void setControl(Control c) {
			this.control=c;
	}
	
	public int getPrecio() {
				return precio;
	}
	public void setPrecio(int p) {
				this.precio=p;
	}
	
	
	public int getVolumen() {
					return volumen;
				}
	public void setVolumen(int v) {
		if(estado && v >= 0 && v<=7) {
					this.volumen=v;
		}
}
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int can) {
		if(estado && can >= 1 && can<=120) {
		this.canal=can;
	}
}	
	
	public boolean getEstado() {
		return estado;
	}
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	
	public void canalUp() {
		if(estado && canal >= 1 && canal<120) {
			this.canal=canal+1;
		};
	}
	public void canalDown() {
		if(estado && canal > 1 && canal<=120) {
			this.canal=canal-1;
		}
	}
	
	public void volumenUp() {
		if(estado && volumen >= 0 && canal<7) {
			this.volumen=volumen+1;
		};
	}
	public void volumenDown() {
		if(estado && volumen > 0 && volumen<=7) {
			this.volumen=volumen-1;
		}
	}
}
