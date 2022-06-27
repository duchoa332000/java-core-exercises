package defining;

public class battery {
String model;
int hoursidle;
int hourstalk;



public battery(String model, int hoursidle, int hourstalk) {
	super();
	this.model = model;
	this.hoursidle = hoursidle;
	this.hourstalk = hourstalk;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getHoursidle() {
	return hoursidle;
}
public void setHoursidle(int hoursidle) {
	this.hoursidle = hoursidle;
}
public int getHourstalk() {
	return hourstalk;
}
public void setHourstalk(int hourstalk) {
	this.hourstalk = hourstalk;
}



}
