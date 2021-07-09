import javax.servlet.http.HttpServlet;
import java.sql.*;

public class jdbctest{


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //配置信息
        String url = "jdbc:mysql://wobs.top:3306/smbms?serverTimezone=Asia/Shanghai&characterEncoding=utf8&useUnicode=true&useSSL=false";
        String username = "***********";
        String password = "***************";

//        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String sql = "select * from smbms_user";
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()){
            System.out.println("id"+rs.getObject("id"));
            System.out.println("userCode"+rs.getObject("userCode"));
            System.out.println("userName"+rs.getObject("userName"));
            System.out.println("userPassword"+rs.getObject("userPassword"));
            System.out.println("birthday"+rs.getObject("birthday"));
            System.out.println("");

        }
        rs.close();
        statement.close();
        connection.close();
    }
}
