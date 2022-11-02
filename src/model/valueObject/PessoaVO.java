package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:19 PM
 */
public class PessoaVO {
    private Long id_pessoa;
    private String nome;
    private EnderecoVO enderecoVO;
    private String bi;

    public PessoaVO() {
    }

    public PessoaVO(Long id_pessoa, String nome, EnderecoVO enderecoVO, String bi) {
        this.id_pessoa = id_pessoa;
        this.nome = nome;
        this.enderecoVO = enderecoVO;
        this.bi = bi;
    }

    public Long getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(Long id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public EnderecoVO getEnderecoVO() {
        return enderecoVO;
    }

    public void setEnderecoVO(EnderecoVO enderecoVO) {
        this.enderecoVO = enderecoVO;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }
}
