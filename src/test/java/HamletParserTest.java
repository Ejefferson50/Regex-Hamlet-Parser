import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {


    @Test
    public void testChangeHamletToLeon() {
        //Given
        HamletParser hamletParser = new HamletParser();
        String input = "Hi my name is Hamlet! Hamlet is my name!";
        String expected = "Hi my name is Leon! Leon is my name!";

        //When
        String actual = hamletParser.replaceHamletWithLeon(input);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testChangeHamletToLeon2() {
        //Given
        HamletParser hamletParser = new HamletParser();
        String input = "jasdlkasldasljHamasjdoasjdoaHamlet";
        String expected = "jasdlkasldasljHamasjdoasjdoaLeon";

        //When
        String actual = hamletParser.replaceHamletWithLeon(input);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testChangeHoratioToTariq() {
        //Given
        HamletParser hamletParser = new HamletParser();
        String input = "Hi my name is Horatio! Horatio is my name!";
        String expected = "Hi my name is Tariq! Tariq is my name!";

        //When
        String actual = hamletParser.replaceHoratioWithTariq(input);

        //Then
        Assert.assertEquals(expected,actual);
    }

}