module com.example.laboratorioprog {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laboratorioprog to javafx.fxml;
    exports com.example.laboratorioprog;
}