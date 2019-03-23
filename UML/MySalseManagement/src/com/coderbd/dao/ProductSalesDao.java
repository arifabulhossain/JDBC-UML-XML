
package com.coderbd.dao;

import com.coderbd.pojo.ProductSales;
import java.util.List;


public interface ProductSalesDao {
    
    void createTable();
    
     void save(ProductSales ps);
    
    void update(ProductSales ps);
    
    ProductSales getProductSalesById(int id);
    
    ProductSales getProductSalesByProductCode(String code);
    
    void delete(int id);
    
    List <ProductSales> getList();
}
