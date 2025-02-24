package prj1.src.Desktop;

public class QuocGia {
  private String maQuocGia;
  private String tenQuocGia;

  QuocGia(String maQuocGia, String tenQuocGia) {
    this.maQuocGia = maQuocGia;
    this.tenQuocGia = tenQuocGia;
  }

  public void setMaQuocGia(String maQuocGia) {
    this.maQuocGia = maQuocGia;
  }

  public String getMaQuocGia() {
    return this.maQuocGia;
  }

  public void setTenQuocGia(String tenQuocGia) {
    this.tenQuocGia = tenQuocGia;
  }

  public String getTenQuocGia() {
    return this.tenQuocGia;
  }

  public String toString() {
    return this.maQuocGia + " " + this.tenQuocGia;
  }
}
