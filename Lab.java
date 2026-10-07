public class Lab {
    public static void main(String[] args){
        Experiment e1 = new Experiment();
        e1.addMeasurment("Initial weight", 24.57, "kg");
        e1.addMeasurment("Imperial unit check",42, "lb");
        e1.addMeasurment("Quite Cold", -33.6, "F");
        e1.addMeasurment("In a few seconds", 4, "s");
        e1.addMeasurment("A few Moments later", 33, "s");
        e1.addMeasurment("A few more moments later later", 15, "s");
        e1.addMeasurment("A few Moments later", 33, "s");
        e1.addMeasurment("Extra weight", 50.4, "kg");
        e1.addMeasurment("0.1 kg of water", 5.55, "mol");
        e1.addMeasurment("Electric current", 5, "A");
        e1.addMeasurment("Close to 12 lumens", 1, "cd");

        Experiment e2 = new Experiment("Measure Distance");
        e2.addMeasurment("Quite close", 12.5,"m");
        e2.addMeasurment("Imperial unit check", 12.5/0.3048, "ft");
        e2.addMeasurment(null, 5, "ft");

        System.out.println(e1.experimentReport());
        System.out.println(e2.experimentReport());

        e1.setSummary("Measure different things");
        System.out.println(e1.experimentReport());

        e2.addMeasurment("Final weight", 12, "kg");
        System.out.println(e2.experimentReport());

        e2.addMeasurment("Wrong unit", 12.5, "x");
        System.out.println(e2.experimentReport());

        //e2.measurements[0].note = null;
        //System.out.println(e2.experimentReport());

    
    }

    
}
 