package com.nttdata.steps;

import com.nttdata.screens.SauceLoginScreen;
import io.restassured.internal.common.assertion.Assertion;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SuaceLabsLoginSteps {
    private static final Logger log = LoggerFactory.getLogger(SuaceLabsLoginSteps.class);
    SauceLoginScreen login;


    public void ingresoElUsuario(String usuario) {
        login.ingresarUsuario(usuario);

    }

    public void ingresarClave(String arg0) {
        login.ingresarClave(arg0);
    }

    public void ingresar() {
        login.ingresar();
    }

    public void validacionLogin() {
        Assert.assertEquals("PRODUCTS",login.getTitulo() );
        Assert.assertTrue(login.getCountElements()>1);

    }

    public void validarPaginaGoogle() {
        login.validarGoogle();
    }

    public void ingresarTexto(String texto) {
        login.ingresarTexto(texto);
    }

    public void clicResultado() {
        login.clicResultado();
    }

    public void seleccionarFiltro(String filtro) {
        login.seleccionarFiltro(filtro);
    }

    public void validarResultados() {
        login.validarResultados();
    }

    public void validarGaleria() {
        login.validarGaleria();
    }

    public void agregarProducto(String unidades, String producto) {
        login.agregarProducto(unidades,producto);
    }

    public void validarCarrito() {
        login.validarCarrito();
    }
}
