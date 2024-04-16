
public class model {
	private String tenhang;
	private int dongia;
	private int soluong;
	private float thanhtien;
	


	public model(String tenhang, int dongia, int soluong, float thanhtien) {
        this.tenhang = tenhang;
        this.dongia = dongia;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
        
    }

	public model(Object tenhang2, Object object, Object object2, Object object3, String texttong2) {
		// TODO Auto-generated constructor stub
	}

	public String getTenhang() {
		return tenhang;
	}

	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}

	public int getDongia() {
		return dongia;
	}

	public void setDongia(int dongia) {
		this.dongia = dongia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public float getThanhtien() {
		return thanhtien;
	}

	public void setThanhtien(float thanhtien) {
		this.thanhtien = thanhtien;
	}

	
	
}
