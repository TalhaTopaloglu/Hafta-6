import java.sql.*;

public class Main {
    // SQL veri bilgilerini static olarak tanımlıyoruz
    public static final String DB_URL = "jdbc:mysql://localhost/employees";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        // Connection ve Statement'ı null'e eşitliyoruz.
        Connection conn = null;
        Statement st = null;

        try{
            //getConnection ile ilgili veritabanına bağlanıyoruz.
            conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            st = conn.createStatement();

            //manuel olarak employees tablosuna 5 adet veri giriyoruz.
            String updateQuery1 = "INSERT INTO employees (employee_name,employee_position,employee_salary) VALUES ('Ahmet' , 'Worker' , '2000')";
            st.executeUpdate(updateQuery1);
            String updateQuery2 = "INSERT INTO employees (employee_name,employee_position,employee_salary) VALUES ('Mehmet' , 'Worker' , '2000')";
            st.executeUpdate(updateQuery2);
            String updateQuery3 = "INSERT INTO employees (employee_name,employee_position,employee_salary) VALUES ('Ayşe' , 'Manager' , '2500')";
            st.executeUpdate(updateQuery3);
            String updateQuery4 = "INSERT INTO employees (employee_name,employee_position,employee_salary) VALUES ('Fatma' , 'Worker' , '2000')";
            st.executeUpdate(updateQuery4);
            String updateQuery5 = "INSERT INTO employees (employee_name,employee_position,employee_salary) VALUES ('Hasan' , 'Manager' , '2500')";
            st.executeUpdate(updateQuery5);

            //ResultSet ile tüm tablodaki verileri seçiyoruz.
            ResultSet resultSet = st.executeQuery("SELECT * FROM employees");

            //next() metodu false dönene kadar satır okuması yapıyoruz
            while (resultSet.next()) {
                System.out.println("ID : " + resultSet.getInt("employee_id"));
                System.out.println("Adı : " + resultSet.getString("employee_name"));
                System.out.println("Pozisyon : " + resultSet.getString("employee_position"));
                System.out.println("Maaş : " + resultSet.getInt("employee_salary"));
                System.out.println("#################");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}