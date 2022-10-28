package model.valueObject;

/**
 * @author Jean Jacques N. Shimwa
 * @created 28-10-2022 - 3:12 PM
 */
public class RecepcionistaVO {
    private Long id_recepcionista;
    private Long id_funcionario;

    public RecepcionistaVO() {
    }

    public RecepcionistaVO(Long id_recepcionista, Long id_funcionario) {
        this.id_recepcionista = id_recepcionista;
        this.id_funcionario = id_funcionario;
    }

    public Long getId_recepcionista() {
        return id_recepcionista;
    }

    public void setId_recepcionista(Long id_recepcionista) {
        this.id_recepcionista = id_recepcionista;
    }

    public Long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
}
