module br.com.calculadora.comercio.taxa.vendas {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.calculadora.comercio.taxa.vendas to javafx.fxml;
    exports br.com.calculadora.comercio.taxa.vendas;
}
