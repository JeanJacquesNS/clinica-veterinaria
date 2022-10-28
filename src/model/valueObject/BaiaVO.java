package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:51 PM
 */
public class BaiaVO {
    private Long id_baia;
    private Integer numero;
    private String estado;
    private SectorVO sectorVO;

    public BaiaVO() {
    }

    public BaiaVO(Long id_baia, Integer numero, String estado, SectorVO sectorVO) {
        this.id_baia = id_baia;
        this.numero = numero;
        this.estado = estado;
        this.sectorVO = sectorVO;
    }

    public Long getId_baia() {
        return id_baia;
    }

    public void setId_baia(Long id_baia) {
        this.id_baia = id_baia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public SectorVO getSectorVO() {
        return sectorVO;
    }

    public void setSectorVO(SectorVO sectorVO) {
        this.sectorVO = sectorVO;
    }
}
