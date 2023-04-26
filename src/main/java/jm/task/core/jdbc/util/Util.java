package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static String url = "jdbc:mysql://localhost:3306/kata";
    private static String userDB = "root";
    private static String passwordDB = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userDB, passwordDB);
            System.out.println("БД подключена");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка при подключении БД");
        }
        return connection;
    }
}
