package org.example.repository;

import org.example.domain.Department;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository extends Repository{

    public List<Department> findAll() {
        try {
            DepartmentMapper departmentMapper = new DepartmentMapper();
            createConnection();

            List<Department> departmentList = new ArrayList<>();

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM skyrius");
            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                Department department = departmentMapper.fromResultSet(result);
                departmentList.add(department);
            }

            return departmentList;
        } catch (SQLException e) {
            throw new RuntimeException("Unable to connect to db!");
        }
    }
}
