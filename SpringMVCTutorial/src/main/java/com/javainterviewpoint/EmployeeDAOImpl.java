package com.javainterviewpoint;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO
{

    private JdbcTemplate jdbcTemplate;
    // JdbcTemplate setter
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Saving a new Employee
    @Override
    public void saveEmployee(Employee employee)
    {
        String sql = "INSERT INTO Employee VALUES(?,?,?,?)";
        System.out.println("dao called");
        jdbcTemplate.update(sql, new Object[]
        { employee.getId(), employee.getName(), employee.getDept(), employee.getAge() });
        
    }

    // Getting a particular Employee
    @Override
    public Employee getEmployeeById(int id)
    {
        String sql = "SELECT * FROM Employee WHERE id=?";
        Employee employee = (Employee) jdbcTemplate.queryForObject(sql, new Object[]
        { id }, new RowMapper<Employee>()
        {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException 
            {
                Employee employee = new Employee();
                employee.setId(rs.getInt(1));
                employee.setName(rs.getString(2));
                employee.setDept(rs.getString(3));
                employee.setAge(rs.getInt(4));
                return employee;
            }
        });
        return employee;
    }

    // Getting all the Employees
    @Override
    public List<Employee> getAllEmployees()
    {
        String sql = "SELECT * FROM Employee";

        List<Employee> employeeList = jdbcTemplate.query(sql, new ResultSetExtractor<List<Employee>>()
        {
            @Override
            public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException
            {
                List<Employee> list = new ArrayList<Employee>();
                while (rs.next())
                {
                    Employee employee = new Employee();
                    employee.setId(rs.getInt(1));
                    employee.setName(rs.getString(2));
                    employee.setDept(rs.getString(3));
                    employee.setAge(rs.getInt(4));
                    list.add(employee);
                }
                return list;
            }

        });
        return employeeList;
    }

    // Updating a particular Employee
    @Override
    public void updateEmployee(Employee employee)
    {
        String sql = "UPDATE Employee SET age =?, dept=?, name=? where id=?";
        jdbcTemplate.update(sql, new Object[]
        { employee.getAge(), employee.getDept(), employee.getName(), employee.getId() });
    }

    // Deletion of a particular Employee
    @Override
    public void deleteEmployee(int id)
    {
        String sql = "DELETE FROM Employee WHERE id=?";
        jdbcTemplate.update(sql, new Object[]
        { id });
    }
}
