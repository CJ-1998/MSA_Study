package com.spring_cloud.eureka.client.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ProductController {

    @Value("${server.port}") // 애플리케이션이 실행 중인 포트를 주입받습니다.
    private String serverPort;

//    // 서킷 브레이커 학습 위한 메서드
//    @GetMapping("/product/{id}")
//    public String getProduct(@PathVariable String id) {
//        return "Product " + id + " info!!!!! From port : " + serverPort;
//    }

//    // api gateway 학습 위한 메서드
//    @GetMapping("/product")
//    public String getProduct() {
//        return "Product info!!!!! From port : " + serverPort;
//    }

    @Value("${message}")
    private String message;

    @GetMapping("/product")
    public String getProduct() {
        return "Product detail from PORT : " + serverPort + " and message : " + this.message;
    }

}