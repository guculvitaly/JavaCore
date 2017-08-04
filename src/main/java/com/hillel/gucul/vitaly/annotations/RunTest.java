package com.hillel.gucul.vitaly.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by insomnia on 23.07.17.
 */
public class RunTest {

    public static void main(String[] args) throws Exception{

        System.out.println("Testing.....");

        int passed = 0, failed = 0, count = 0, ignore = 0;

        Class<AnnotationTest> obj = AnnotationTest.class;

        //Process @TesterInfo
        if (obj.isAnnotationPresent(TestInfo.class)) {

            Annotation annotation = obj.getAnnotation(TestInfo.class);
            TestInfo testerInfo = (TestInfo) annotation;

            System.out.printf("%nPriority :%s", testerInfo.priority());
            System.out.printf("%nCreatedBy :%s", testerInfo.createdBy());
            System.out.printf("%nTags :");

            int tagLenght = testerInfo.tags().length;
            for (String tag : testerInfo.tags()) {
                if (tagLenght > 1) {
                    System.out.print(tag + ", ");
                }else {
                    System.out.print(tag);
                }
                tagLenght--;
            }
            System.out.printf("%nLastModified : %s%n%n", testerInfo.lastModified());
        }

        //Process @Test
        for (Method method : obj.getDeclaredMethods()) {

            //if method is annotated with @Test
            if (method.isAnnotationPresent(Test.class)) {
                Annotation annotation = method.getAnnotation(Test.class);
                Test test = (Test) annotation;

                //if enabled = true (default)
                if (test.enabled()) {

                    try {
                        method.invoke(obj.newInstance());
                        System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
                        passed++;
                    } catch (Throwable ex) {
                        System.out.printf("%s - Test '%s - failed: %s %n", ++count, method.getName(), ex.getCause());
                        failed++;
                    }
                } else {
                    System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
                }
            }
        }
        System.out.printf("%nResult : Total : %d, Failed %d, Ignore %d%n", count, passed, failed, ignore);
    }
}
