public class Mercadopagoproxy {


    // Interfaz común
    interface MercadoPagoServicio {
        void acceder();
    }




    // Clase real (servicio real de MercadoPago)
    static class MercadoPagoReal implements MercadoPagoServicio {
        private String email;

        public MercadoPagoReal(String email) {
            this.email = email;
        }

        @Override
        public void acceder() {
            System.out.println("✅ CRACK Accediendo a la cuenta de MercadoPago de: " + email);
        }
    }



    // Proxy que controla el acceso
    static class MercadoPagoProxy implements MercadoPagoServicio {
        private String email;
        private String password;
        private MercadoPagoReal servicioReal;

        // Simulación de credenciales válidas
        private static final String EMAIL_VALIDO = "usuario@mercadopago.com";
        private static final String PASSWORD_VALIDA = "1234";

        public MercadoPagoProxy(String email, String password) {
            this.email = email;
            this.password = password;
        }






        //mensajess
        @Override
        public void acceder() {
            if (autenticar()) {
                servicioReal = new MercadoPagoReal(email);
                servicioReal.acceder();
            } else {
                System.out.println("❌ Acceso denegado. Credenciales incorrectas,sos un hacker papu.");
            }
        }

        private boolean autenticar() {
            return EMAIL_VALIDO.equals(email) && PASSWORD_VALIDA.equals(password);
        }
    }

}
