package model.dataAccessObject;

import model.valueObject.PessoaVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Jean Jacques N. Shimwa
 * @created 02-11-2022 - 2:55 PM
 */
public class PessoaDAO extends Conexao{

    public void inserir(PessoaVO pessoaVO) {
        String sql = "INSERT INTO pessoa(nome,enderecoVO,bi)VALUES(?,?,?)";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, pessoaVO.getNome());
            preparedStatement.setLong(2, pessoaVO.getId_pessoa());
            preparedStatement.setString(3, pessoaVO.getBi());
            preparedStatement.executeQuery();
            preparedStatement.close();

        } catch (SQLException excepcao) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }

    public void actualizar(PessoaVO pessoaVO) {
        String sql = "UPDATE pessoa SET nome=?,enderecoVO=?,bi=? WHERE id=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, pessoaVO.getNome());
            preparedStatement.setLong(2, pessoaVO.getEnderecoVO().getId_endereco());
            preparedStatement.setString(3, pessoaVO.getBi());
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException excepcao) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }

    public void remover(PessoaVO pessoaVO) {
        String sql = "DELETE FROM pessoa WHERE id=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setLong(1, pessoaVO.getId_pessoa());
            preparedStatement.executeQuery();
            preparedStatement.close();
        } catch (SQLException excepcao) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }

    public List<PessoaVO> pegarTodos() {
        String sql = "SELECT * from pessoa";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<PessoaVO> pessoaVOList = new ArrayList<>();

            while (resultSet.next()) {
//                PessoaVO pessoaVO = new PessoaVO(resultSet.getLong("id_pessoa"), resultSet.getString("nome"),
//                        resultSet.getString("password"), bi);
//                pessoaVOList.add(pessoaVO);
            }
            return pessoaVOList;
        } catch (SQLException excepcao) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, excepcao);
            return new ArrayList<>();
        }
    }

    public PessoaVO pegarPessoa(Long id_pessoa){
        String sql = "SELECT * from pessoa where id_pessoa=? limit 1";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
//            preparedStatement.setString(1, id_pessoa);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            List<PessoaVO> pessoaVOList = new ArrayList<>();
//
//            while (resultSet.next()) {
//                PessoaVO pessoaVO = new PessoaVO(resultSet.getLong("id_pessoa"), resultSet.getString("nome"),
//                        resultSet.getString("password"), bi);
//            }
            return null;
        } catch (SQLException excepcao) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, excepcao);
            return null;
        }
    }
}
