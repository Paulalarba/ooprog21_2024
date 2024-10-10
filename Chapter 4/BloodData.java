public class BloodData {
    private String bloodType;
    private String rhFactor;

    public BloodData() {
        defaultPatient();
    }

    public BloodData(String bloodType, String rhFactor) {
        setBloodType(bloodType);
        setRhFactor(rhFactor);
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        if (bloodType.equalsIgnoreCase("A") || bloodType.equalsIgnoreCase("B") || 
            bloodType.equalsIgnoreCase("AB") || bloodType.equalsIgnoreCase("O")) {
            this.bloodType = bloodType.toUpperCase();
        } else {
            System.out.println("Invalid blood type. Setting to default (A).");
            this.bloodType = "A";
        }
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        if (rhFactor.equals("+") || rhFactor.equals("-")) {
            this.rhFactor = rhFactor;
        } else {
            System.out.println("Invalid Rh factor. Setting to default (-).");
            this.rhFactor = "-";
        }
    }

    public void defaultPatient() {
        this.bloodType = "A";
        this.rhFactor = "-";
    }

    public void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh Factor is: " + rhFactor);
    }
}

