import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonThreeTest {

    @Test
    public void test1() {
        String textFile="t1.txt";
        List<String> text1 = new ArrayList<>(Arrays.asList(System.getProperty("user.dir")+"/src/test/resources/"+textFile));
        //aa aa aa aa bb bb bb
        //aa aa aa
        //aa aa aa
        //aa aa bb
        //aa bb bb
        //bb bb bb

        List<String> expected = new ArrayList<>(Arrays.asList("2 - aa aa aa","1 - bb bb bb", "1 - aa bb bb", "1 - aa aa bb"));
        List<String> actual = CommonThree.commonThree(text1);

        System.out.println(expected);
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String textFile="t2.txt";
        List<String> text1 = new ArrayList<>(Arrays.asList(System.getProperty("user.dir")+"/src/test/resources/"+textFile));
        //1 1 1, 1 1 1, 1 1 1, 1 1 1, 1 1 1
        //1 1 2, 1 1 2
        //1 2 2, 1 2 2
        //2 2 2, 2 2 2
        //2 2 1, 2 2 1
        //2 1 1, 2 1 1

        List<String> expected = new ArrayList<>(Arrays.asList("5 - 1 1 1","2 - 1 2 2", "2 - 1 1 2", "2 - 2 2 2", "2 - 2 2 1", "2 - 2 1 1"));
        List<String> actual = CommonThree.commonThree(text1);

        System.out.println(expected);
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String textFile="t3.txt";
        List<String> text1 = new ArrayList<>(Arrays.asList(System.getProperty("user.dir")+"/src/test/resources/"+textFile));
        //aa! @aa, aa. !aa bb? bb@ bb$
        //aa aa aa
        //aa aa aa
        //aa aa bb
        //aa bb bb
        //bb bb bb

        List<String> expected = new ArrayList<>(Arrays.asList("2 - aa aa aa","1 - bb bb bb", "1 - aa bb bb", "1 - aa aa bb"));
        List<String> actual = CommonThree.commonThree(text1);

        System.out.println(expected);
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {

        List<String> text1 = new ArrayList<>(Arrays.asList(
                System.getProperty("user.dir")+"/src/test/resources/pg2009.txt",
                System.getProperty("user.dir")+"/src/test/resources/book1.txt",
                System.getProperty("user.dir")+"/src/test/resources/book2.txt",
                System.getProperty("user.dir")+"/src/test/resources/book3.txt",
                System.getProperty("user.dir")+"/src/test/resources/book4.txt",
                System.getProperty("user.dir")+"/src/test/resources/book5.txt"));

        List<String> expected = new ArrayList<>(Arrays.asList(
                "967 - of the same", "378 - the same species", "375 - conditions of life", "366 - in the same",
                "321 - of natural selection", "309 - from each other", "294 - species of the", "278 - on the other",
                "246 - the other hand", "239 - the case of", "236 - of the world", "232 - parts of the",
                "231 - some of the", "228 - the theory of", "210 - through natural selection", "207 - with respect to",
                "206 - one of the", "206 - it may be", "203 - in the case", "195 - the species of", "195 - the inhabitants of",
                "192 - of the species", "189 - that of the", "183 - forms of life", "183 - the same genus",
                "181 - individuals of the", "179 - the number of", "179 - the united states", "178 - part of the",
                "178 - as far as", "174 - and in the", "170 - those of the", "164 - would have been", "164 - at the same",
                "161 - the nature of", "159 - the principle of", "159 - to each other", "156 - it would be",
                "156 - on the same", "154 - more or less", "154 - to the same", "154 - nature of the", "154 - might have been",
                "153 - in this case", "151 - as in the", "149 - in regard to", "148 - in which the", "147 - a state of",
                "147 - it has been", "142 - the individuals of", "142 - to have been", "141 - nearly the same",
                "141 - each other in", "140 - the amount of", "139 - there is no", "139 - as well as", "139 - inhabitants of the",
                "138 - and on the", "138 - state of nature", "136 - and of the", "135 - are descended from",
                "135 - we can understand", "135 - from a common", "133 - to believe that", "133 - will have been",
                "131 - in a state", "129 - the conditions of", "129 - the same time", "129 - by natural selection",
                "127 - which have been", "127 - the same manner", "126 - that it is", "126 - it is not", "126 - we have seen",
                "126 - animals and plants", "125 - out of the", "123 - of the most", "123 - — on the",
                "123 - the project gutenberg", "121 - members of the", "120 - on the theory", "120 - in some degree",
                "120 - varieties of the", "120 - respect to the", "119 - belonging to the", "118 - each other and",
                "117 - it is that", "114 - theory of natural", "114 - could be given", "113 - of life and",
                "108 - the sterility of", "108 - the power of", "108 - the present day",
                "108 - project gutenbergtm electronic", "108 - species belonging to", "108 - the process of",
                "106 - reason to believe", "106 - we do not", "105 - in order to", "102 - the course of"
        ));

        List<String> actual = CommonThree.commonThree(text1);

        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }
}
