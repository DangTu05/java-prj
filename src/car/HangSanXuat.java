package prj1.src.car;

public class HangSanXuat {
  private String hangSX;
  private String tenQuocGia;

  HangSanXuat(String hangSX, String tenQuocGia) {
    this.hangSX = hangSX;
    this.tenQuocGia = tenQuocGia;
  }

  public void setHangSX(String hangSX) {
    this.hangSX = hangSX;
  }

  public String getHangSX() {
    return this.hangSX;
  }

  public void setTenQuocGia(String tenQuocGia) {
    this.tenQuocGia = tenQuocGia;
  }

  public String getTenQuocGia() {
    return this.tenQuocGia;
  }

  public String toString() {
    return this.hangSX + " " + this.tenQuocGia;
  }
}
