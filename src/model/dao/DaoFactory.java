package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    // Macete para realizar uma instância sem mostrar a implementação no programa
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
