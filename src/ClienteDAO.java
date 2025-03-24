import Java.Cliente;

public  class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {


    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Boolean salvar(Boolean retorno) {
        return null;
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }
}
