package model.valueObject;

import java.util.List;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:53 PM
 */
public class AnimalVO {
    private Long id_animal;
    private String nome;
    private String documentoDono;
    private String especie;
    private String sexo;
    private String dataNascimento;
    private List<AlergiaVO> alergiaVOList;

    public AnimalVO() {
    }

    public AnimalVO(Long id_animal, String nome, String documentoDono, String especie, String sexo, String dataNascimento, List<AlergiaVO> alergiaVOList) {
        this.id_animal = id_animal;
        this.nome = nome;
        this.documentoDono = documentoDono;
        this.especie = especie;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.alergiaVOList = alergiaVOList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumentoDono() {
        return documentoDono;
    }

    public void setDocumentoDono(String documentoDono) {
        this.documentoDono = documentoDono;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<AlergiaVO> getAlergiaVOList() {
        return alergiaVOList;
    }

    public void setAlergiaVOList(List<AlergiaVO> alergiaVOList) {
        this.alergiaVOList = alergiaVOList;
    }
}
