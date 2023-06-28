module com.example.conexionmysqljavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.conexionmysqljavafx to javafx.fxml;
    exports com.example.conexionmysqljavafx;
}