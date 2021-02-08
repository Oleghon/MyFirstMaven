
import org.junit.*;

public class Vector2DTest {

    private final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeClass
    public static void createNewVector() {
        // метод с аннотацией @beforeClass будет выполнятся перед
        // началом работы класса
        //методы с аннотацией @beforeClass и @afterClass должны быть
        // static также как и переменные использованые в таких методах

        v1 = new Vector2D();  // action
    }

    @Test
    public void newVectorShouldHaveZeroLength() {

        //assertion( утверждение )
        //1e-9 = 0.000 000 0001
        Assert.assertEquals(0, v1.length(), EPS);
        //Assert - класс-проверка. Имеет методы проверки на равенство,
        // большее меньшее, правда/ложь и т.д
        // метод assertEquals принимает на ввод три аргумента
        // (объект сравнения 1,объект сравнения 2, погрешность равенства)
        //проверка тестового метода провалится если тест не пройден
    }

    @Test
    public void newVectorShouldHaveZeroXAndZeroY() {
        //тестовые методы помечаются аннотацией @Test
        //в названии метода должно быть слово "should"

        Assert.assertEquals(0, v1.getX(), EPS);

        // для улучшения качества проверки методов,  проверки лучше
        //делать в отдельных тестовых методах
        Assert.assertEquals(0, v1.getY(), EPS);

    }

}
