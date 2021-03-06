package com.nursh.spring.validation;


import com.nursh.spring.customAnnotation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message="Last Name is required")
    @Size(min=1, message = "Last name is required")
    private String lastName;

    @NotNull(message = "Free passes is required")
    @Min(value=0, message = "Must be greater than or equal to 0")
    @Max(value=10, message = "Must be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Postal code must have 5chars/digits")
    private String postalCode;

    @CourseCode(message = "Course Code must start with LUV") // add value= "ABC" -> changes default value of LUV
    private String courseCode;

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
