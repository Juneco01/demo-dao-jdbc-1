/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;



import java.util.Date;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author juneco
 */
public class Program {
    
    public static void main(String[] args){
        
        SellerDao sellerDao = DaoFactory.createSellerDao();
   
        System.out.println("TEST: seller findbyid...........");
        Seller seller = sellerDao.findById(3); 
        System.out.println(seller);
        
        System.out.println("TEST: seller findbydepartment..");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj: list){
            System.out.println(obj);
        }
        
        System.out.println("TEST: seller findall..................");
        List<Seller> list1 = sellerDao.findAll();
        for (Seller obj: list1){
            System.out.println(obj);
        }
        
        /*
        
        System.out.println("TESTE: seller insert..................");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 400.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
        
        System.out.println("TESTE: seller update..................");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);
        System.out.println("Update completed");
        
         System.out.println("TESTE: seller delete..................");
         int id = 7;
         sellerDao.deleteById(id);
         System.out.println("Delete completed");

        */
         

        
        
        
        
    }
    
}
