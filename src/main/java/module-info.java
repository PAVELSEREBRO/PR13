module com.example.pr13 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.scripting;


    opens com.example.pr13 to javafx.fxml;
    exports com.example.pr13;
}