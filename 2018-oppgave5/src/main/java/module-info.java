module com.example.oppgave52018 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oppgave52018 to javafx.fxml;
    exports com.example.oppgave52018;
}