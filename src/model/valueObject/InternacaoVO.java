package model.valueObject;

import java.time.LocalDate;

/**
 * @author Jean Jacques N. Shimwa
 * @created 02-11-2022 - 2:05 PM
 */
public class Internacao {

    private String estado;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private AnimalVO animalVO;
    private BaiaVO baiaVO;

    public Internacao() {
    }

    public Internacao(String estado, LocalDate dataEntrada, LocalDate dataSaida, AnimalVO animalVO, BaiaVO baiaVO) {
        this.estado = estado;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.animalVO = animalVO;
        this.baiaVO = baiaVO;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public AnimalVO getAnimalVO() {
        return animalVO;
    }

    public void setAnimalVO(AnimalVO animalVO) {
        this.animalVO = animalVO;
    }

    public BaiaVO getBaiaVO() {
        return baiaVO;
    }

    public void setBaiaVO(BaiaVO baiaVO) {
        this.baiaVO = baiaVO;
    }
}
