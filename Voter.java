public class Voter {

    private String voterId;
    private String name;
    private int age;
    private String address;

    private String fatherMotherName;
    private String gender;
    private String mobile;
    private String email;
    private String aadhaar;
    private String dob;
    private String nationality;

    private String district;
    private String state;
    private String pincode;

    private String constituency;
    private String boothNo;
    private String voterType;

    private String registrationDate;

    public Voter(String voterId, String name, int age, String address,
                 String fatherMotherName, String gender, String mobile, String email,
                 String aadhaar, String dob, String nationality,
                 String district, String state, String pincode,
                 String constituency, String boothNo, String voterType, String registrationDate) {

        this.voterId = voterId;
        this.name = name;
        this.age = age;
        this.address = address;

        this.fatherMotherName = fatherMotherName;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
        this.aadhaar = aadhaar;
        this.dob = dob;
        this.nationality = nationality;

        this.district = district;
        this.state = state;
        this.pincode = pincode;

        this.constituency = constituency;
        this.boothNo = boothNo;
        this.voterType = voterType;
        this.registrationDate = registrationDate;
    }

    // GETTERS (REQUIRED FOR MYSQL)
    public String getVoterId() { return voterId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAddress() { return address; }

    public String getFatherMotherName() { return fatherMotherName; }
    public String getGender() { return gender; }
    public String getMobile() { return mobile; }
    public String getEmail() { return email; }
    public String getAadhaar() { return aadhaar; }
    public String getDob() { return dob; }
    public String getNationality() { return nationality; }

    public String getDistrict() { return district; }
    public String getState() { return state; }
    public String getPincode() { return pincode; }

    public String getConstituency() { return constituency; }
    public String getBoothNo() { return boothNo; }
    public String getVoterType() { return voterType; }

    public String getRegistrationDate() { return registrationDate; }

    @Override
    public String toString() {
        return "\n----- VOTER DETAILS -----" +
               "\nVoter ID: " + voterId +
               "\nName: " + name +
               "\nAge: " + age +
               "\nAddress: " + address +
               "\nFather/Mother Name: " + fatherMotherName +
               "\nGender: " + gender +
               "\nMobile: " + mobile +
               "\nEmail: " + email +
               "\nAadhaar: " + aadhaar +
               "\nDOB: " + dob +
               "\nNationality: " + nationality +
               "\nDistrict: " + district +
               "\nState: " + state +
               "\nPincode: " + pincode +
               "\nConstituency: " + constituency +
               "\nBooth No: " + boothNo +
               "\nVoter Type: " + voterType +
               "\nRegistration Date: " + registrationDate +
               "\n--------------------------\n";
    }
}
