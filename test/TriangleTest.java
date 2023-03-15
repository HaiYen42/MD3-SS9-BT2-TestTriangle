import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void triangleClassifier() {
        int a=5;
        int b=1;
        int c=1;

        String result = Triangle.TriangleClassifier(a,b, c);
        String expected= "Ko phải là tam giác";
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("Test tam giác đều")
    void triangleClassifier1(){
        int a=3;
        int b=3;
        int c=3;

        String result= Triangle.TriangleClassifier(a,b,c);
        String expected= "Tam giác đều";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Tam giác cân")
    void triangleClassifier2(){
        int a=2;
        int b=2;
        int c=1;

        String result= Triangle.TriangleClassifier(a, b, c);
        String expected= "Tam giác cân";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Test tam giác thường")
    void triangleClassifier3(){
        int a=3;
        int b=4;
        int c=5;

        String result= Triangle.TriangleClassifier(a, b, c);
        String expected= "Tam giác thường";
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("Ko phải tam giác")
    void triangleClassifier4(){
        int a=0;
        int b=1;
        int c=1;

        String result = Triangle.TriangleClassifier(a, b, c);
        String expected= "Ko phải là tam giác";
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Ko phải là tam giác")
    void triangleClassifier5(){
        int a=-1;
        int b=2;
        int c= 1;

        String result = Triangle.TriangleClassifier(a, b,c);
        String expected= "Ko phải là tam giác";
        assertEquals(expected, result);
    }
}