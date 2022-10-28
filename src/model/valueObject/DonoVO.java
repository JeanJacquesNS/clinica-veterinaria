package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:13 PM
 */
public class DonoVO {
    private Long id_dono;
    private PessoaVO id_pessoaVO;

    public DonoVO() {
    }

    public DonoVO(Long id_dono, PessoaVO id_pessoaVO) {
        this.id_dono = id_dono;
        this.id_pessoaVO = id_pessoaVO;
    }

    public Long getId_dono() {
        return id_dono;
    }

    public void setId_dono(Long id_dono) {
        this.id_dono = id_dono;
    }

    public PessoaVO getId_pessoaVO() {
        return id_pessoaVO;
    }

    public void setId_pessoaVO(PessoaVO id_pessoaVO) {
        this.id_pessoaVO = id_pessoaVO;
    }
}
