package Employees.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDriver {

  public static void main(String[] args) {
    Connection conn = null;

    try {
      // Đăng ký Driver (có thể bỏ qua từ JDBC 4.0 trở đi)
      Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

      // URL kết nối chính xác
      String url = "jdbc:mysql://localhost:3306/employees?useSSL=false&serverTimezone=UTC";
      String user = "root";
      String password = ""; // Điền mật khẩu MySQL của bạn ở đây
      // Kết nối tới MySQL
      conn = DriverManager.getConnection(url, user, password);
      System.out.println("Ket noi thanh cong!");
    } catch (SQLException ex) {
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // Đóng kết nối
      try {
        if (conn != null) {
          conn.close();
          System.out.println("Da dong ket noi.");
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
