package prj1.src.Desktop;

public class Ngay {
  private int ngay;
  private int thang;
  private int nam;

  Ngay(int ngay, int thang, int nam) {
    this.ngay = ngay;
    this.thang = thang;
    this.nam = nam;
  }

  public void setNgay(int ngay) {
    this.ngay = ngay;
  }

  public int getNgay() {
    return this.ngay;
  }

  public void setThang(int thang) {
    this.thang = thang;
  }

  public int getThang() {
    return this.thang;
  }

  public void setNam(int nam) {
    this.nam = nam;
  }

  public int getNam() {
    return this.nam;
  }

  public String toString() {
    return this.ngay + "/" + this.thang + "/" + this.nam;
  }
}
