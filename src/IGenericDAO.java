import Java.Cliente;

public interface IGenericDAO<T> {
    Boolean salvar(T entity);

    T buscarPorId(Long id);

    void excluir(Long id);

    void alterar(T entity);

    public Cliente buscarPorCpf(Long cpf);
}
