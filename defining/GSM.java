package defining;


public class GSM {
private String model;
private String manufacturer;
private int price;
private String owner;

private battery batterys;
private display displays;

public GSM(String moddel, String manufacturer) {
	this.model = model;
	this.manufacturer= manufacturer;
}
public GSM(String model, String manufacturer, int price, String owner, battery batterys, display displays) {
	super();
	this.model = model;
	this.manufacturer = manufacturer;
	this.price = price;
	this.owner = owner;
	this.batterys = batterys;
	this.displays = displays;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public battery getBatterys() {
	return batterys;
}
public void setBatterys(battery batterys) {
	this.batterys = batterys;
}
public display getDisplays() {
	return displays;
}
public void setDisplays(display displays) {
	this.displays = displays;
}


}
