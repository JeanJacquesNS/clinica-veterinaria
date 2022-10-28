package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:50 PM
 */
public class SectorVO {
    private Long id_sector;
    private String designacao;

    public SectorVO() {
    }

    public SectorVO(Long id_sector, String designacao) {
        this.id_sector = id_sector;
        this.designacao = designacao;
    }

    public Long getId_sector() {
        return id_sector;
    }

    public void setId_sector(Long id_sector) {
        this.id_sector = id_sector;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }
}
