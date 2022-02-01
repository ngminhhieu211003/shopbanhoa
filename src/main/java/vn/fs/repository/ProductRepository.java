package vn.fs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import vn.fs.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	// List Sản phẩm by danh mục
	@Query(value = "SELECT * FROM products WHERE category_id = ?", nativeQuery = true)
	public List<Product> listProductByCategory(Long categoryId);

	// Top 10 product by category
	@Query(value = "SELECT * FROM products AS b WHERE b.category_id = ?;", nativeQuery = true)
	List<Product> listProductByCategory10(Long categoryId);

}
