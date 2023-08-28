package POO_con_clases_servicio.entidades;

public class DiscountCalculator {
    public static double DiscountCalculator(double pago){

        if (pago <= 100){
            return (pago * 0.10);
        } else if (pago > 100 && pago <1001){
            return (pago * 0.20);
        }else {
            return (pago * 0.25);
        }
    }
}
