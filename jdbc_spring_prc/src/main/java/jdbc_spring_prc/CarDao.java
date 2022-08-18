package jdbc_spring_prc;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CarDao {
	JdbcTemplate jdbcTemplate=new JdbcTemplate(getDataSource());
	public void saveCar(Car car) {
		String sql="insert into car values(?,?,?)";
		Object arr[]= {car.getCno(),car.getName(),car.getCompany()};
		jdbcTemplate.update(sql,arr);
	}
	public DataSource getDataSource() {
		String url="jdbc:mysql://localhost:3306/jdbcforonline";
		String username="root";
		String password="Vkprash@27";
		return new DriverManagerDataSource(url,username,password);
	}
	



}
