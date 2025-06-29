package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

//        System.out.println("==== TEST 1: seller findById =====");
//        Seller seller = sellerDao.findById(5);
//        System.out.println(seller);
//
//
//        System.out.println("\n==== TEST 2: seller findByDepartment =====");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        for (Seller obj : list)
//            System.out.println(obj);
//
//        System.out.println("\n==== TEST 3: seller findAll =====");
//        list = sellerDao.findAll();
//        for (Seller obj : list) {
//            System.out.println(obj);
//        }
//
//        System.out.println("\n==== TEST 4: seller insert =====");
//        Seller newSeller = new Seller(null, "gab", "gab@gmail.com", new Date(), 4000.00, department);
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted New Id: " + newSeller.getId());
//
//        System.out.println("\n==== TEST 5: seller update =====");
//        seller = sellerDao.findById(5);
//        seller.setName("Low profile");
//        System.out.println("Updated completed! ");

        System.out.println("\n==== TEST 6: seller deleteById =====");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Id: " + id + " Deleted with success! Congrats my friend.");

        sc.close();
    }

}
