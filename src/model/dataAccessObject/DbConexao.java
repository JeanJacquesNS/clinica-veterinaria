package model.dataAccessObject;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jean Jacques N. Shimwa
 * @created 25-10-2022 - 3:53 PM
 */
public class DbConexao implements Serializable {

    private String host;
    private String db;
    private String user;
    private String password;
    private String porta;

    public DbConexao() {
        this.host = "localhost";
        this.porta = "3306";
        this.db = "clinica_veterinaria";
        this.user = "admin";
        this.password = "admin12345678";
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        DbConexao dbConexao = new DbConexao();
        return DriverManager.getConnection("jdbc:mysql://" + dbConexao.host + ":" + dbConexao.porta + "/" + dbConexao.db +
                "?user=" + dbConexao.user + "&password=" + dbConexao.password + "&noAccessToProcedureBodies=true");

    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }


}

