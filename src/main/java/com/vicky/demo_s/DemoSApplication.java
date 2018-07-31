package com.vicky.demo_s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication // Spring Boot��Ŀ�ĺ���ע�⣬��ҪĿ���ǿ����Զ�����
@Controller // ��������һ��SpringMVC��Controller������
public class DemoSApplication {
	@RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }

    // ��main����������һ��Ӧ�ã��������Ӧ�õ����
    public static void main(String[] args) {
        SpringApplication.run(DemoSApplication.class, args);
    }
}
