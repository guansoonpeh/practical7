
public abstract class PatientBill {

    private static int nextID = 1001;

    protected String visitID;
    protected String name;

    public PatientBill() {
        this("");
    }

    public PatientBill(String name) {
        visitID = "B" + nextID;
        this.name = name;

        nextID++;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        PatientBill.nextID = nextID;
    }

    public String getVisitID() {
        return visitID;
    }

    public void setVisitID(String visitID) {
        this.visitID = visitID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract double calculateCharges();
    
    public String toString() {
        return String.format("ID: %s\nName: %s", visitID, name);
    }
   

}
