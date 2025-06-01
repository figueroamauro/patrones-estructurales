package org.example.mercadoPago;

import org.example.ProcesadorDePago;

public class MercadoPagoFacade implements ProcesadorDePago {
    private final SistemaCobroMercadoPago sistemaCobroMercadoPago;
    private final SistemaFacturacionMercadoPago sistemaFacturacionMercadoPago;
    private final SistemaEnvioEmailMercadoPago sistemaEnvioEmailMercadoPago;

    public MercadoPagoFacade(SistemaCobroMercadoPago sistemaCobroMercadoPago, SistemaFacturacionMercadoPago sistemaFacturacionMercadoPago, SistemaEnvioEmailMercadoPago sistemaEnvioEmailMercadoPago) {
        this.sistemaCobroMercadoPago = sistemaCobroMercadoPago;
        this.sistemaFacturacionMercadoPago = sistemaFacturacionMercadoPago;
        this.sistemaEnvioEmailMercadoPago = sistemaEnvioEmailMercadoPago;
    }

    public void procesarPago(double monto) {
        boolean aprobado = sistemaCobroMercadoPago.procesarCobro(monto);
        if (aprobado) {
            String factura = sistemaFacturacionMercadoPago.generarFactura(monto);
            sistemaEnvioEmailMercadoPago.enviarEmail(factura);
        } else {
            System.out.println("No se pude procesar el pago");
        }
    }
}
