import java.util.ArrayList;

public class EntregaCartao {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep1 = "000000";

        Cliente cliente  = new Cliente();

        cliente.adcionaEndereco(endereco);
        System.out.println("gravado");
    }
}
