package ch.zhaw.iwi.devops.Test_Corina_v01;

import org.junit.Assert;
import org.junit.Test;

public class RomanConverterTest {

   
    @Test
    public void convertertTest1() {

        Test_Corina_v01 abc = new Test_Corina_v01();
        Assert.assertEquals("I", abc.toRoman(1));

    }
}