package prj1.src.car;

public class MayBay extends PhuongTienDiChuyen {
  private String loaiNhienLieu;

  MayBay(HangSanXuat hangSanXuat, String loaiPhuongTien, String loaiNhienLieu) {
    super(hangSanXuat, loaiPhuongTien);
    this.loaiNhienLieu = loaiNhienLieu;
  }

  public void catCanh() {
    System.out.println("May bay dang cat canh");
  }

  public void haCanh() {
    System.out.println("May bay dang ha canh");
  }

  public String toString() {
    return super.toString() + " " + this.loaiNhienLieu;
  }

  public int layVanToc() {
    return 1000;
  }
}
