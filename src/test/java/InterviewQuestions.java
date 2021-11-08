import org.testng.annotations.Test;

public class InterviewQuestions {

    @Test
    public void TestEvenNumbers (){
        for (int i = 1; i <= 10; i++) {
            if (i%2 == 0) System.out.println(i);
        }
    }

    @Test
    public void testEvenNumbers2option() {
        for (int i = 2; i <=10; i = i + 2) {
            System.out.println(i);
        }
    }

    @Test
    public void TestHelloWorldEvenNumbers (){
        for (int i = 1; i <= 10; i++) {
            if (i%2 == 0) System.out.println("Hello World");
        }
    }


}
