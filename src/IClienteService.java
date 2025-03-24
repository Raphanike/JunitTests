import Java.Cliente;

public interface  IClienteService {
    void salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);


    void excluir(Long cpf);
}
