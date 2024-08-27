package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.apache.commons.compress.compressors.gzip.GzipParameters;
import org.jruby.RubyProcess;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SauceLoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement txtUsuario;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement tituloApp;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Item\"]")
    private List<WebElement> lista2;

    @AndroidFindBy(id = "com.android.chrome:id/search_provider_logo")
    private WebElement imgGoogle;

    @AndroidFindBy(id = "com.android.chrome:id/signin_fre_dismiss_button")
    private WebElement sinUsuario;

    //@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"tsf\"]/android.view.View[1]/android.widget.EditText")
    //private WebElement searchBox;

    @AndroidFindBy(id = "com.android.chrome:id/search_box_text")
    private WebElement searchBox;

    //clic en 2ndo buscador
    @AndroidFindBy(id = "com.android.chrome:id/url_bar")
    private WebElement urlbar;

    //clic en historial de busqueda, primer elemento:
    //@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id="com.android.chrome:id/line_1" and @text="departamentos"]")
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.chrome:id/omnibox_suggestions_dropdown\"]/android.view.ViewGroup[1]/android.widget.LinearLayout")
    private WebElement resultado;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Images\"]")
    private WebElement lblImagenes;

    //    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"hdtb-sc\"]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View/android.view.View")
//    private WebElement lblFiltro;
//
//    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"rso\"]/android.view.View/android.view.View/android.view.View[1]")
//    private WebElement resultados;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Interior\"]")
    private WebElement lblFiltro;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"rso\"]/android.view.View/android.view.View")
    private WebElement resultados;
//Examen:
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]")
    private WebElement validarResultadosMyDemoApp;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productRV")
    private WebElement resultadosMyDemoApp;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    //@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup[1]")
    private WebElement resultadoIndividualMyDemoApp;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    private WebElement botonAgregarAlCarrito;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement validarBotonAgregarAlCarrito;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/noTV")
    private WebElement inputCantidad;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/plusIV")
    private WebElement botonAumentarCantidad;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartTV")
    private WebElement badgeCantidadEnCarrito;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement ValidarBadgeCantidadEnCarrito;

    //@AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartRL")
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    private WebElement botonCarrito;

    @AndroidFindBy(xpath = "com.saucelabs.mydemoapp.android:id/cartBt")
    private WebElement validarCargaCarrito;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/itemsTV")
    private WebElement valorItemsCarrito;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/priceTV")
    private WebElement valorIndividualCarrito;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/totalPriceTV")
    private WebElement valorSubtotalCarrito;


    public void ingresarUsuario(String texto){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(txtUsuario));

        waitFor(ExpectedConditions.elementToBeClickable(txtUsuario));


        txtUsuario.sendKeys(texto);
    }

    public void esperarElemento(WebElement elemento){
        waitFor(ExpectedConditions.elementToBeClickable(elemento));
    }

    public void ingresarClave(String arg0) {
        txtPassword.sendKeys(arg0);
    }

    public void ingresar() {
        btnLogin.click();
    }
    public int getCountElements(){
        //List<WebElement> lista = getDriver().findElements(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Item\"]"));
        return lista2.size();
    }

