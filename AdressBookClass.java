public class AdressBookClass {
    public String first_name,last_name,address,city,state,email;
    public long phoneNumber;
    public int zip;

    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getEmail() {
        return email;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public int getZip() {
        return zip;
    }
    public String toString(){
        return "First Name = "+first_name +" \n"+ "Last Name = " +last_name +" \n" + "Address = "+ address +" \n" + "City =" + city+" \n"+"State = " + state+" \n"+ "Email ="+email+" \n"+ "Phone Number ="+phoneNumber+" \n" + "Zip Code = "+zip+" \n\n"+"------------------";
    }
    AdressBookClass(String first_name, String last_name, String address, String city, String state, String email, long phoneNumber, int zip){
        this.first_name=first_name;
        this.last_name=last_name;
        this.address=address;
        this.city=city;
        this.state=state;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.zip=zip;
    }

}
