package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 2:58 PM
 */
public class EnderecoVO {
    private Long id_endereco;
    private PessoaVO pessoaVO;
    private String avenida;
    private String rua;
    private String bairro;

    public EnderecoVO() { }

    public EnderecoVO(Long id_endereco, PessoaVO pessoaVO, String avenida, String rua, String bairro) {
        this.id_endereco = id_endereco;
        this.pessoaVO = pessoaVO;
        this.avenida = avenida;
        this.rua = rua;
        this.bairro = bairro;
    }

    public PessoaVO getPessoaVO() {
        return pessoaVO;
    }

    public void setPessoaVO(PessoaVO pessoaVO) {
        this.pessoaVO = pessoaVO;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Long getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Long id_endereco) {
        this.id_endereco = id_endereco;
    }
}
