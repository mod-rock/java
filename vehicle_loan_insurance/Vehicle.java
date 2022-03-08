package vehicle_loan_insurance;

public class Vehicle implements Loan, Insurance {
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
		this.vehicleNumber=vehicleNumber;
		this.modelName=modelName;
		this.vehicleType=vehicleType;
		this.price=price;
	}
	
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber=vehicleNumber;
	}
	public void setmodelName(String modelName) {
		this.modelName=modelName;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType=vehicleType;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public double takeInsurance() {
		if(price<=150000) {
			return 3500;
		}
		else if(price>150000 && price<=300000) {
			return 4000;
		}
		else if(price>300000) {
			return 5000;
		}
		
		return 0;
	}
	@Override
	public double issueLoan() {
		if(vehicleType.equals("4 wheeler")) {
			return price*0.80;
		}
		else if(vehicleType.equals("3 wheeler")) {
			return price*0.75;
		}
		else if(vehicleType.equals("2 wheeler")) {
			return price*0.50;
		}
		return 0;
	}
	
	
}
