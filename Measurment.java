public class Measurment {
    // Initialize an array of SI units repersented as string
   private final String[] SI_UNITS = { "s", "m", "kg", "A", "K", "mol", "cd" };
    // Declare imperial units as String
    private final String[] IMPERIAL_UNITS = { "ft", "lb", "F" };
    // Declare constant to repersent a feet to meter conversion
    private final double ft2m = 0.3048;
    // Declare constant to repersent a pound to kg conversion
    private final double lb2kg = 0.4536;
    // Create instance variables
    private String note;
    private double value;
    private String unit;
    
    public String getNote(){
        return note;
    }
    public double getValue(){
        return value;
    }
    public String getUnit(){
        return unit;
    }

    // Create a method that checks if the unit is one of the SI units
    public boolean isSI(String unit){
        for(String u : SI_UNITS){
        if(u.equals(unit)){
            return true;

        }        
    }return false;
}
//Create a method to imperial units
 public boolean isImperial(String unit){
        for(String u : IMPERIAL_UNITS){
        if(u.equals(unit)){
            return true;

        }        
    }return false;
}
//A method return an SI equivalent of an imperial unit.
public String convertUnit(String unit){
    return switch(unit){
        case "ft" -> SI_UNITS[1];
        case "lb" -> SI_UNITS[2];
        case "F" -> SI_UNITS[4];
        default -> unit;
    };
}
//Create a method to convert the value from Imperial to SI units
double
convertValue(String unit, double value){
    return switch(unit){
        case "ft" -> value*ft2m;
        case "lb" -> value*lb2kg;
        case "F" -> (value-32)*5/9+273.15;
        default -> value;
    };
}
//Create a methos thet initialize not, value, and unit instaance variables
//Implement method logic to initialize instance variable or the measurment object
public Measurment(String note, double value, String unit){
    this.note = (note==null) ? "No notes" : note;
    if(isSI(unit)){
        this.unit = unit;
        this.value = value;
    }
    else{
        if(isImperial(unit)){
            this.unit = convertUnit(unit);
            this.value = convertValue(unit, value);

        }
    }

}

}
 
