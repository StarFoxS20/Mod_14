package first;

import  javax.swing.*;

import dao.ClienteMapDao;
import dao.IClientesDAO;
import first.Clientes;



public class app {

    private static IClientesDAO iClientesDAO;

    public static void main(String args[]) 
    {
        iClientesDAO = new ClienteMapDao();
        String opcao = JOptionPane.showInputDialog
                (
                null,
                "1-cadastro  2-consultar  3-excluir  4-alterar  5-sair",
                "|-----------------------------|MENU|-----------------------------|",
                JOptionPane.INFORMATION_MESSAGE
                );

        while (isOpcaoValida(opcao))
        {
            if("".equals(opcao))
            {
                sair();
            }else if (isCadastro(opcao))
            {String dados = JOptionPane.showInputDialog
            (null,"Digite os dados do Cliente separados por virgula","CADASTRO",JOptionPane.INFORMATION_MESSAGE);cadastrar(dados);

            }else if (isConsultar(opcao))
            {String dados = JOptionPane.showInputDialog
            (null,"Digite o CPF","CONSULTAR",JOptionPane.INFORMATION_MESSAGE);cadastrar(dados);
            consultar(dados);
            }

        opcao = JOptionPane.showInputDialog
                    (
                            null,
                            "1-cadastro  2-consultar  3-excluir  4-alterar  5-sair",
                            "|-----------------------------|MENU|-----------------------------|",
                            JOptionPane.INFORMATION_MESSAGE
                    );

        }

    }

    private static void consultar(String dados)
    {
        Clientes clientes =  iClientesDAO.consultar(Long.parseLong(dados));
        if (clientes != null) {
        JOptionPane.showMessageDialog(null,"Cliente encontrado: " + clientes.toString(),"CONSULTA",JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "CONSULTA", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao))
        {
            return true;
        }
            return  false;
    }

    private static void cadastrar(String dados)
    {
        String[] dadosSeparados = dados.split(",");
        Clientes clientes = new Clientes(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iClientesDAO.cadastrar(clientes);
        if (isCadastrado)
        {
            JOptionPane.showMessageDialog(null,"Cliente Cadrastado Com Sucesso","SUCESSO",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Cliente Já Cadrastado","OOOOPS",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao)
    {
        if ("1".equals(opcao))
        {
            return true;
        }
            return false;
    }

    private static void sair() {
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao))
        {
            return true;
        }
        return false;
    }
    
    private static boolean isOpcaoCadastro(String opcao)
    {
        if ("1".equals(opcao))
        {
            return true;
        }
        return false;
    }
    
}
