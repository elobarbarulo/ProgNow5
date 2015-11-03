package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import FUNCTIONS.functions;
import DAO.ConexaoNew;
import javax.swing.JOptionPane;

public class DQuery {
    
ConexaoNew conexao = new ConexaoNew();
    /***************************************************************************
     * Consulta do banco de dados
     * @param tabela
     * @param campos
     * @param condicao
     * @return 
    ***************************************************************************/
    public ResultSet consulta(String tabela, String campos,String condicao) throws SQLException, ClassNotFoundException{
       String retorno = "";
       String consulta = "";
       String cond = "";
       String camp = "";
       
        if("".equals(tabela) || null == tabela){
            retorno = "Informe a tabela a ser consultada";
        }else{
            if("".equals(campos) || null == campos){
                camp = " * ";
            }else{
                camp = campos;
            }   
            
            if("".equals(condicao) || null == condicao){
               cond = " ";
            }else{
               cond = " WHERE " + condicao ;
            }   
            retorno =  "SELECT " + camp + " FROM " + tabela + cond;
            //JOptionPane.showConfirmDialog(null,retorno);
        }
        
        conexao.conexao();        
        conexao.stn = conexao.conn.createStatement();//prepara
        conexao.rs = conexao.stn.executeQuery(retorno);//executa 
        return conexao.rs;// retono o retono completo
        
    }
    
     /**************************************************************************
     * insert  banco de dados
     * @param tabela
     * @param campos
    ***************************************************************************/
    public boolean insert(String tabela, String[] campos) throws SQLException, ClassNotFoundException{
        
        //DECLARA AS VARIAVEIS
        String retorno = "";
        boolean resp;
        String val = "";
        String modificada;
        
        //INSTANCIA FUNCÂO PADRÂO
        functions func = new functions();
        
        ///MONTA SQL PRONTA
        retorno +=" INSERT INTO " + tabela + " VALUES (";
        
        //PERCORRE TODOS OS CAMPOS VE O QUE È INT OU STRING E PREPARA O INSERT        
        for (String  campo : campos){
            resp = func.isNumeroRegexp(campo);
            if(false == resp){
             val += "'" + campo + "',";
            }else{
              val +=campo + ",";
            }
        }
       //RETIRA o ULTIMO CARACTER
       modificada = val.substring(0, val.length() - 1); 
       retorno += modificada +=")";
       //return retorno;
       
        conexao.conexao();//abre a conexao
        conexao.stn = conexao.conn.createStatement();//prepara
        conexao.rs = conexao.stn.executeQuery(retorno);//executa 
        conexao.rs;// retono o retono completo
        return true;
        
    } 
    
    
    
    public void deletar(String tabela, String condicao) throws SQLException, ClassNotFoundException{
        String SQL = "DELETE FROM " + tabela + " WHERE " + condicao; 
        conexao.conexao();//abre a conexao
        conexao.stn = conexao.conn.createStatement();//prepara
        conexao.rs = conexao.stn.executeQuery(SQL);//executa 
        //conexao.rs;// retono o retono completo
    }
}

