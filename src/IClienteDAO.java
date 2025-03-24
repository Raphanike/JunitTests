import Java.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente> {

     Boolean salvar(Boolean retorno);

    Cliente buscarPorCpf(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);
}
