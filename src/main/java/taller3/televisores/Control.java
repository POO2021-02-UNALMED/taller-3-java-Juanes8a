package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tele) {
		tv=tele;
	
	}
	public void turnOn() {
		this.tv.turnOn();
	}
	public void turnOff() {
		this.tv.turnOff();
	}
	public void setCanal(int can) {
		this.tv.setCanal(can);
		
	}
	public void canalUp() {
		this.tv.canalUp();
	}
	public void canalDown() {
		this.tv.canalDown();
	}
	public void volumenUp() {
		this.tv.volumenUp();
	}
	public void volumenDown() {
		this.tv.volumenDown();
	}
	public TV getTv() {
		return tv;
	}
}
