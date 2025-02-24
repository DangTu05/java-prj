package prj1.src.car;

public class OTO extends PhuongTienDiChuyen {
  private String loaiNhienLieu;

  OTO(HangSanXuat hangSanXuat, String loaiPhuongTien, String loaiNhienLieu) {
    super(hangSanXuat, loaiPhuongTien);
    this.loaiNhienLieu = loaiNhienLieu;
  }

  public void setLoaiNhienLieu(String loaiNhienLieu) {
    this.loaiNhienLieu = loaiNhienLieu;
  }

  public String getLoaiNhienLieu() {
    return this.loaiNhienLieu;
  }

  public int layVanToc() {
    return 300;
  }
}