//
    public String getTitulo() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")));

        //WebElement titulo2 = getDriver().findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView"));

        //return titulo2.getText();
        return tituloApp.getText();


    }

    public void validarGoogle() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        waitFor(ExpectedConditions.visibilityOfElementLocated((By)sinUsuario));
        sinUsuario.click();
        wait = new WebDriverWait(getDriver(), 15);
        waitFor(ExpectedConditions.visibilityOfElementLocated((By)imgGoogle));
    }

    public void ingresarTexto(String texto) {
        //dar clic en buscador y enviar texto
        searchBox.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        waitFor(ExpectedConditions.visibilityOfElementLocated((By)urlbar));
        urlbar.click();
        urlbar.sendKeys(texto);
    }

    public void clicResultado() {
        resultado.click();
    }

    public void seleccionarFiltro(String filtro) {
        lblImagenes.click();

        if(lblFiltro.getText().contains(filtro)) {lblFiltro.click();}
        else{
            System.out.println("No se encontró el filtro: "+filtro);
        }
    }

    public void validarResultados() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        waitFor(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//android.widget.Button[@text=\"DISEÑO PARA UN REDUCIDO APARTAMENTO DE ESTILO INDUSTRIAL - Diseño ...\"])[1]"))));
        resultados.isDisplayed();
    }

    //Examen:
    public void validarGaleria() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        waitFor(ExpectedConditions.visibilityOfElementLocated((By.xpath("//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]"))));
        resultadosMyDemoApp.isDisplayed();
    }

    public void agregarProducto(String unidades, String producto) {
        //antes de hacer click validar el producto
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        //waitFor(ExpectedConditions.visibilityOfElementLocated((By.xpath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]"))));
        waitFor(ExpectedConditions.visibilityOfElementLocated((By.xpath("//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]"))));
        //Opcion 1
        String xpath = String.format("//android.widget.ImageView[@content-desc='%s']", producto);
        //System.out.println("xpath:" + xpath);
        WebElement productoCoincide =  resultadosMyDemoApp.findElement(By.xpath(xpath));
        productoCoincide.click();

        //System.out.println("Entra al producto");
        //Opcion 2
//        List<WebElement> resultadosP = resultadosMyDemoApp.findElements(By.className("android.view.ViewGroup"));
//        for (WebElement product : resultadosP) {
//            //Obtengo sus titulos
//            WebElement nombreActual = product.findElement(By.className("android.widget.ImageView"));
//            String nombreProd = nombreActual.getAttribute("content-desc");
//            if(nombreProd.equals(producto)){
//                product.click();
//                break;
//            }
//        }

        //resultadoIndividualMyDemoApp.click();
        wait = new WebDriverWait(getDriver(), 5);
        waitFor(ExpectedConditions.visibilityOfElementLocated((By.xpath("//android.widget.Button[@content-desc=\"Tap to add product to cart\"]"))));
        //waitFor(ExpectedConditions.visibilityOfElementLocated((By.xpath("//android.widget.ImageView[@content-desc=\"Increase item quantity\"]"))));

        if (unidades.equals("1")){
            botonAgregarAlCarrito.click();
        }else{
            System.out.println("Entra al if");
            //botonAumentarCantidad.click();

            while (!inputCantidad.getAttribute("Text").equals(unidades)){
                botonAumentarCantidad.click();
            }
            System.out.println("aumentó cantidad");
            botonAgregarAlCarrito.click();
            System.out.println("Agregó al carrito");
        }
    }

    public void validarCarrito() {
        System.out.println("llega a validar carrito");
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        waitFor(ExpectedConditions.visibilityOfElementLocated((By.xpath("//android.widget.RelativeLayout[@content-desc=\"Displays number of items in your cart\"]"))));

        System.out.println("llega a buscar badge");
        int cantidadEnCarro = Integer.parseInt(badgeCantidadEnCarrito.getText());
        if (cantidadEnCarro > 0){
            System.out.println("Se valida que aumentó cantidad en carrito");
        }
        botonCarrito.click();
        System.out.println("Se hace clic en carrito");

        wait = new WebDriverWait(getDriver(), 5);
        waitFor(ExpectedConditions.visibilityOfElementLocated((By.xpath("//android.widget.Button[@content-desc=\"Confirms products for checkout\"]"))));

        System.out.println("Se obtienen datos cant");
        String cantItems = valorItemsCarrito.getText();
        String cantLimpio = cantItems.replaceAll("[^0-9,]", "");
        int valorCantidadLimpio =  Integer.parseInt(cantLimpio);
        System.out.println("Se obtienen datos subT");
        String subtIndividual = valorIndividualCarrito.getText();
        String subtIndivLimpio = subtIndividual.replaceAll("[^0-9,]", "");
        int valorSubtIndivLimpio =  Integer.parseInt(subtIndivLimpio);
        System.out.println("Se obtienen datos tot");
        String subT = valorSubtotalCarrito.getText();
        String subTotLimpio = subT.replaceAll("[^0-9,]", "");
        double valorSubtotalLimpio =  Double.parseDouble(subTotLimpio);

        double precioXcantidad = valorSubtIndivLimpio * valorCantidadLimpio;

        if(precioXcantidad == valorSubtotalLimpio){
            System.out.println("El carrito calcula correctamente el total");
        }

    }
}
