package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:46 PM
 */
public class AreaInternacaoVO {
    private Long id_areaInternacao;
    private String designacao;

    public AreaInternacaoVO() {
    }

    public AreaInternacaoVO(Long id_areaInternacao, String designacao) {
        this.id_areaInternacao = id_areaInternacao;
        this.designacao = designacao;
    }

    public Long getId_areaInternacao() {
        return id_areaInternacao;
    }

    public void setId_areaInternacao(Long id_areaInternacao) {
        this.id_areaInternacao = id_areaInternacao;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }
}
