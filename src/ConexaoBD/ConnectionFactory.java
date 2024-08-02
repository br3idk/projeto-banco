package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        try {                                 //nome do banco                   usuario, senha
            return DriverManager.getConnection("jdbc:mysql://localhost/db_Banco","root","C0st@1108");
        }
        
        catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
        
    }
    
    
}
