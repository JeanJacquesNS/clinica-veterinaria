package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 26-10-2022 - 2:51 PM
 */
public class Funcionario {
    private Long id;

    public Funcionario(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
