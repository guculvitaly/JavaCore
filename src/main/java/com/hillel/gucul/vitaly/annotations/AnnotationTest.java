package com.hillel.gucul.vitaly.annotations;

/**
 * Created by insomnia on 23.07.17.
 */
@TestInfo(
        priority = TestInfo.Priority.HIGHT,
        createdBy = "vetal",
        tags = {"sales", "test"}
)
public class AnnotationTest {

    @Test
    void testA(){
        if (true)
            throw new RuntimeException("This test always failed");
    }

    @Test(enabled = false)
    void testB(){
        if (false)
            throw new RuntimeException("This test always passed");
    }

    @Test(enabled = true)
    void testC(){
        if (10 > 1){
            //do nothing, this test always passed
        }
    }
}
