import Java.Cliente;

public class GenericDAO<T> implements IGenericDAO<T> {

    @Override
    public Boolean salvar(T entity) {

        return null;
    }

    @Override
    public T buscarPorId(Long id) {

        return null;
    }

    @Override
    public void excluir(Long id) {

    }

    @Override
    public void alterar(T entity) {

    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        return null;
    }
}
