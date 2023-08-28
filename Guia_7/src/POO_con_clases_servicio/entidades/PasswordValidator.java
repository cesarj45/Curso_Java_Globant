package POO_con_clases_servicio.entidades;

public class PasswordValidator {

    public static int PasswordValidator(String pass){
        int seguridad = 0;
        if(pass.matches("^[^\\s]{8,16}$")){
            seguridad += 20;

            if(pass.matches("^(.*)[a-z]+(.*)$")){
                seguridad += 10;
            }
            if(pass.matches("^(.*)[A-Z]++(.*)$")){
                seguridad += 25;
            }
            if(pass.matches("^(.*)\\d+(.*)$")){
                seguridad += 25;
            }
            if(pass.matches("^(.*)[!@#$%^&*?]+(.*)$")){
                seguridad += 20;
            }
        }
        if (seguridad>0){
            if (seguridad<55){
                System.out.println("Seguridad: Debil");
            }else if (seguridad<100){
                System.out.println("Seguridad: Media");
            }else System.out.println("Seguridad: Fuerte");
        }else System.out.println("Contraseña no valida.");

        return seguridad;
    }
}
