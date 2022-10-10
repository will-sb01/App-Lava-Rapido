package DAO;

import DTO.LavaRapidoDTO;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LavaRapidoDAO {
        Connection conn;
    
    public void registrarLavagem(LavaRapidoDTO objLR){
        String sql = "insert into lava(marca, modelo, cor, cliente, tipo, data_lavagem, valor) values(?,?,?,?,?,?,?)";
        ConexaoBD_DAO conexao =  new ConexaoBD_DAO();
        conn = conexao.conectaBD();
        
            try {
                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setString(1, objLR.getMarca());
                pstm.setString(2, objLR.getModelo());
                pstm.setString(3, objLR.getCor());
                pstm.setString(4, objLR.getCliente());
                pstm.setString(5, objLR.getTipo());
                pstm.setString(6, objLR.getPeriodo());
                pstm.setString(7, objLR.getValor());
                
                pstm.execute();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "LavaRapidoDAO - registrarLavagem"+ex);
            }
    }
    public List<LavaRapidoDTO> read(){
        ConexaoBD_DAO conexao2 =  new ConexaoBD_DAO();
        conn = conexao2.conectaBD();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<LavaRapidoDTO> lavagens = new ArrayList<LavaRapidoDTO>();
        
            try {
                stmt = conn.prepareStatement("select * from lava");
                rs = stmt.executeQuery();
                while(rs.next()){
                    LavaRapidoDTO obj = new LavaRapidoDTO();
                    obj.setMarca(rs.getString("marca"));
                    obj.setModelo(rs.getString("modelo"));
                    obj.setCor(rs.getString("cor"));
                    obj.setCliente(rs.getString("cliente"));
                    obj.setTipo(rs.getString("tipo"));
                    obj.setPeriodo(rs.getString("data_lavagem"));
                    obj.setValor(rs.getString("valor"));
                    lavagens.add(obj);
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "LavaRapidoDAO - List<LavaRapidoDTO>"+ex);
            }
        return lavagens;
    }
}
