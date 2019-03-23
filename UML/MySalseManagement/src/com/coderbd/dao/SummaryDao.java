
package com.coderbd.dao;

import com.coderbd.pojo.Product;
import com.coderbd.pojo.Summary;
import java.util.List;


public interface SummaryDao {
    
    void createTable();
    
    void save(Summary s);
    
    void update(Summary s);
    
    Summary getSummaryById(int id);
    
    Summary getSummaryProductCode(String code);
    
    void delete(int id);
    
    List <Summary> getList();
}
