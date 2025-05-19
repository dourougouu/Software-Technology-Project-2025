public class Address {
    private int addressId;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private User user; // Added user

    public Address(int addressId, String street, String city, String state, String zipCode, User user) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.user = user;
    }

    // Getters and Setters
    public int getAddressId() { 
        return addressId; 
    }

    public void setAddressId(int addressId) { 
        this.addressId = addressId; 
    }

    public String getStreet() { 
        return street; 
    }

    public void setStreet(String street) { 
        this.street = street; 
    }

    public String getCity() { 
        return city; 
    }

    public void setCity(String city) { 
        this.city = city; 
    }

    public String getState() { 
        return state; 
    }
    
    public void setState(String state) { 
        this.state = state; 
    }

    public String getZipCode() { 
        return zipCode; 
    }

    public void setZipCode(String zipCode) { 
        this.zipCode = zipCode; 
    }

    public User getUser() { 
        return user; 
    }

    public void setUser(User user) { 
        this.user = user; 
    }
}