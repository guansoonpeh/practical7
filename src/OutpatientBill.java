public class OutpatientBill extends PatientBill {
    private final static double REGISTRATION_FEES = 30;
    private double consultationFees;

    public OutpatientBill() {
        this("",0);
    }    

    public OutpatientBill(String name, double consultationFees) {
        super(name);
        this.consultationFees = consultationFees;
    }

    public double getConsultationFees() {
        return consultationFees;
    }

    public void setConsultationFees(double consultationFees) {
        this.consultationFees = consultationFees;
    }

    public static double getRegistrarionFees() {
        return REGISTRATION_FEES;
    }

    public double calculateCharges() {
        return REGISTRATION_FEES + consultationFees;
    }
    
    public String toString() {
        return  String.format("%s\nConsultation Fees : %.2f", 
                               super.toString(),
                               consultationFees);
    }
   
    
    
    
    
}