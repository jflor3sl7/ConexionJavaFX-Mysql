package Database;

import java.sql.Connection;

public interface Gestor {

    public Connection conectar();
    public void insert(String nombre);
    public void delete();
    public void disconnect();
    public void update();
    public void search();



}
