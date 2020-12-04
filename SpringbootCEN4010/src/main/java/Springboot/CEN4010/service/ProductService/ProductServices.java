package Springboot.CEN4010.service.ProductService;

import java.util.List;

import Springboot.CEN4010.Repository.CategoryRepo;
import Springboot.CEN4010.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Springboot.CEN4010.model.Category;
import Springboot.CEN4010.model.Products;

@Service
public class ProductServices {

	@Autowired
    ProductRepo productRepo;
	@Autowired
    CategoryRepo cateRepo;
	
	public List<Products>getAllProducts(){
		return productRepo.findAll();
	}
	public List<Products>getProductsByCategory(String product_id){
		return productRepo.getByCategoryId(product_id);
	}
	
	public List<Category>getAllCategory(){
		return cateRepo.findAll();
	}
	
	public Products getProductsById(long productId) throws Exception {
		return productRepo.findById(productId).orElseThrow(() ->new Exception("Product is not found"));
	}
}
