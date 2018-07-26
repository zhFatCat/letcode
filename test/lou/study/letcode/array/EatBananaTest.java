package lou.study.letcode.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EatBananaTest {
    EatBanana eb = new EatBanana();

    @Test
    public void minEatingSpeed() {
        Assert.assertEquals(23, eb.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }

    @Test
    public void minEatingSpeedNumOverflow() {
        Assert.assertEquals(14, eb.minEatingSpeed(new int[]{332484035, 524908576, 855865114, 632922376, 222257295,
                690155293, 112677673, 679580077, 337406589, 290818316, 877337160, 901728858, 679284947, 688210097,
                692137887, 718203285, 629455728, 941802184}, 823855818));
    }
    @Test
    public void minEatingSpeed_HbiggerthanMax() {
        Assert.assertEquals(8, eb.minEatingSpeed(new int[]{831235932, 437082868, 576572631, 529869153, 55330371,
                511060323, 581115062, 931692072, 600856556, 519045509, 504164418, 431105822, 580257183}, 964065706));
    }
    @Test
    public void minEatingSpeed_one() {
        Assert.assertEquals(1, eb.minEatingSpeed(new int[]{312884470}, 968709470));
    }
}