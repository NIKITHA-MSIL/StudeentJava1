public class Encapsulate {
    String Id;
    String name;
    String gender;
    String age;
    Encapsulate(String Id,
    String name,
    String gender,
    String age){
    	this.Id =Id;
    	this.name =name;
    	this.gender = gender;
    	this.age = age;
    	
    }
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
    
    

}
