package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Department d1 = new Department(1, "Books");

        LocalDate date = LocalDate.now();
        Seller s1 = new Seller(3, "Jv", "Jv@gmail.com", date, 3000.00, d1);

        SellerDao var_sellerdao = DaoFactory.createSellerDao();

        System.out.println(d1);
        System.out.println(s1);
    }
}
