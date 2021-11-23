package hawks.api;

import com.github.javafaker.Faker;

import net.minidev.json.JSONObject;

public class DataGenerator {

	public static String getEmail() {
		Faker faker = new Faker();
		String email = faker.name().firstName().toLowerCase() + faker.name().lastName() + "@test.com";
		return email;
	}

	public static String getPassword() {
		Faker faker = new Faker();
		String password = faker.funnyName().name();
		return password;
	}
	
	public static String getFirstName() {
		Faker faker = new Faker();
		String firstName = faker.name().firstName();
		return firstName;
	}
	
	public static String getTitle() {
		Faker faker = new Faker();
		String title = faker.name().title();
		return title;
	}
	
	public static String getLastName() {
		Faker faker = new Faker();
		String lastName = faker.name().lastName();
		return lastName;
	}
	
	public static String getGender() {
		Faker faker = new Faker();
		String gender = faker.demographic().sex();
		return gender;
	}
	
	
	public static String getMaritalStatus() {
		Faker faker = new Faker();
		String relationships = faker.demographic().maritalStatus();
		return relationships;
	}
	
	public static String getEmploymentStatus() {
		Faker faker = new Faker();
		String job = faker.job().position();
		return job;
	}
	
	public static String getDate() {
		Faker faker = new Faker();
		String date = faker.date().birthday().toLocaleString();
		return date;
	}
	
	public static String getLanguagePref() {
		Faker faker = new Faker();
		String language = faker.letterify(getLanguagePref());
		return language;
	}
	
	public static String getAddressType() {
		Faker faker = new Faker();
		String address = faker.address().country();
		return address;
	}
	
	public static String getAddressLine() {
		Faker faker = new Faker();
		String addressLine = faker.address().streetAddress();
		return addressLine;
	}
	
	public static String getCity() {
		Faker faker = new Faker();
		String city = faker.address().cityName();
		return city;
	}
	
	public static String getState() {
		Faker faker = new Faker();
		String state = faker.address().state();
		return state;
	}
	
	public static String getPostalCode() {
		Faker faker = new Faker();
		String postalCode = faker.address().zipCode();
		return postalCode;
	}
	
	public static String getCountryCode() {
		Faker faker = new Faker();
		String countryCode = faker.address().countryCode();
		return countryCode;
	}
	
	public static String getPhoneNum() {
		Faker faker = new Faker();
		String phoneNum = faker.phoneNumber().phoneNumber();
		return phoneNum;
	}
	
	public static String getPhoneExt() {
		Faker faker = new Faker();
		String phoneExt = faker.phoneNumber().extension();
		return phoneExt;
	}
	
	public static String getPhoneTime() {
		Faker faker = new Faker();
		String phoneTime = faker.address().timeZone();
		return phoneTime;
	}
	
	
	public static String getPhoneType() {
		Faker faker = new Faker();
		String phoneType = faker.phoneNumber().cellPhone();
		return phoneType;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
