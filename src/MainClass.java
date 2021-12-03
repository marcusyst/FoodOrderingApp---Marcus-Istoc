public class MainClass {

    private String fullName;
    private String $contactNumber;
    private String fullAddress;
    private double fullPrice;
    private String fullOrder;
    private double $tva;

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public String getfullName() {
        return fullName;
    }

    public void set$contactNumber(String $contactNumber) {
        this.$contactNumber = $contactNumber;
    }

    public String get$contactNumber() {
        return $contactNumber;
    }
    
    public void setfullAddress(String fullAddress) {
    	this.fullAddress = fullAddress;
    }
    
    public String getfullAddress() {
    	return fullAddress;
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public double getFullPrice() {
        return fullPrice;
    }
    
    public void setTvaPrice(double $tva) {
    	this.$tva = $tva;
    }
    
    public double getTvaPrice() {
    	return $tva;
    }
    
    public void setfullOrder(String fullOrder) {
    	this.fullOrder = fullOrder;
    }
    
    public String getfullOrder() {
    	return fullOrder;
    }
}