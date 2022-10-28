package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:02 PM
 */
public class VeterinarioVO{
    private Long id_veterinario;
    private String especialidade;
    private Long id_funcionario;

    public VeterinarioVO() { }

    public VeterinarioVO(Long id_veterinario, String especialidade, Long id_funcionario) {
        this.id_veterinario = id_veterinario;
        this.especialidade = especialidade;
        this.id_funcionario = id_funcionario;
    }

    public Long getId_veterinario() {
        return id_veterinario;
    }

    public void setId_veterinario(Long id_veterinario) {
        this.id_veterinario = id_veterinario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
}
