import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    public Endereco endereço; // CERTO, MAS QUAL TIPO DE ENDEREÇO VAMOS RECEBER? TRAABLHO, RESIDENCIAL..

    public void adcionaEndereco(Endereco endereco){
        if (endereco == null) {
            throw new NullPointerException("Endereço não pode ser nulo");
        }
        if (endereco.cep1 == null) {
            throw new NullPointerException("CEP não pode ser nulo");
        }
            getEndereço().add(endereco);
    }
    private List<Endereco> enderecos;

    private Endereco getEndereço() {

        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }

        return endereço;
    }
}
