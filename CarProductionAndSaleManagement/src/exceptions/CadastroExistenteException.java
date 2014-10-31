/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author danieljr
 */
public class CadastroExistenteException extends Exception {

    @Override
    public String getMessage() {
        return "O cadastro já encontra-se na base de dados!";
    }
    
    

}
