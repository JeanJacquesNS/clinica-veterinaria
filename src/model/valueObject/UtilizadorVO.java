package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 26-10-2022 - 2:50 PM
 */
public class UtilizadorVO {
    private Integer id;
    private String nomeUtilizador;
    private String password;
    private Integer id_funcionario;

    public UtilizadorVO() {
    }

    public UtilizadorVO(Integer id, String nomeUtilizador, String password, Integer id_funcionario) {
        this.id = id;
        this.nomeUtilizador = nomeUtilizador;
        this.password = password;
        this.id_funcionario = id_funcionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeUtilizador() {
        return nomeUtilizador;
    }

    public void setNomeUtilizador(String nomeUtilizador) {
        this.nomeUtilizador = nomeUtilizador;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Integer id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
}
