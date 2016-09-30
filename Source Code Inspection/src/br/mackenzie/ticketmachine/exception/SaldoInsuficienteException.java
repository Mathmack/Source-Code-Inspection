package br.mackenzie.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
    private final String MESSAGE="O saldo inserido é inferior ao valor do ticket.";
    public SaldoInsuficienteException() {
        System.out.println("Erro:" + getMessage());
    }

    @Override
    public String getMessage() {
        return this.MESSAGE; //To change body of generated methods, choose Tools | Templates.
    }
    
}
