import org.testng.annotations.Test;

import java.util.Arrays;

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
    public void TestHelloWorldEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.println("Hello World");
        }
    }

    @Test
    public void testSwap2NumbersInArray() {
        int[] array = {1, 2, 3, 4}; // data we have
        solution(array, 0, 3); // newly created method below
        System.out.println(Arrays.toString(array)); // result
    }

    private void solution(int[] array, int firstNumber, int secondNumber) {
        int temporary = firstNumber; // this is only to save the value of the first number as it will be overwritten.
        array[firstNumber] = array[secondNumber];
        array[secondNumber] = temporary;
    }

    @Test
    public void testCountLetters() {
        String Input = "Hello World";
        char letterToFind = 'l';
        int AmountOfLetters = solutionforletter(Input, letterToFind);
        System.out.println(AmountOfLetters);
    }

    private int solutionforletter(String Input, char letterToFind) {
        int result = 0;
        for (char eachChar : Input.toCharArray()){
            if (eachChar== letterToFind) result++;
        }
        return result;
    }


}
