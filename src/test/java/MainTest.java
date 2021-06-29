import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test_Given_When_then_WelcomeMassage(){
        //arrange
        //act
        String actual = Main.GetMassage();
        //assert
        Assertions.assertEquals("hello Rot13", actual);
    }
}
