Feature: MercadoLibre
@busquedaProducto
  Scenario: Busqueda de Productos
    Given estoy en la página de MercadoLibre
    When busco un producto "Televisores Led 40 pulgadas"
    Then una lista de resultados
    And valido el primer titulo del resultado sea "Televisor inteligente S5400a LED Fhd Android Preta Tcl 110 V/220 V"


  #language: es
  @testfeature
  Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de Saucedemo
    Cuando inicio sesión con las credenciales usuario: "standard_user" y contraseña: "secret_sauce"
    Entonces valido que debería aparecer el título de "Products"
    Y también valido que al menos exista un item