package dao;

import first.Clientes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDao implements IClientesDAO
{

    private Map<Long, Clientes> map;


    public ClienteMapDao()
    {
        this.map = new HashMap<>();
    }


    @Override
    public Boolean cadastrar(Clientes cliente)
    {
        if (this.map.containsKey(cliente.getCpf()))
        {
            return false;
        }
        this.map.put(cliente.getCpf(),cliente);
        return null;
    }

    @Override
    public void excluir(Long cpf)
    {
        Clientes clientesCadastrado = this.map.get(cpf);

        if(clientesCadastrado != null)
        {
            this.map.remove(clientesCadastrado.getCpf(),clientesCadastrado);
        }
    }

    @Override
    public void alterar(Clientes clientes)
    {
        Clientes clientesCadastrado = this.map.get(clientes.getCpf());
        if (clientesCadastrado != null);
        clientesCadastrado.setNome(clientes.getNome());
        clientesCadastrado.setNome(clientes.getCidade());
        clientesCadastrado.setNome(clientes.getEnd());
        clientesCadastrado.setNome(clientes.getEstado());
        clientesCadastrado.setNome(clientes.getTel());
        clientesCadastrado.setNome(clientes.getNum());
    }

    @Override
    public Clientes consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Clientes> buscarTodos() {
        return this.map.values();
    }

}
