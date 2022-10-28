package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:02 PM
 */
public class VeterinarioVO {
    private Long id_veterinario;
    private String especialidade;
    private FuncionarioVO funcionario;

    public VeterinarioVO() {
    }

    public VeterinarioVO(Long id_veterinario, String especialidade, FuncionarioVO funcionario) {
        this.id_veterinario = id_veterinario;
        this.especialidade = especialidade;
        this.funcionario = funcionario;
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

    public void setFuncionario(FuncionarioVO funcionario) {
        this.funcionario = funcionario;
    }

    public Long getId_veterinario() {
        return id_veterinario;
    }

}
