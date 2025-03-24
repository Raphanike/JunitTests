import Java.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDaoTest2 {

    private IClienteDAO clienteDao;
    private Cliente cliente;

    public ClienteDaoTest2() {
        clienteDao = new ClienteDAO(); // Aqui estamos utilizando a implementação genérica
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(15596402788L);
        cliente.setNome("Raphael");
        cliente.setCidade("Rio de Janeiro");
        cliente.setEnd("END");
        cliente.setEstado("RJ");
        cliente.setNumero(10);
        cliente.setTel(100000000L);
        clienteDao.salvar(cliente);
    }

    @Test
    public void pesquisarCliente2() {
        Cliente clienteConsultado = clienteDao.buscarPorCpf(cliente.getCpf());
        Assert.assertNull(clienteConsultado);

    }

    @Test
    public void salvar() {
        Boolean retorno = clienteDao.salvar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() {
        cliente.setNome("Raphael Silva");
        clienteDao.alterar(cliente);
        Assert.assertEquals("Raphael Silva", cliente.getNome());
    }
}
