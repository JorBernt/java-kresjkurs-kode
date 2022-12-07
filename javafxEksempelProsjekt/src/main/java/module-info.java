module com.example.javafxprosjekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxprosjekt to javafx.fxml;
    exports com.example.javafxprosjekt;
}