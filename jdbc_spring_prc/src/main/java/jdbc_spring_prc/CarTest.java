package jdbc_spring_prc;


public class CarTest {
	public static void main(String[] args) {
		Car car=new Car();
		car.setCno(67);
		car.setName("creta");
		car.setCompany("Maruti");
		
		CarDao dao=new CarDao();
		dao.saveCar(car);
	}

}
