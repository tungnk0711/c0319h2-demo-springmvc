package com.codegym.Controller;

import com.codegym.Model.Product;
import com.codegym.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "product")
public class ProductController {

    // depedency injection
    @Autowired
    private ProductServiceImpl productService;

    @RequestMapping(value = "/show*")
    public String showProducts(Model model) {

        List<Product> products = productService.findAll();

        model.addAttribute("products", products);

        return "/product/list";

    }

    @GetMapping(value = "/show-product-form")
    public ModelAndView showProductForm() {
        ModelAndView modelAndView = new ModelAndView("/product/add");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping(value = "/save-product")
    public ModelAndView saveProduct(@ModelAttribute Product product) {

        if (product != null) {
            productService.add(product);
        }

        ModelAndView modelAndView = new ModelAndView("/product/add");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("message", "da them san pham thanh cong");

        return modelAndView;

    }

    @GetMapping(value = "/product-detail/{id}/customer-id/{cusId:\\d}")
    public ModelAndView viewDetail(@PathVariable Long id, @PathVariable String cusId) {
        Product product = null;
        if (id != null) {
            product = productService.findById(id);
        }
        ModelAndView modelAndView = new ModelAndView("/product/detail");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @GetMapping(value = "/search-product")
    public void searchProduct(@RequestParam String name){

        // code here
    }


}
