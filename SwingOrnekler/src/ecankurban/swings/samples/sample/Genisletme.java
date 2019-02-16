package ecankurban.swings.samples.sample;

import javax.swing.JLabel;

public class Genisletme extends JLabel{
	
	private String adi;
	private String soyadi;
	private String tcNo;
	private Roller rol;
	
	public Genisletme() {
		super("Yeni Label");
	}
	
	
	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public Roller getRol() {
		return rol;
	}
	public void setRol(Roller rol) {
		this.rol = rol;
	}
	

}
