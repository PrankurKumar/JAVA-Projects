public class Experiment {
    //add instance variable to experiment class
    private String summary;
    //add an array of the measurement object and initialize it to 10capacity
    private Measurment[] measurments = new Measurment[10];
    
    public Experiment(){
        this("Neew Experiment");
    }


    public Experiment(String summary) {
               this.summary = summary;
    }

    
    public String getSummary() {
        return summary;
    }


    public void setSummary(String summary) {
        this.summary = summary;
    }

    



    //Create  a new merhod that can construct a new measurment object, set its properties and add it  to the measurment array
    public void addMeasurment(String note, double value, String unit){
        for(int i = 0; i<measurments.length; i++){
            if(measurments[i]==null){
                measurments[i] = new Measurment(note, value, unit);
                break;
            }
        }
    }
    //Produces a text object that represents a formatted report about the experiment aand all its measurements
    public String experimentReport(){
        String result = "\n"+summary+"\nMeasurements:";
        //Create a for loop that iterates through all measurements.
        for(int i=0; i<measurments.length; i++){
            //add logic that bresks from the loop when you encounter an uninitialized measurement
            if(measurments[i]==null){
                break;
            }
            result +="\n\t"+(i+1)+" "+measurments[i].getNote()+"\t"+measurments[i].getValue()+" "+measurments[i].getUnit(); 
        }
        return result;
    }
    
}
