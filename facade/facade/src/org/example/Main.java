package org.example;

import org.example.mercadoPago.MercadoPagoFacade;
import org.example.mercadoPago.SistemaCobroMercadoPago;
import org.example.mercadoPago.SistemaEnvioEmailMercadoPago;
import org.example.mercadoPago.SistemaFacturacionMercadoPago;
import org.example.paypal.PaypalFacade;
import org.example.paypal.SistemaCobroPaypal;
import org.example.paypal.SistemaEnvioEmailPaypal;
import org.example.paypal.SistemaFacturacionPaypal;

public class Main {
    private static final double MONTO = 500.00;

    public static void main(String[] args) {

        SistemaCobroMercadoPago sistemaCobroMercadoPago = new SistemaCobroMercadoPago();
        SistemaFacturacionMercadoPago sistemaFacturacionMercadoPago = new SistemaFacturacionMercadoPago();
        SistemaEnvioEmailMercadoPago sistemaEnvioEmailMercadoPago = new SistemaEnvioEmailMercadoPago();

        SistemaCobroPaypal sistemaCobroPaypal = new SistemaCobroPaypal();
        SistemaFacturacionPaypal sistemaFacturacionPaypal = new SistemaFacturacionPaypal();
        SistemaEnvioEmailPaypal sistemaEnvioEmailPaypal = new SistemaEnvioEmailPaypal();

        ProcesadorDePago mercadoPago = new MercadoPagoFacade(sistemaCobroMercadoPago, sistemaFacturacionMercadoPago, sistemaEnvioEmailMercadoPago);
        ProcesadorDePago paypal = new PaypalFacade(sistemaCobroPaypal, sistemaFacturacionPaypal, sistemaEnvioEmailPaypal);

        mercadoPago.procesarPago(MONTO);
        System.out.println();
        paypal.procesarPago(MONTO);
    }
}
