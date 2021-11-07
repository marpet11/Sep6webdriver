public class Airline {

    String Name;
    String Flight;

    public Airline(String AirlineName, String AirlineFlight) {
        Name = AirlineName;
        Flight = AirlineFlight;
    }

    public void printName (){
        System.out.println(Name);
    }

    public void printFlight (){
        System.out.println(Flight);
    }

    public void OnTime (){
        System.out.println("Flight is on Time");
    }

    public void Delayed (){
        System.out.println("Flight is delayed");

    }
}

