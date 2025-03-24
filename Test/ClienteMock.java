import Java.Cliente;

public class ClienteMock implements IClienteDAO {

    @Override
    public Boolean salvar(Cliente cliente) {
        return true;

    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public Boolean salvar(Boolean retorno) {
        return null;
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }
}
