package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:00 PM
 */
public class TelefoneVO {
    private Long id_funcionario;
    private String telefone;

    public TelefoneVO() { }

    public TelefoneVO(Long id_funcionario, String telefone) {
        this.id_funcionario = id_funcionario;
        this.telefone = telefone;
    }

    public Long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
