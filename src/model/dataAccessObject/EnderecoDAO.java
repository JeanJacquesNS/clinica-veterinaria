package model.dataAccessObject;

import model.valueObject.EnderecoVO;
import model.valueObject.enderecoVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Jean Jacques N. Shimwa
 * @created 02-11-2022 - 3:21 PM
 */
public class EnderecoDAO extends Conexao{

    public EnderecoDAO() {
        super();
    }

    public void inserir(EnderecoVO enderecoVO) {
        String sql = "INSERT INTO endereco(enderecoVO,avenida,rua,bairro)VALUES(?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setLong(1, enderecoVO.getId_endereco());
            preparedStatement.setString(2, enderecoVO.getAvenida());
            preparedStatement.setString(2, enderecoVO.getRua());
            preparedStatement.setString(2, enderecoVO.getBairro());
            preparedStatement.executeQuery();
            preparedStatement.close();

        } catch (SQLException excepcao) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }

    public void actualizar(EnderecoVO enderecoVO) {
        String sql = "UPDATE endereco SET nome=?,enderecoVO=? WHERE id=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, enderecoVO.getNome());
            preparedStatement.setLong(2, enderecoVO.getEnderecoVO().getId_endereco());
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException excepcao) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }

    public void remover(EnderecoVO enderecoVO) {
        String sql = "DELETE FROM endereco WHERE id=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setLong(1, enderecoVO.getId_endereco());
            preparedStatement.executeQuery();
            preparedStatement.close();
        } catch (SQLException excepcao) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }


    public List<EnderecoVO> pegarTodos() {
        String sql = "SELECT * from endereco";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<EnderecoVO> enderecoVOList = new ArrayList<>();

            while (resultSet.next()) {
                EnderecoVO enderecoVO = new EnderecoVO(resultSet.getLong("id_endereco"), resultSet.getString("nome"),
                        resultSet.getString("password"));
                enderecoVOList.add(enderecoVO);
            }
            return enderecoVOList;
        } catch (SQLException excepcao) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, excepcao);
            return new ArrayList<>();
        }
    }

}
