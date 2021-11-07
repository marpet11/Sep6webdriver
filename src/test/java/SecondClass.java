import org.testng.annotations.Test;

public class SecondClass {

    @Test
    public void Print2Numbers () {
        int variableOne = 11;
        int variableTwo = 33;

        printTwoNumbers(variableOne, variableTwo);
    }

    @Test
    public void TestName2 () {
        int variableOne = 11;
        int variableTwo = 33;

        System.out.println(variableOne + " " + variableTwo);

    }

    private void printTwoNumbers(int FirstParameter, int SecondParameter) {
        System.out.println(FirstParameter + " " + SecondParameter);
    }

    @Test
    public void testFloatVSInteger() {
        int FloatValue = (int) 11.5;

        System.out.println(FloatValue);
    }

    @Test
    public void testFloatVSInteger2() {
        float FloatValue = (float) 11.5;

        System.out.println(FloatValue);
    }

    @Test
    public void testBooleans() {

        int AmountOfClicks = 5;
        int AmountOfLinks = 4;

        boolean AnyLinksLefttoClick = AmountOfLinks > AmountOfClicks;
        boolean NoLinksLeft = AmountOfLinks < AmountOfClicks;

        if (AnyLinksLefttoClick){
            System.out.println("Keep Clicking");
        }
        if (NoLinksLeft){
            System.out.println("All Done");
        }
    }

    @Test
    public void testConditionalAND() {
        int AmountOfClicks = 10;
        int AmountOfLinks = 11;

        boolean AnyLinksLefttoClick = AmountOfLinks > AmountOfClicks;

        int CurrentTime = 5000;
        int TimeSinceStart = 3000;

        boolean AnyTimeLeftForClicks = (CurrentTime - TimeSinceStart) > 1000;

        if (AnyLinksLefttoClick && AnyTimeLeftForClicks) {
            System.out.println("Keep Clicking");
        }
    }

    @Test
    public void testConditionalOR() {
        int AmountOfClicks = 10;
        int AmountOfLinks = 8;

        boolean AnyLinksLefttoClick = AmountOfLinks > AmountOfClicks;

        int CurrentTime = 5000;
        int TimeSinceStart = 6000;

        boolean AnyTimeLeftForClicks = (CurrentTime - TimeSinceStart) > 1000;

        if (AnyLinksLefttoClick || AnyTimeLeftForClicks) {
            System.out.println("Keep Clicking");
        }
    }

    @Test
    public void testConditionalELSE() {
        int AmountOfClicks = 8;
        int AmountOfLinks = 10;

        boolean ElementOneIsVisible = true;

        boolean AnyLinksLefttoClick = AmountOfLinks > AmountOfClicks;

        int CurrentTime = 5000;
        int TimeSinceStart = 3000;

        boolean AnyTimeLeftForClicks = (CurrentTime - TimeSinceStart) > 1000;

        if (ElementOneIsVisible && AnyLinksLefttoClick && AnyTimeLeftForClicks) {
            System.out.println("Keep Clicking");
        }
        else System.out.println(("Some Parameters Are Not Met"));
    }

    @Test
    public void testArraysConditionalFOR() {
        int [] ArrayOfNumbers = {1,2,3,4,5,6};

        String FirstCar = "Mercedes";
        String SecondCar = "Audi";
        String ThirdCar = "Tesla";

        String [] Garage = {FirstCar, SecondCar, ThirdCar};

        for (int i = 0; Garage.length > i; i++){
            System.out.println("car " + i + ": " + Garage [i]);
        }

        for (String eachCar : Garage){
            System.out.println("Car: " + eachCar);
        }

    }

}


