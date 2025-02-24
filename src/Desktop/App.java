package prj1.src.Desktop;

public class App {
  public static void main(String[] args) {
    Ngay ngay1 = new Ngay(12, 12, 2005);
    Ngay ngay2 = new Ngay(16, 12, 2009);
    Ngay ngay3 = new Ngay(05, 1, 1990);
    QuocGia quocGia1 = new QuocGia("VN", "Việt Nam");
    QuocGia quocGia2 = new QuocGia("USA", "Mỹ");
    QuocGia quocGia3 = new QuocGia("UK", "Anh");
    HangSX hangSX1 = new HangSX("Dell", quocGia1);
    HangSX hangSX2 = new HangSX("HP", quocGia2);
    HangSX hangSX3 = new HangSX("Lenovo", quocGia3);
    MayTinh desktop1 = new MayTinh(hangSX3, ngay1, 1, 1000);
    MayTinh desktop2 = new MayTinh(hangSX2, ngay2, 2, 1500);
    MayTinh desktop3 = new MayTinh(hangSX1, ngay3, 2, 2000);
    System.out.println(desktop1.ktraGiaThapHon(desktop3));
    System.out.println(desktop1.getTenQuocGia());
  }
}
