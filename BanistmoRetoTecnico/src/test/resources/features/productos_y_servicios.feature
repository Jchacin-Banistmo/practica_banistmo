# language: es
# autor: Jonathan Chacin

@RevisionProductosYServicios
Característica: Realizar la descarga de contrato de tarjeta de credito
  Yo como cliente
  Quiero realizar visualizacion de los productos y servicios en el sitio web de Banistmo
  Para obtener informacion detallada de los productos.

  Antecedentes: Ingreso a la Web de Banistmo
    Dado que ingreso la pagina web de Banistmo

  @DescargaContratoTDC
  Escenario: Realizar descarga de contrato de tarjeta de credito
    Cuando abro el contrato de tarjeta de credito
    Entonces verifico que se muestre el contrato de TDC en pdf


  @VisualizacionDeCuentasCorrientes
  Escenario: Visualizar el modulo de cuenta corriente
    Cuando cuando entro a los productos de Depositos
    Entonces verifico que se muestre la pagina de "Cuentas Corriente"