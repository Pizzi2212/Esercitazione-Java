public class Cliente {
    private String codiceCliente;
    private String nomeCognome;
    private String email;
    private int maxPrestito;

    public Cliente(String codiceCliente, String nomeCognome, String email, int maxPrestito){
        this.codiceCliente = codiceCliente;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.maxPrestito = maxPrestito;
    }
}
