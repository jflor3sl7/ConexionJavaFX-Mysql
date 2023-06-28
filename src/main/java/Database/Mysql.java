package Database;

import java.sql.*;

public class Mysql extends DataBase implements  Gestor{

    public Connection connection;
    public Statement statement;
    public ResultSet resultSet;
    public PreparedStatement preparedStatement;

    public Mysql(){
        super.setNombre("server");
        super.setUrl("jdbc:mysql://localhost:3306/conexion_mysql");
        super.setUsuario("root");
        super.setClave("jonathan8");
        super.setDriver("com.mysql.cj.jdbc.Driver");
    }

    @Override
    public Connection conectar() {
        connection = null;
        try {
            Class.forName(getDriver());
            connection = DriverManager.getConnection(getUrl(),getUsuario(),getClave());
            System.out.println("se conecto a la base de datos exitosamente");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return connection;
    }

    @Override
    public void insert(String nombre) {
    }

    @Override
    public void delete() {
    }

    @Override
    public void disconnect() {
        try {
            connection.close();
            System.out.println("Se desconecto de la base de datos!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
    }

    @Override
    public void search() {
    }

}
