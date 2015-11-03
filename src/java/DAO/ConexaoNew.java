package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoNew {

    //informações da conexao
    public Statement stn;//responsavel por preparar e realizar pesquisas
    public ResultSet rs; // Armazena os resultados do banco
    public Connection conn; // responsavel por realizar conexão
    
    // dados para a conexao
    //private String drive = "oracle.jdbc.driver.OracleDriver";
    //private String caminho = "jdbc:oracle:thin:@localhost:1521:xe";
    //private String usuario = "SYSTEM";
    //private String senha = "vinicius4651";    
    
    //private String drive = "com.mysql.jdbc.Driver";
    //private String caminho = "jdbc:mysql://localhost/shama";
    //private String usuario = "root";
    //private String senha = "";
    /**
     * *****************************************************
     * Consulta a conexao com o banco de dados
    *******************************************************
     * @throws java.lang.ClassNotFoundException
     */
    public void  conexao() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/prognow","root","");
        } catch (SQLException ex) {
            //Logger.getLogger(ConexaoNew.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * *****************************************************
     * Desconecta do banco de dados
    *******************************************************
     */
    public void desconecta() {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Conexao! \n Erro:" + ex.getLocalizedMessage());//caixa de mensagem
        }
    }

    /**
     *
     * @param sql
     * @throws SQLException
     */
    public void executaSQL(String sql) throws SQLException {
        try {
            stn = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stn.executeQuery(sql);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro SQL! \n " + ex);
        }

    }
}
