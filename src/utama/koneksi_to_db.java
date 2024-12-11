package utama;

import java.sql.*;

public class koneksi_to_db {
    private static Connection connection;
    public static void setupDatabaseConnection() {
        try {
            //Step 1
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver found");

            //Step2
            String url = "jdbc:mysql://localhost:3306/absensii";
            String username = "root";
            String pass = "";
            connection = DriverManager.getConnection(url, username, pass);
            System.out.println("Berhasil terhubung ke database");
        } catch (SQLException e) {
            System.out.println("Koneksi ke MySQL gagal!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan");
        }
    }
    public static Connection getConnection(){
        return connection;
    }
}
