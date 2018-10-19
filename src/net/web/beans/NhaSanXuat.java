package net.web.beans;

public class NhaSanXuat {
	public int id;
	public String tennsx;
	
	public NhaSanXuat() {
		
	}
	
	public NhaSanXuat(int id, String tennsx) {
		super();
		this.id = id;
		this.tennsx = tennsx;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTennsx() {
		return tennsx;
	}
	public void setTennsx(String tennsx) {
		this.tennsx = tennsx;
	}
	
}
