package net.web.beans;

public class User {
	private int id;
	private String username;
	private String password;
	private String hoten;
	private String diachi;
	private String email;
	private String dienthoai;
	
	public User() {
		
	}
	
	public User(int id, String username, String password, String hoten, String diachi, String email, String dienthoai) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.hoten = hoten;
		this.diachi = diachi;
		this.email = email;
		this.dienthoai = dienthoai;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDienthoai() {
		return dienthoai;
	}
	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}
}
