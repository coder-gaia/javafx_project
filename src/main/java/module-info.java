module org.example.javafx_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafx_project to javafx.fxml;
    exports org.example.javafx_project;
}