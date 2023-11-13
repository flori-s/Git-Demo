module com.floris.gitdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.floris.gitdemo to javafx.fxml;
    exports com.floris.gitdemo;
}