package lou.study.letcode.string.simple;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryAddTest {

    @Test
    public void addBinary() {
        BinaryAdd ba = new BinaryAdd();
        Assert.assertEquals("10101", ba.addBinary("1010", "1011"));
        Assert.assertEquals("100", ba.addBinary("11", "1"));
    }

    @Test
    public void addBinary1() {
        BinaryAdd ba = new BinaryAdd();
        Assert.assertEquals("110110", ba.addBinary("100", "110010"));
    }
}