package com.jgmedellin.spring_data_jpa_rest.dao;

import com.jgmedellin.spring_data_jpa_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Spring Data JPA provides a powerful way to work with data. It is a part of the
// Spring Data project and makes it easy to use JPA in Spring applications.
// This interface extends JpaRepository which provides CRUD methods
// out of the box (no need to write any code).
// Spring Data JPA will provide the implementation at runtime.
// The JpaRepository interface takes two parameters: the entity type and
// the primary key type. In this example, the entity type is Employee and
// the primary key type is Integer in our database.

// The @RepositoryRestResource annotation is used to customize the REST endpoint.
// By default, the endpoint is the entity name in lowercase (employee).
// We can change it to something else by providing a path attribute.
// In this example, the endpoint is changed from /employees to /members.
//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
