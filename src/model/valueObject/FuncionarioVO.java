package model.valueObject;

import java.math.BigDecimal;

/**
 * @author Jean Jacques N. Shimwa
 * @created 26-10-2022 - 2:51 PM
 */
public class FuncionarioVO {
    private Long id_funcionario;
    private BigDecimal salario;
    private PessoaVO pessoaVO;

    public FuncionarioVO() {}

    public FuncionarioVO(Long id_funcionario, BigDecimal salario) {
        this.id_funcionario = id_funcionario;
        this.salario = salario;
    }

    public Long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
}
