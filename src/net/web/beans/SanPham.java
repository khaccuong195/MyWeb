package net.web.beans;

public class SanPham {
	public int id;
	public int nhasanxuatId;
	public String tensp;
	public double gia;
	public String manhinh;
	public String kichthuoc;
	public String cpu;
	public String trongluong;
	public String ram;
	public String pin;
	public String hinhanh;
	
	public SanPham() {
		
	}
	
	public SanPham(int id, int nhasanxuatId, String tensp, double gia, String manhinh, String kichthuoc, String cpu,
			String trongluong, String ram, String pin, String hinhanh) {
		super();
		this.id =
		this.nhasanxuatId = nhasanxuatId;
		this.tensp = tensp;
		this.gia = gia;
		this.manhinh = manhinh;
		this.kichthuoc = kichthuoc;
		this.cpu = cpu;
		this.trongluong = trongluong;
		this.ram = ram;
		this.pin = pin;
		this.hinhanh = hinhanh;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNhasanxuatId() {
		return nhasanxuatId;
	}
	public void setNhasanxuatId(int nhasanxuatId) {
		this.nhasanxuatId = nhasanxuatId;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public String getManhinh() {
		return manhinh;
	}
	public void setManhinh(String manhinh) {
		this.manhinh = manhinh;
	}
	public String getKichthuoc() {
		return kichthuoc;
	}
	public void setKichthuoc(String kichthuoc) {
		this.kichthuoc = kichthuoc;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getTrongluong() {
		return trongluong;
	}
	public void setTrongluong(String trongluong) {
		this.trongluong = trongluong;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	
}
