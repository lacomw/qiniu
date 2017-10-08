package com.qiniu.controller;

import com.qiniu.model.Product;
import com.qiniu.model.ProductTypeEnum;
import com.qiniu.service.ProductService;
import com.qiniu.util.EnumUtil;
import org.apache.commons.collections.list.PredicatedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lacomw on 2017/10/6.
 */
@Controller
@RequestMapping(value = "product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/{type}/{id}")
    public String list(@PathVariable String type, @PathVariable long id, ModelMap modelMap){

        ProductTypeEnum typeEnum = EnumUtil.getProductEnum(type);
        modelMap.put("type",type);
        modelMap.put("title",typeEnum.gettitle());
        modelMap.put("subTitle",typeEnum.gettitle());

//        Product product = productService.findByIdAndType(id,type);
//        List<Product> products = productService.findByType(type);
        Product product = new Product();
        List<Product> products = getProducts(typeEnum);
        product.setId(id);
        List<String> pics = new ArrayList<>();
        if (typeEnum.equals(ProductTypeEnum.glove)){
            if(id == 1 ){
                product.setName("手套1");
                product.setTitle("");
                pics.add("/static/img/shoutao/1-1.png");
                pics.add("/static/img/shoutao/1-2.png");
            }else if (id == 2){
                product.setName("手套2");
                product.setTitle("");
                pics.add("/static/img/shoutao/2-1.png");
                pics.add("/static/img/shoutao/2-2.png");
            }
        }else if (typeEnum.equals(ProductTypeEnum.huxi)){
            if (id == 3){
                product.setName("护膝1");
                pics.add("/static/img/huxi/1-1.png");
                pics.add("/static/img/huxi/1-2.png");
            }
        }else {
            product.setName("鞋垫");
            pics.add("/static/img/xiedian/1-1.png");
            pics.add("/static/img/xiedian/1-2.png");
        }
        modelMap.put("products",products);
        modelMap.put("firstOne",product);
        return "product";
    }

    public List<Product> getProducts(ProductTypeEnum type){
        List<Product> products = new ArrayList<>();
        if (type.equals(ProductTypeEnum.glove)){
            Product product1 = new Product();
            Product product2 = new Product();
            product1.setId(1l);
            product1.setName("电热手套1");
            product2.setId(2l);
            product2.setName("电热手套2");
            products.add(product1);
            products.add(product2);
        }else if (type.equals(ProductTypeEnum.huxi)){
            Product product1 = new Product();
            product1.setId(3l);
            product1.setName("电热护膝2");
            products.add(product1);
        }else {
            Product product1 = new Product();
            product1.setId(4l);
            product1.setName("电热鞋垫1");
            products.add(product1);
        }
        return products;
    }
}
