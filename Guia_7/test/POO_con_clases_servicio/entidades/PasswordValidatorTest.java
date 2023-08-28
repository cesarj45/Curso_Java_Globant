package POO_con_clases_servicio.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void passwordValidator() {
        int seguridad = PasswordValidator.PasswordValidator("holaSoe%st1d");
        assertEquals(100, seguridad);
    }
}