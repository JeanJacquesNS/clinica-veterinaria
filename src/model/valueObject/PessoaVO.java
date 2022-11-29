package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:19 PM
 */
public class PessoaVO {
    private Long id_pessoa;
    private String nome;
    private String tipoDocumento;
    private String nrDocumento;
    private String bairro;
    private String avenida;
    private String rua;

    public PessoaVO() {
    }

    public PessoaVO(String nome, String tipoDocumento, String nrDocumento, String bairro, String avenida, String rua) {
        this.nome = nome;
        this.tipoDocumento = tipoDocumento;
        this.nrDocumento = nrDocumento;
        this.bairro = bairro;
        this.avenida = avenida;
        this.rua = rua;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNrDocumento() {
        return nrDocumento;
    }

    public void setNrDocumento(String nrDocumento) {
        this.nrDocumento = nrDocumento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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
}
