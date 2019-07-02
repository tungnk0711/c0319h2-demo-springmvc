package com.codegym.Controller;

import com.codegym.Model.Product;
import com.codegym.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    // depedency injection
    @Autowired
    private ProductServiceImpl productService;

    @GetMapping(value = "show-products")
    public String showProducts(Model model) {

        List<Product> products = productService.findAll();

        model.addAttribute("products", products);

        return "/product/list";

    }


}
