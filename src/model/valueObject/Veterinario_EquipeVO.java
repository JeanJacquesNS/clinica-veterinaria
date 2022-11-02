package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 02-11-2022 - 2:47 PM
 */
public class Veterinario_EquipeVO {

    private VeterinarioVO veterinarioVO;
    private EquipeVO equipeVO;

    public Veterinario_EquipeVO() {}

    public Veterinario_EquipeVO(VeterinarioVO veterinarioVO, EquipeVO equipeVO) {
        this.veterinarioVO = veterinarioVO;
        this.equipeVO = equipeVO;
    }

    public VeterinarioVO getVeterinarioVO() {
        return veterinarioVO;
    }

    public void setVeterinarioVO(VeterinarioVO veterinarioVO) {
        this.veterinarioVO = veterinarioVO;
    }

    public EquipeVO getEquipeVO() {
        return equipeVO;
    }

    public void setEquipeVO(EquipeVO equipeVO) {
        this.equipeVO = equipeVO;
    }
}
