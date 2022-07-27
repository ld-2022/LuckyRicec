module com.ld.luckyrice {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens com.ld.luckyrice to javafx.fxml;
    exports com.ld.luckyrice;
}