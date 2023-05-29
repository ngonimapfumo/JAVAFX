module com.nm.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.nm.javafx to javafx.fxml;
    exports com.nm.javafx;
}