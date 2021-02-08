import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException() {
        // если в тесте ожидается выброс исключения
        // это должно быть указанно в скобках аннотации
        //(expected(условие-исключение) = ArithmeticException.class(вид и место где будет искл.))
        MyMath.divide(1, 0);
    }
}
