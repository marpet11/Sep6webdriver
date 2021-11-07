import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;

public class AirlineTest{


    @Test
    public void TestName () {
        String TestParamOne = "Lufthansa";
        String TestParamTwo = "LH403";

        Airline AirlineOne = new Airline(TestParamOne, TestParamTwo);

        AirlineOne.printName();
        AirlineOne.printFlight();
        AirlineOne.OnTime();

        boolean isnamecorrect = AirlineOne.Name.contentEquals("lufthansa");

        Assert.assertEquals(AirlineOne.Name, "Lufthansa");

    }


}
