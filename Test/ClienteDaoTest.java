import Java.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDaoTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDaoTest() {
        clienteDao = new ClienteMock();
    }


    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(15596402788l);
        cliente.setNome("Raphael");
        cliente.setCidade("Rio de janeiro");
        cliente.setEnd("END");
        cliente.setEstado("rj");
        cliente.setNumero(10);
        cliente.setTel(100000000l);
        clienteDao.salvar(cliente);

    }

    @Test
    public void pesquisarCliente() {

        Cliente clienteConsultado = clienteDao.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvar() {
      Boolean retorno =  clienteDao.salvar(cliente);

      Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());

    }

    @Test
    public void alterarCliente() {
        cliente.setNome("Raphael");
        clienteDao.alterar(cliente);

        Assert.assertEquals("Raphael", cliente.getNome());

    }
}
