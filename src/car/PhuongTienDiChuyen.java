package prj1.src.car;

public abstract class PhuongTienDiChuyen {
  private String loaiPhuongTien;
  private HangSanXuat hangSanXuat;

  PhuongTienDiChuyen(HangSanXuat hangSanXuat, String loaiPhuongTien) {
    this.hangSanXuat = hangSanXuat;
    this.loaiPhuongTien = loaiPhuongTien;
  }

  public void setLoaiPhuongTien(String loaiPhuongTien) {
    this.loaiPhuongTien = loaiPhuongTien;
  }

  public String getLoaiPhuongTien() {
    return this.loaiPhuongTien;
  }

  public void gethangSanXuat(HangSanXuat hangSanXuat) {
    this.hangSanXuat = hangSanXuat;
  }

  public HangSanXuat getHangSanXuat() {
    return this.hangSanXuat;
  }

  public void batDau() {
    System.out.println("Phuong tien dang bat dau di chuyen");
  }

  public void ketThuc() {
    System.out.println("Phuong tien da ket thuc di chuyen");
  }

  public void tangToc() {
    System.out.println("Phuong tien dang tang toc");
  }

  public abstract int layVanToc();

  public String toString() {
    return this.loaiPhuongTien + " " + this.hangSanXuat;
  }
}
