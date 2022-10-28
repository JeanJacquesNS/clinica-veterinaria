package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:19 PM
 */
public class PessoaVO {
    private Long id_pessoa;
    private String nome;

    public PessoaVO() {
    }

    public PessoaVO(Long id_pessoa, String nome) {
        this.id_pessoa = id_pessoa;
        this.nome = nome;
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

    public void setNome(String nome) {
        this.nome = nome;
    }
}
