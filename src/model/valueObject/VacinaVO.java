package model.valueObject;

import java.time.LocalDate;

/**
 * @author Jean Jacques N. Shimwa
 * @created 02-11-2022 - 2:01 PM
 */
public class VacinaVO {
    private String nome;
    private String validadeEfeito;
    private LocalDate dataVacinacao;

    public VacinaVO() {
    }

    public VacinaVO(String nome, String validadeEfeito, LocalDate dataVacinacao) {
        this.nome = nome;
        this.validadeEfeito = validadeEfeito;
        this.dataVacinacao = dataVacinacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValidadeEfeito() {
        return validadeEfeito;
    }

    public void setValidadeEfeito(String validadeEfeito) {
        this.validadeEfeito = validadeEfeito;
    }

    public LocalDate getDataVacinacao() {
        return dataVacinacao;
    }

    public void setDataVacinacao(LocalDate dataVacinacao) {
        this.dataVacinacao = dataVacinacao;
    }
}
