package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import java.time.LocalDate;

import java.time.LocalDate;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findByID ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n=== TEST 2: Seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj: list) {
            System.out.println(obj);
        }
        
        System.out.println("\n=== TEST 3: Seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj: list) {
            System.out.println(obj);
        }
        
        System.out.println("\n=== TEST 4: Seller insert ===");
        Seller newSeller = new Seller(null, "jv", "jv@gmail.com", new LocalDate(), 2000.00, department);
    }
}
