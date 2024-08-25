module org.example.laboratoriouno {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.laboratoriouno to javafx.fxml;
    exports org.example.laboratoriouno;
}