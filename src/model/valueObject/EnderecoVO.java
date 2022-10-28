package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 2:58 PM
 */
public class EnderecoVO {
    private Long id_funcionario;
    private String avenida;
    private String rua;
    private String bairro;

    public EnderecoVO() { }

    public EnderecoVO(Long id_funcionario, String avenida, String rua, String bairro) {
        this.id_funcionario = id_funcionario;
        this.avenida = avenida;
        this.rua = rua;
        this.bairro = bairro;
    }

    public Long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Long id_funcionario) {
        this.id_funcionario = id_funcionario;
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
}
