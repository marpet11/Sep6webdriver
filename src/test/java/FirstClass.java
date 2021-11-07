import com.sun.xml.internal.org.jvnet.fastinfoset.sax.FastInfosetReader;
import org.testng.annotations.Test;

public class FirstClass {

    @Test
    public void testHelloWorld() {

        System.out.println("Hello, World!");
    }

    @Test
    public void testSimpleInteger() {
        int myNumber;
        myNumber = 5;

        System.out.println(myNumber);
    }

    @Test
    public void testStringConcatenation() {
        String s1 = "Dogs are nicer than people! ";
        String s2 = "Yes, they are!";

        String s3 = s1 + s2;

        System.out.println(s3);
    }

    @Test
    public void testConcatenationStringAndInteger() {
        String s1 = "Dogs are nicer than people! ";
        String s2 = "Yes, they are!";
        int Number = 3;

        String s3 = s1 + Number + s2;

        System.out.println(s3);
    }

    @Test
    public void testMoreNumbers() {
        int numberOfClicks = 5;
        int anotherNumber = 5;

        System.out.println(5 + 6 + anotherNumber + numberOfClicks);
    }

    @Test
    public void testString() {
        String leftPartMessage = "Who who who who!";
        String rightPartMessage = "Who let the dogs out?";

        System.out.println(rightPartMessage + " " + leftPartMessage);
    }

@Test
    public void testClickTimes () {
        String name1 = "I clicked";
        String name2 = "times";
        int times = 5;

                System.out.println(name1 + " " + times + " " + name2);
}


}