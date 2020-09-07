/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

/**
 *
 * @author juneco
 */
public class Program2 {
    public static void main(String[] args){
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        
        System.out.println("-------- TEST 1: FindAll -------------");
        List<Department> list = new ArrayList<>();
        list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj.toString());
        }
        
        System.out.println("-------- TEST 2: FindById ------------");
        Department obj = new Department();
        obj = departmentDao.findById(2);
        System.out.println(obj.toString());
        
       /*
       System.out.println("-------- TEST 3: Insert  --------------");
       Department obj2 = new Department(null,"Ifood");
       departmentDao.insert(obj2);
       System.out.println(obj2.getId());
      
       
       System.out.println("-------- TEST 4: DeleteById  ------------");
       departmentDao.deleteById(6);
       System.out.println("Deletado com sucesso");
       
       */
       
        System.out.println("-------- TEST 5: UPDATE --------------");
        obj.setName("Ifood");
        departmentDao.update(obj);
        System.out.println("Updated!!!");
        
        
    
    }
}
