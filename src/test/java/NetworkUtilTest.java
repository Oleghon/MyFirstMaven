import org.junit.Test;

public class NetworkUtilTest {
    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThanOneSecond(){
        // здесь в скобках аннотации установлен лимит по времени на
        // выполнение метода
        NetworkUtils.getConnection();
    }
}
