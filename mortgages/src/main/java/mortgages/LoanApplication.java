package mortgages;

/**
 * This class was automatically generated by the data modeler tool.
 */
public class LoanApplication  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    private Integer amount;
    
    private Boolean approved;
    
    private Integer approvedRate;
    
    private Integer deposit;
    
    private String explanation;
    
    private Integer lengthYears;
    
    private Integer insuranceCost;

    public LoanApplication() {

    }
    
    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(  Integer amount ) {
        this.amount = amount;
    }
    
    public Boolean getApproved() {
        return this.approved;
    }

    public void setApproved(  Boolean approved ) {
        this.approved = approved;
    }
    
    public Integer getApprovedRate() {
        return this.approvedRate;
    }

    public void setApprovedRate(  Integer approvedRate ) {
        this.approvedRate = approvedRate;
    }
    
    public Integer getDeposit() {
        return this.deposit;
    }

    public void setDeposit(  Integer deposit ) {
        this.deposit = deposit;
    }
    
    public String getExplanation() {
        return this.explanation;
    }

    public void setExplanation(  String explanation ) {
        this.explanation = explanation;
    }
    
    public Integer getLengthYears() {
        return this.lengthYears;
    }

    public void setLengthYears(  Integer lengthYears ) {
        this.lengthYears = lengthYears;
    }
    
    public Integer getInsuranceCost() {
        return this.insuranceCost;
    }

    public void setInsuranceCost(  Integer insuranceCost ) {
        this.insuranceCost = insuranceCost;
    }




}