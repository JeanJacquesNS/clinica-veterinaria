package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:00 PM
 */
public class TelefoneVO {
    private PessoaVO pessoaVO;
    private String telefone;

    public TelefoneVO() { }

    public TelefoneVO(PessoaVO pessoaVO, String telefone) {
        this.pessoaVO = pessoaVO;
        this.telefone = telefone;
    }

    public PessoaVO getPessoaVO() {
        return pessoaVO;
    }

    public void setPessoaVO(PessoaVO pessoaVO) {
        this.pessoaVO = pessoaVO;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
