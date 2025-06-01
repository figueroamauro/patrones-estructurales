package org.example.paypal;

import org.example.ProcesadorDePago;

public class PaypalFacade implements ProcesadorDePago {
    private final SistemaCobroPaypal sistemaCobroPaypal;
    private final SistemaFacturacionPaypal sistemaFacturacionPaypal;
    private final SistemaEnvioEmailPaypal sistemaEnvioEmailPaypal;

    public PaypalFacade(SistemaCobroPaypal sistemaCobroPaypal, SistemaFacturacionPaypal sistemaFacturacionPaypal, SistemaEnvioEmailPaypal sistemaEnvioEmailPaypal) {
        this.sistemaCobroPaypal = sistemaCobroPaypal;
        this.sistemaFacturacionPaypal = sistemaFacturacionPaypal;
        this.sistemaEnvioEmailPaypal = sistemaEnvioEmailPaypal;
    }

    public void procesarPago(double monto) {
        boolean aprobado = sistemaCobroPaypal.procesarCobro(monto);
        if (aprobado) {
            String factura = sistemaFacturacionPaypal.generarFactura(monto);
            sistemaEnvioEmailPaypal.enviarEmail(factura);
        } else {
            System.out.println("No se pude procesar el pago");
        }
    }
}
