
@LoginTest
 Feature: Sauce Labs App

   #@Login1
   #Scenario: Login Ok
   #  Given ingreso al aplicativo de SauceLabs
   #  When inicio sesión con mi usuario "standard_user" y clave "secret_sauce"

   #  @Login2
   #Scenario: Login 2 Ok
   #  Given ingreso al aplicativo de SauceLabs
   #  When ingreso el usuario "standard_user"
   #  And ingreso la clave "secret_sauce"
   #  And hago clic en LOGIN
   #  Then valido el login OK

     @SauceCarrito
   Scenario Outline:
     Given estoy en la aplicación de SauceLabs
     And valido que carguen correctamente los productos en la galeria
     When agrego "<UNIDADES>" del siguiente producto "<PRODUCTO>"
     Then valido el carrito de compra actualice correctamente

  Examples:
    | PRODUCTO                  | UNIDADES |
    | Sauce Labs Backpack       | 1        |
    | Sauce Labs Bolt - T-Shirt | 1        |
    | Sauce Labs Bike Light     | 2        |
    | Sauce Labs Backpack       | 2        |

  #Nota:
  #el ejemplo 2 no será exitoso porque el nombre del producto en la app es Sauce Labs Bolt T-Shirt
  #(hay un guion de más en el ejemplo dado para el examen)
  #el ejemplo 3 no será exitoso porque la aplicación propia al hacer clic en ese producto se cierra
  # Pero para validar que me funciona el incrementar más de una unidad agregué un 4to ejemplo

   #@BuscarGoogle
   #Scenario: buscar imagenes por filtro en Google
   #  Given valido la pagina de google
   #  When ingreso el texto "departamentos"
   #  And doy tap en resultado
   #  And selecciono el filtro "Interiores" dentro de imagenes
   #  Then valido que se muestren resultados