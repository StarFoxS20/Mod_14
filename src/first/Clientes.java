package first;

import java.util.Objects;

public class Clientes
{
    private String nome;
    private Long cpf;
    private Long tel;
    private String end;
    private Integer num;
    private String cidade;
    private String estado;

    public Clientes(String nome,String cpf,String tel,String end,String num,String cidade,String estado)
    {
        this.nome = nome;
        this.cpf = Long.valueOf(cpf.trim());
        this.tel = Long.valueOf(tel.trim());
        this.end = end;
        this.num = Integer.valueOf(num.trim());
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNum() {
        return String.valueOf(num);
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getTel() {
        return String.valueOf(tel);
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clientes clientes = (Clientes) o;
        return Objects.equals(cpf, clientes.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "first.Clientes{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';




    }
}
