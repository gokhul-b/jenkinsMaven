package jenkinsTest.jenkins;
import org.testng.Assert;
import org.testng.annotations.Test;
public class JenkinsTest {
    @Test
    public void testAddition() {
        int result = 1 + 2;
        Assert.assertEquals(3, result);
    }
}
