
public class InpatientBill extends PatientBill{
    //static data declaration
    private static double standardRoomRate = 100.00;
    private static double privateRoomRate = 200.00;

    private double specialistCharges;
    private double labCharges;
    private char roomType;
    private int durationDay;

    public InpatientBill() {
    }
        
    public InpatientBill(double specialistCharges, double labCharges, char roomType, int durationDay, String name) {
        super(name);
        this.specialistCharges = specialistCharges;
        this.labCharges = labCharges;
        this.roomType = roomType;
        this.durationDay = durationDay;
    }
    // todo:: calculateTotalCharges() 
    
    public double calculateCharges() {
        double roomRate = 0;
        double roomCharges = 0;
        
        if (roomType == 'P'){
            roomRate = privateRoomRate;
        }else{
            roomRate = standardRoomRate;
        }
        
        roomCharges = durationDay * roomRate;
        
        return specialistCharges + labCharges + roomCharges;
    }
     
    public String toString() {
        return  super.toString() + "\n"+
                "specialist Charges " + specialistCharges + "\n"+
                "Lab Charges : " + labCharges + "\n" +
                "Room Type : " +  (roomType == 'P' ? "Private" : "Standard") + "\n" +
                "Duration  : " + durationDay;
                
    }
   
    
}
