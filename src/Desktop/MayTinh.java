package prj1.src.Desktop;

public class MayTinh {
  private HangSX hangSX;
  private Ngay ngaySX;
  private int thangBaoHang;
  private double giaBan;

  MayTinh(HangSX hangSX, Ngay ngaySX, int thangBaoHang, double giaBan) {
    this.hangSX = hangSX;
    this.ngaySX = ngaySX;
    this.thangBaoHang = thangBaoHang;
    this.giaBan = giaBan;
  }

  public void setGiaBan(double giaBan) {
    this.giaBan = giaBan;
  }

  public double getGiaBan() {
    return this.giaBan;
  }

  public void setHangSX(HangSX hangSX) {
    this.hangSX = hangSX;
  }

  public HangSX getHangSX() {
    return this.hangSX;
  }

  public void setNgaySX(Ngay ngaySX) {
    this.ngaySX = ngaySX;
  }

  public Ngay getNgaySX() {
    return this.ngaySX;
  }

  public void setThangBaoHang(int thangBaoHang) {
    this.thangBaoHang = thangBaoHang;
  }

  public int getThangBaoHang() {
    return this.thangBaoHang;
  }

  public String toString() {
    return this.hangSX.toString() + " " + this.ngaySX.toString() + " " + this.thangBaoHang + " " + this.giaBan;
  }

  public boolean ktraGiaThapHon(MayTinh d) {
    return this.giaBan < d.giaBan;
  }

  public String getTenQuocGia() {
    return this.hangSX.getQuocGia().getTenQuocGia();
  }
}
