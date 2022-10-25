package Controlador;

import com.password4j.Hash;
import com.password4j.Password;

public class Utilidad {

    /**
     * Encripta una contraseña utilizando el algoritmo PBKDF2
     * @param password Contraseña a encriptar
     * @return Contraseña encriptada
     */
    public static String encriptar(String password){
        Hash hash = Password.hash(password).withPBKDF2();

        return hash.getResult();
    }
}
