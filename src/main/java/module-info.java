module com.mycompany.week9_demo_simplecalc {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.week9_demo_simplecalc to javafx.fxml;
    exports com.mycompany.week9_demo_simplecalc;
}
