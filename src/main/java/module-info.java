module org.example.javafx_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jdk.jshell;


    exports application;
    opens application to javafx.fxml;
    exports gui;
    opens gui to javafx.fxml;
    exports model.entities;
    opens model.entities to javafx.fxml;
    exports model.services;
    opens model.services to javafx.fxml;
}
