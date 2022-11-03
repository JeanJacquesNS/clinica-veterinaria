package controller;

import model.dataAccessObject.UtilizadorDAO;
import model.valueObject.UtilizadorVO;

import java.util.Optional;

/**
 * @author Jean Jacques N. Shimwa
 * @created 03-11-2022 - 3:11 PM
 */
public class UtilizadorController {
    UtilizadorDAO utilizadorDAO;

    public UtilizadorController() {
        this.utilizadorDAO = new UtilizadorDAO();
    }
    public Boolean confere(String nomeUtilizador,String password){
        Optional<UtilizadorVO> utilizadorVOOptional = utilizadorDAO.pegarUtilizadorPorNomeUtilizadorEPassword(nomeUtilizador, password);
       if (utilizadorVOOptional.isPresent())
           return Boolean.TRUE;

       return Boolean.FALSE;
    }

}
