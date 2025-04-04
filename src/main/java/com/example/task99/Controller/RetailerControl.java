package com.example.task99.Controller;

import com.example.task99.Entity.Product;
import com.example.task99.Entity.Retailer;
import com.example.task99.Service.RetailerService;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RetailerControl {



    @RequestMapping("/api/retailers")
    public class RetailerController {

        private final RetailerService retailerService;

        public RetailerController(RetailerService retailerService) {
            this.retailerService = retailerService;
        }

        @PostMapping("/retailers")
        public Retailer createRetailer(@RequestBody Retailer retailer) {
            return retailerService.createRetailer(retailer);
        }

        @GetMapping()
        public List<Retailer> getAllRetailers() {
            return retailerService.getAllRetailers();
        }

        @PostMapping("/{retailerId}/products")
        public Product addProduct(@PathVariable Long retailerId, @RequestBody Product product) {
            return retailerService.addProductToRetailer(retailerId, product);
        }

        @DeleteMapping("/retailers/{id}")
        public void deleteRetailer(@PathVariable Long id) {
            retailerService.addProductToRetailer(id, null);
        }




    }







}
