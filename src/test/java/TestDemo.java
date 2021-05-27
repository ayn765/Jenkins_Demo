import org.testng.annotations.Test;

public class TestDemo extends Base{
    @Test
    public void test(){
        String title = driver.getTitle();
        System.out.println(title);

    }
}
