module org.example.javafx_project {
    requires javafx.controls;
    requires javafx.fxml;


    exports application;
    opens application to javafx.fxml;
    exports gui;
    opens gui to javafx.fxml;
}
