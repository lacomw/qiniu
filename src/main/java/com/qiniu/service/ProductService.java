package com.qiniu.service;

import com.qiniu.model.Product;
import com.qiniu.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lacomw on 2017/10/6.
 */
@Service
public class ProductService {

    @Autowired(required = false)
    private ProductRepository productRepository;

    /**
     * 按照指定id查找,如果无果,按照类型查找一个
     * @param id
     * @param type
     * @return
     */
    public Product findByIdAndType(long id,String type){
        Product product = productRepository.findByIdAndType(id,type);
        if (product == null){
            product = productRepository.findFirstByType(type);
        }
        return product;
    }

    public List<Product> findByType(String type){
        List<Product> products = productRepository.findByType(type);
        if (products == null || products.size() == 0){
            return null;
        }
        return products;
    }

}
