package techproed.day08_BeforeClassAfterClass_Assertion;

import org.junit.*;

public class C01_BeforeClassAfterClass {
    /*
    @BeforeClass ve @AfterClass methodlari static olmak zorundadir
     */

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("BeforeClass methodu her classtan önce bir kez çalışır.");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("AfterClass methodu her classtan sonra bir kez çalışır.");
    }

    @Before
    public void setUp() throws Exception{
        System.out.println("Before(setUp) methodu her methoddan önce bir kez çalışır");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After(tearDown) methodu her methoddan sonra bir kez çalışır");

    }

    @Test
    public void test01() {
        System.out.println("Test01 methodu çalıştı");
    }
    @Test
    public void test02() {
        System.out.println("Test02 methodu çalıştı");
    }
    @Test
    public void test03() {
        System.out.println("Test03 methodu çalıştı");

    }
}
