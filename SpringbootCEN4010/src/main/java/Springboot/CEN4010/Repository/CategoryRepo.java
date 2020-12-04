package Springboot.CEN4010.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Springboot.CEN4010.model.Category;

public interface CategoryRepo  extends JpaRepository<Category, Long> {

}
