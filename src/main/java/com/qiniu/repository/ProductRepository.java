package com.qiniu.repository;

import com.qiniu.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by lacomw on 2017/10/6.
 */
public interface ProductRepository extends CrudRepository<Product,Long> {

    Product findByIdAndType(long id,String type);
    Product findFirstByType(String type);
    List<Product> findByType(String type);
}
