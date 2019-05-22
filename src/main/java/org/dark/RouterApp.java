package org.dark;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//開啟zuul的代理
@EnableZuulProxy
public class RouterApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(RouterApp.class).web(true).run(args);
	}
}
