package model.dataAccessObject;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Jean Jacques N. Shimwa
 * @created 02-11-2022 - 2:57 PM
 */
public class Conexao {
    protected Connection conexao;

    public Conexao() {
        try {
            this.conexao = DbConexao.getConnection();
        } catch (SQLException | ClassNotFoundException excepcao) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }
}
