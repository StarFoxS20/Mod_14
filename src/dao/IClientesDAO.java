package dao;

import first.Clientes;

import java.util.Collection;
import java.util.Collections;

public interface IClientesDAO {

    public Boolean cadastrar(Clientes cliente);
    public void excluir(Long cpf);
    public void alterar(Clientes clientes);
    public Clientes consultar(Long cpf);
    public Collection<Clientes> buscarTodos();


}
