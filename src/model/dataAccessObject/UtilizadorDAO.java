package model.dataAccessObject;

import com.sun.nio.sctp.MessageInfo;
import model.valueObject.Utilizador;

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
public class UtilizadorDAO {
    private Connection conexao;

    public UtilizadorDAO() {
        try {
            this.conexao = DbConexao.getConnection();
        } catch (SQLException | ClassNotFoundException excepcao) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }

    public void inserir(Utilizador utilizador) {
        String sql = "INSERT INTO utilizador(nome_utilizador,password,id_funcionario)VALUES(?,?,?)";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, utilizador.getNomeUtilizador());
            preparedStatement.setString(2, utilizador.getPassword());
            preparedStatement.setLong(3, utilizador.getId_funcionario());
            preparedStatement.executeQuery();
            preparedStatement.close();

        } catch (SQLException excepcao) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }

    public void actualizar(Utilizador utilizador) {
        String sql = "UPDATE utilizador SET nome_utilizador=?,password=?,id_funcionario=? WHERE id=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, utilizador.getNomeUtilizador());
            preparedStatement.setString(2, utilizador.getPassword());
            preparedStatement.setLong(3, utilizador.getId_funcionario());
            preparedStatement.setLong(4, utilizador.getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException excepcao) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }

    public void remover(Utilizador utilizador) {
        String sql = "DELETE FROM utilizador WHERE id=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setLong(1, utilizador.getId());
            preparedStatement.executeQuery();
            preparedStatement.close();
        } catch (SQLException excepcao) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, excepcao);
        }
    }

    public Optional<Utilizador> pegarUtilizadorPorNomeUtilizadorEPassword(String nomeUtilizador, String password) {
        String sql = "SELECT * FROM utilizador WHERE nome_utilizador=? and password=? LIMIT 1";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, nomeUtilizador);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            Utilizador utilizador = null;
            while (resultSet.next()) {
                utilizador = new Utilizador(resultSet.getLong("id"), resultSet.getString("nome_utilizador"),
                        resultSet.getString("password"), resultSet.getLong("id_funcionario"));
            }
            preparedStatement.close();
            if (Objects.nonNull(utilizador))
                return Optional.of(utilizador);
            else
                return Optional.empty();

        } catch (SQLException excepcao) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, excepcao);

            return Optional.empty();
        }
    }

    public List<Utilizador> pegarTodos() {
        String sql = "SELECT * from utilizador";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Utilizador> utilizadorList = new ArrayList<>();

            while (resultSet.next()) {
                Utilizador utilizador = new Utilizador(resultSet.getLong("id"), resultSet.getString("nome_utilizador"),
                        resultSet.getString("password"), resultSet.getLong("id_funcionario"));
                utilizadorList.add(utilizador);
            }
            return utilizadorList;
        } catch (SQLException excepcao) {
            Logger.getLogger(UtilizadorDAO.class.getName()).log(Level.SEVERE, null, excepcao);
            return new ArrayList<>();
        }
    }
}
