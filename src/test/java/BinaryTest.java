import main.java.math_operations.Binary;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class BinaryTest {

    private Binary binary;
    private int searchresult;

    @Given("get new binarySearch")
    public void initSearch() {
        binary = new Binary();
    }

    @When("enter a $searchedValue, $sortedArray, $beginIndex, $endIndex")
    public void theStockIsTradedAt(int searchValue, int[] arr, int begin, int end) {
        searchresult = binary.number(searchValue, arr, begin, end);
    }

    @Then("I get value's index of array")
    public void theAlertStatusShouldBe(int expectedResult) {
        //ensureThat(searchresult, equalTo(expectedResult));
    }

}
