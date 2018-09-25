package cn.liuxingwei.spring.mvc.maven.annocation;

public @interface Testanno {
    String source() default "hello";
    int resource() default 10;
}
