package br.mackenzie.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
    private final String MESSAGE="Valor de papel moeda inserido contém um valor fora dos parâmetros permitidos. Os valores permitidos são 2, 5, 10, 50, 100.";
    public PapelMoedaInvalidaException() {
        System.out.println("Erro:" + getMessage());
    }

    @Override
    public String getMessage() {
        return this.MESSAGE; //To change body of generated methods, choose Tools | Templates.
    }

}
