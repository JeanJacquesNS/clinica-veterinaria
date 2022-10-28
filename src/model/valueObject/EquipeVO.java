package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:40 PM
 */
public class EquipeVO {
    private Long id_equipe;
    private String nome;
    private AreaInternacaoVO areaInternacaoVO;

    public EquipeVO() {
    }

    public EquipeVO(Long id_equipe, String nome, AreaInternacaoVO areaInternacaoVO) {
        this.id_equipe = id_equipe;
        this.nome = nome;
        this.areaInternacaoVO = areaInternacaoVO;
    }

    public Long getId_equipe() {
        return id_equipe;
    }

    public void setId_equipe(Long id_equipe) {
        this.id_equipe = id_equipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AreaInternacaoVO getAreaInternacaoVO() {
        return areaInternacaoVO;
    }

    public void setAreaInternacaoVO(AreaInternacaoVO areaInternacaoVO) {
        this.areaInternacaoVO = areaInternacaoVO;
    }
}
