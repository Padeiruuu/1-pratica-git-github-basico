import java.util.ArrayList;

public class Clientes {
    private ArrayList<Cliente> clientes;

    public Clientes() {
        clientes = new ArrayList<Cliente>(); // testar se o this.clientes faz diferença
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public Cliente consultaPorCpf(String cpf) {
        for (int i = 0; i < clientes.size(); i++) { // testar for each aq
            Cliente aux = clientes.get(i);
            if (aux.getCpf().equals(cpf)) {
                return aux;
            }
        }
        return null;
    }

    public int size() {
        return clientes.size();
    }

    public Cliente get(int i) {
        return clientes.get(i);
    }

}
