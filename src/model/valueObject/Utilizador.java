package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 26-10-2022 - 2:50 PM
 */
public class Utilizador {
    private Long id;
    private String nomeUtilizador;
    private String password;
    private Long id_funcionario;

    public Utilizador() {
    }

    public Utilizador(Long id, String nomeUtilizador, String password, Long id_funcionario) {
        this.id = id;
        this.nomeUtilizador = nomeUtilizador;
        this.password = password;
        this.id_funcionario = id_funcionario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
}
