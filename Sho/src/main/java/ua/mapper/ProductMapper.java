package ua.mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import ua.domain.ProductIndex;
import ua.domain.request.ProductRequest;
import ua.entity.Product;


public interface ProductMapper {

	public static ProductIndex toProductIndex(Product product){
		Integer id = product.getId();
		String photoUrl = product.getPhotoUrl();
		Integer version = product.getVersion();
		BigDecimal price = product.getPrice();
		String category = product.getCategory().getName();
		String subCategory= product.getSubCategory().getName();
		String subSubCategory= product.getSubSubCategory().getName();
		return new ProductIndex(id, photoUrl, version, price, null, category, subCategory, subSubCategory);
	}
	
	public static List<ProductIndex> toProductIndex(List<Product> product){
		return product.stream()
				.map(ProductMapper::toProductIndex)
				.collect(Collectors.toList());
	}
	
	public static Product toProduct(ProductRequest request){
		Product product = new Product();
		product.setSubSubCategory(request.getSubSubCategory());
		product.setDescription(request.getDescription());
		product.setId(request.getId());
		product.setCategory(request.getCategory());
//		product.setRooms(Integer.valueOf(request.getRooms()));
		product.setSubCategory(request.getSubCategory());
		return product;
	}
}