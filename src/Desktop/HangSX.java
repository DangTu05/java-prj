package prj1.src.Desktop;

public class HangSX {
  private String tenHang;
  private QuocGia quocGia;

  HangSX(String tenHang, QuocGia quocGia) {
    this.tenHang = tenHang;
    this.quocGia = quocGia;
  }

  public void setTenHang(String tenHang) {
    this.tenHang = tenHang;
  }

  public String getTenHang() {
    return this.tenHang;
  }

  public void setQuocGia(QuocGia quocGia) {
    this.quocGia = quocGia;
  }

  public QuocGia getQuocGia() {
    return this.quocGia;
  }

  public String toString() {
    return this.tenHang + " " + this.quocGia;
  }
}
