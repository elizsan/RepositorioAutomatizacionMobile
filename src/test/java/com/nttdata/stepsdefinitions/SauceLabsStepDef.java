package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SuaceLabsLoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SauceLabsStepDef {
    @Steps
    SuaceLabsLoginSteps login;

    @When("ingreso el usuario {string}")
    public void ingresoElUsuario(String usuario) {
        login.ingresoElUsuario(usuario);
    }

    @Given("ingreso al aplicativo de SauceLabs")
    public void ingresoAlAplicativoDeSauceLabs() {
    }

    @When("inicio sesión con mi usuario {string} y clave {string}")
    public void inicioSesiónConMiUsuarioYClave(String arg0, String arg1) {
        login.ingresoElUsuario(arg0);
        login.ingresarClave(arg1);
        login.ingresar();

    }



    @And("ingreso la clave {string}")
    public void ingresoLaClave(String arg0) {
        login.ingresarClave(arg0);
    }

    @And("hago clic en LOGIN")
    public void hagoClicEn() {
        login.ingresar();
    }

    @And("valido el login OK")
    public void validoElLoginOK() {
        login.validacionLogin();
    }

    @Given("valido la pagina de google")
    public void validoLaPaginaDeGoogle() {
        login.validarPaginaGoogle();
    }

    @When("ingreso el texto {string}")
    public void ingresoElTexto(String texto) {
        login.ingresarTexto(texto);
    }

    @And("doy tap en resultado")
    public void doyTapEnResultado() {
        login.clicResultado();
    }

    @And("selecciono el filtro {string} dentro de imagenes")
    public void seleccionoElFiltroDentroDeImagenes(String filtro) {
        login.seleccionarFiltro(filtro);
    }

    @Then("valido que se muestren resultados")
    public void validoQueSeMuestrenResultados() {
        login.validarResultados();
    }

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {

    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        login.validarGaleria();
    }

//    @When("agrego <UNIDADES> del siguiente producto {string}")
//    public void agregoUNIDADESDelSiguienteProducto(String arg0) {

//    }

    @When("agrego {string} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(String unidades, String producto) {
        login.agregarProducto(unidades,producto);
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        login.validarCarrito();
    }
}
