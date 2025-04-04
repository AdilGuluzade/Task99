package com.example.task99.Service;

import com.example.task99.Entity.Product;
import com.example.task99.Entity.Retailer;
import com.example.task99.Repository.ProductRepository;
import com.example.task99.Repository.RetailerRepository;

import java.util.List;

public class RetailerService {


private RetailerRepository retailerRepository;
private ProductRepository productRepository;
public RetailerService(RetailerRepository retailerRepository, ProductRepository productRepository) {
    this.retailerRepository = retailerRepository;
    this.productRepository = productRepository;
}

public RetailerRepository createRetailerRepository() {
    return retailerRepository;
}

    public List<Retailer> getAllRetailers() {
        return retailerRepository.findAll();
    }

    public ProductRepository createProductRepository() {
    return productRepository;
    }


    public List<Product> getAllProducts() {
    return productRepository.findAll();
    }


    public Product addProductToRetailer(Long retailerId, Product product) {
        Retailer retailer = retailerRepository.findById(retailerId)
                .orElseThrow(() -> new RuntimeException("Satıcı tapılmadı"));
        product.setRetailer(retailer);
        return productRepository.save(product);
    }


    public Retailer createRetailer(Retailer retailer) {
        return retailer;
    }
}
