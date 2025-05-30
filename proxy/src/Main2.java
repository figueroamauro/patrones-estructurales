
    public class Main2 {
        public static void main(String[] args) {
            // Usuario con credenciales válidas
            Mercadopagoproxy.MercadoPagoServicio usuarioAutenticado = new Mercadopagoproxy.MercadoPagoProxy("usuario@mercadopago.com", "1234");
            usuarioAutenticado.acceder();

            // Usuario con credenciales inválidas
            Mercadopagoproxy.MercadoPagoServicio usuarioInvalido = new Mercadopagoproxy.MercadoPagoProxy("hacker@malicioso.com", "incorrecto");
            usuarioInvalido.acceder();
        }
    }


