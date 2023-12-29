package Entity;

public class Staff {
	String manv;
	String hoten;
	double lương;

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public double getLương() {
		return lương;
	}

	public void setLương(double lương) {
		this.lương = lương;
	}
	
	public double getThuNhap() {
		return this.getLương();
	}

}
