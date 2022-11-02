package model.valueObject;

import java.time.LocalDate;

/**
 * @author Jean Jacques N. Shimwa
 * @created 02-11-2022 - 2:27 PM
 */
public class ExameVO {

    private String nome;
    private LocalDate data;
    private String resultado;
    private AnimalVO animalVO;
    private VeterinarioVO veterinarioVO;

    public ExameVO() {
    }

    public ExameVO(String nome, LocalDate data, String resultado, AnimalVO animalVO, VeterinarioVO veterinarioVO) {
        this.nome = nome;
        this.data = data;
        this.resultado = resultado;
        this.animalVO = animalVO;
        this.veterinarioVO = veterinarioVO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public AnimalVO getAnimalVO() {
        return animalVO;
    }

    public void setAnimalVO(AnimalVO animalVO) {
        this.animalVO = animalVO;
    }

    public VeterinarioVO getVeterinarioVO() {
        return veterinarioVO;
    }

    public void setVeterinarioVO(VeterinarioVO veterinarioVO) {
        this.veterinarioVO = veterinarioVO;
    }
}
