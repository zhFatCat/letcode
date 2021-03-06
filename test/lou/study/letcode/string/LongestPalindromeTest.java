package lou.study.letcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {

    @Test
    public void longestPalindrome() {
        LongestPalindrome lp = new LongestPalindrome();
        Assert.assertEquals("bab", lp.longestPalindrome("babad"));
        Assert.assertEquals("s", lp.longestPalindrome("s"));
        Assert.assertEquals("ddtattarrattatdd", lp.longestPalindrome("babaddtattarrattatddetartrateedredividerb"));
        Assert.assertEquals("dtzztd", lp.longestPalindrome("kztakrekvefgchersuoiuatzlmwynzjhdqqftjcqmntoyck" +
                "qfawikkdrnfgbwtdpbkymvwoumurjdzygyzsbmwzpcxcdmmpwzmeibligwiiqbecxwyxigikoewwrczkanwwqukszsbjukzumzladrvjefpegyicsg" +
                "ctdvldetuegxwihdtitqrdmygdrsweahfrepdcudvyvrggbkthztxwicyzazjyeztytwiyybqdsczozvtegodacdokczfmwqfmyuixbeeqluqcqwxpyrkpf" +
                "cdosttzooykpvdykfxulttvvwnzftndvhsvpgrgdzsvfxdtzztdiswgwxzvbpsjlizlfrlgvlnwbjwbujafjaedivvgnbgwcdbzbdbprqrflfhahsvlcekeyq" +
                "ueyxjfetkxpapbeejoxwxlgepmxzowldsmqllpzeymakcshfzkvyykwljeltutdmrhxcbzizihzinywggzjctzasvefcxmhnusdvlderconvaisaetcdldeveee" +
                "mhugipfzbhrwidcjpfrumshbdofchpgcsbkvaexfmenpsuodatxjavoszcitjewflejjmsuvyuyrkumednsfkbgvbqxfphfqeqozcnabmtedffvzwbgbzbfydiyae" +
                "voqtfmzxaujdydtjftapkpdhnbmrylcibzuqqynvnsihmyxdcrfftkuoymzoxpnashaderlosnkxbhamkkxfhwjsyehkmblhppbyspmcwuoguptliashefdklokj" +
                "pggfiixozsrlwmeksmzdcvipgkwxwynzsvxnqtchgwwadqybkguscfyrbyxudzrxacoplmcqcsmkraimfwbauvytkxdnglwfuvehpxd"));
    }
}