package mortgages;

/**
 * This class was automatically generated by the data modeler tool.
 */
public class Applicant  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    private String creditRating;
    
    private Boolean approved;
    
    private java.util.Date applicationDate;
    
    private String name;
    
    private Integer age;

    public Applicant() {

    }
    
    public String getCreditRating() {
        return this.creditRating;
    }

    public void setCreditRating(  String creditRating ) {
        this.creditRating = creditRating;
    }
    
    public Boolean getApproved() {
        return this.approved;
    }

    public void setApproved(  Boolean approved ) {
        this.approved = approved;
    }
    
    public java.util.Date getApplicationDate() {
        return this.applicationDate;
    }

    public void setApplicationDate(  java.util.Date applicationDate ) {
        this.applicationDate = applicationDate;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(  String name ) {
        this.name = name;
    }
    
    public Integer getAge() {
        return this.age;
    }

    public void setAge(  Integer age ) {
        this.age = age;
    }




}