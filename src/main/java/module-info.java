module com.example.operador {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.operador to javafx.fxml;
    exports com.example.operador;
}