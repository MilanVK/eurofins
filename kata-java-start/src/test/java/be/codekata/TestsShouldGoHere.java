package be.codekata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestsShouldGoHere {

    @Test
    public void failingTest(){
        assertThat(false,equalTo(true));
    }

    @Test
    public void passingTest(){
        assertThat(true,equalTo(true));
    }
}
