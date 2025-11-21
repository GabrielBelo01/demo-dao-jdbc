package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TESTE1:  findAll ===");
        List<Department> list = departmentDao.findAll();
        list.forEach(System.out::println);


        System.out.println("=== TESTE2:  findById ===");
        Department obj = departmentDao.findById(4);
        System.out.println(obj);

        System.out.println("=== TESTE3:  findById ===");
        departmentDao.deleteById(6);

        System.out.println("=== TESTE4:  insert ===");
        obj = new Department(null, "Bikes");
        departmentDao.insert(obj);

        System.out.println("=== TESTE5:  update ===");
          obj = departmentDao.findById(1);
        System.out.println(obj);
        obj.setName("Phone");
        departmentDao.update(obj);
        System.out.println("Atualizado com sucesso!");
        System.out.println(obj);


    }
}
