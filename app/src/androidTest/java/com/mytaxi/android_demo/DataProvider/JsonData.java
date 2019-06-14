package com.mytaxi.android_demo.DataProvider;

public class JsonData {
    private String invalidUsername,
            invalidPassword,
            validUsername,
            validPassword,
            searchDriverInitials,
            fullnameDriver,
            telephoneDriver;





    public String getValidUsername() {
        return validUsername;
    }

    public void setValidUsername(String validUsername) {
        this.validUsername = validUsername;
    }

    public String getValidPassword() {

        return validPassword;
    }

    public void setValidPassword(String validPassword) {
        this.validPassword = validPassword;
    }

    public String getInvalidUsername() {
        return invalidUsername;
    }

    public void setInvalidUsername(String invalidUsername) {
        this.invalidUsername = invalidUsername;
    }

    public String getInvalidPassword() {
        return invalidPassword;
    }

    public void setInvalidPassword(String invalidPassword) {
        this.invalidPassword = invalidPassword;
    }

    public String getSearchDriverInitials() {
        return searchDriverInitials;
    }

    public void setSearchDriver(String searchDriver) {
        this.searchDriverInitials = searchDriverInitials;
    }

    public String getFullnameDriver() {
        return fullnameDriver;
    }

    public void setFullnameDriver(String fullnameDriver) {
        this.fullnameDriver = fullnameDriver;
    }



    public String getTelephoneDriver() {
        return telephoneDriver;
    }

    public void setTelephoneDriver(String telephoneDriver) {
        this.telephoneDriver = telephoneDriver;
    }

}
