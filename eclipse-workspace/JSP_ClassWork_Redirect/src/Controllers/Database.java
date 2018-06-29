package Controllers;

import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;


public class Database {

    private final static String HOSTNAME = "localhost";
    private final static String DBNAME = "user";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    private final Connection conn;

    public Database() throws SQLException {
        conn = DriverManager.getConnection(
                "jdbc:mysql://" + HOSTNAME + "/" + DBNAME,
                USERNAME, PASSWORD);
    }

    public Connection getConn() {
        return conn;
    }
    
    boolean checkLogin(String user, String pass) throws SQLException {

        String sql = "SELECT * FROM user WHERE username=" + "'" + user + "'";

//        try (Statement stmt = getConn().createStatement()) {
//            ResultSet result = stmt.executeQuery(sql);
//            if (result.next()) {
//                int id = result.getInt("id");
//                String name = result.getString("name");
//                String username = result.getString("username");
//
//                
//                String password = result.getString("password");
//                boolean isDef = result.getBoolean("isDefault");
//
//                if (password.equals(pass)) {
//
//                    return true;
//                } else {
//                    return false;
//                }
//            } else {
//                throw new RecordNotFoundException("Username or password are incorrect!");
//
//                // return null;
//            }
//        }
    }
}