package it.lutech.corso.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfig implements WebApplicationInitializer {

	public void onStartup(ServletContext context) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(GuastiWebConfig.class);
		ctx.setServletContext(context);
		ServletRegistration.Dynamic servlet = context.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
	}

}
