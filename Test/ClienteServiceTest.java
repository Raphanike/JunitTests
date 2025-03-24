import Java.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteMock();
        clienteService = new ClienteService(dao);
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
        clienteService.salvar(cliente);

    }


    @Test
    public void pesquisarCliente() {

        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());

    }
    @Test
    public void salvar() {
        clienteService.salvar(cliente);

    }

}
