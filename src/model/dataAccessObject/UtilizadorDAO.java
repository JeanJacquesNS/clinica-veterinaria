package model.dataAccessObject;

import model.valueObject.UtilizadorVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Jean Jacques N. Shimwa
 * @created 26-10-2022 - 2:56 PM
 */
public class UtilizadorDAO extends Conexao{

    public UtilizadorDAO() {
       super();
    }

    public void inserir(UtilizadorVO utilizadorVO) {
        String sql = "INSERT INTO utilizador(nome_utilizador,password,id_funcionario)VALUES(?,?,?)";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, utilizadorVO.getNomeUtilizador());
            preparedStatement.setString(2, utilizadorVO.getPassword());
            preparedStatement.setLong(3, utilizadorVO.getId_funcionario());
            preparedStatement.executeQuery();
            preparedStatement.close();

        } catch (SQLException excepcao) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }

    public void actualizar(UtilizadorVO utilizadorVO) {
        String sql = "UPDATE utilizador SET nome_utilizador=?,password=?,id_funcionario=? WHERE id=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, utilizadorVO.getNomeUtilizador());
            preparedStatement.setString(2, utilizadorVO.getPassword());
            preparedStatement.setLong(3, utilizadorVO.getId_funcionario());
            preparedStatement.setLong(4, utilizadorVO.getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException excepcao) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }

    public void remover(UtilizadorVO utilizadorVO) {
        String sql = "DELETE FROM utilizador WHERE id=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setLong(1, utilizadorVO.getId());
            preparedStatement.executeQuery();
            preparedStatement.close();
        } catch (SQLException excepcao) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }

    public Optional<UtilizadorVO> pegarUtilizadorPorNomeUtilizadorEPassword(String nomeUtilizador, String password) {
        String sql = "SELECT * FROM utilizador WHERE nome_utilizador=? and password=? LIMIT 1";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, nomeUtilizador);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            UtilizadorVO utilizadorVO = null;
            while (resultSet.next()) {
                utilizadorVO = new UtilizadorVO(resultSet.getInt("id_utilizador"), resultSet.getString("nome_utilizador"),
                        resultSet.getString("password"), resultSet.getInt("id_funcionario"));
            }
            preparedStatement.close();
            if (Objects.nonNull(utilizadorVO))
                return Optional.of(utilizadorVO);
            else
                return Optional.empty();

        } catch (SQLException excepcao) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, excepcao);

            return Optional.empty();
        }
    }

//    public List<UtilizadorVO> pegarTodos() {
//        String sql = "SELECT * from utilizador";
//        try {
//            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            List<UtilizadorVO> utilizadorVOList = new ArrayList<>();
//
//            while (resultSet.next()) {
//                UtilizadorVO utilizadorVO = new UtilizadorVO(resultSet.getLong("id"), resultSet.getString("nome_utilizador"),
//                        resultSet.getString("password"), resultSet.getLong("id_funcionario"));
//                utilizadorVOList.add(utilizadorVO);
//            }
//            return utilizadorVOList;
//        } catch (SQLException excepcao) {
//            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, excepcao);
//            return new ArrayList<>();
//        }
//    }
}
