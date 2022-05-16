package central;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.jws.WebParam;

public class GereBD {
    
    
    public GereBD()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GereBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public Boolean inserirDados(String tipo, String nomeEscuta, String nomeCeluda, String dados)
    {
        try {
            Connection ligacao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/"
                    + "Escutas?user=sd&password=123456");
        
            Statement stmt = ligacao.createStatement();
            
            String query ="INSERT INTO Escuta (tipo, nomeEscuta, nomeCeluda, dados) VALUES"
                    + " ('"+tipo+"','"+nomeEscuta+"','"+nomeCeluda+"','"+dados+"')";
            
            Boolean resultado = stmt.execute(query);
            
            if(resultado == false)
                return true;
            
        
        } catch (SQLException ex) {
            Logger.getLogger(GereBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return false;
    }

}
