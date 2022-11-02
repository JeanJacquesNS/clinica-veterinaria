package model.valueObject;

import java.time.LocalDate;

/**
 * @author Jean Jacques N. Shimwa
 * @created 02-11-2022 - 2:13 PM
 */
public class TratamentoVO {

    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private EquipeVO equipeVO;
    private AnimalVO animalVO;

    public TratamentoVO() {}

    public TratamentoVO(String descricao, LocalDate dataInicio, LocalDate dataFim, EquipeVO equipeVO, AnimalVO animalVO) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.equipeVO = equipeVO;
        this.animalVO = animalVO;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public EquipeVO getEquipeVO() {
        return equipeVO;
    }

    public void setEquipeVO(EquipeVO equipeVO) {
        this.equipeVO = equipeVO;
    }

    public AnimalVO getAnimalVO() {
        return animalVO;
    }

    public void setAnimalVO(AnimalVO animalVO) {
        this.animalVO = animalVO;
    }
}
