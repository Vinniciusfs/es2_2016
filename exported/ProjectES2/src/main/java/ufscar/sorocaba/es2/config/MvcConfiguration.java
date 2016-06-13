package ufscar.sorocaba.es2.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import dao.ActivitysDAO;
import dao.ActivitysDAOImpl;

@Configuration
@ComponentScan(basePackages="ufscar.sorocaba.es2")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	private static final String USER_PASSWORD = "0p3n4m3NOW";
	private static final String USER = "postgres";
	private static final String DB_NAME = "es2";

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5433/" + DB_NAME);
        dataSource.setUsername(USER);
        dataSource.setPassword(USER_PASSWORD);
        
        return dataSource;
    }
     
    @Bean
    public ActivitysDAO getContactDAO() {
        return new ActivitysDAOImpl(getDataSource());
    }
}
