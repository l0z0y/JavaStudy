package annotation.metaAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author li'zi'yao
 */
@Target({ElementType.METHOD,ElementType.FIELD}) // 元注解 只能注解方法和成员变量
@Retention(RetentionPolicy.RUNTIME) // 一直活着，在运行阶段这个注解也不消失
public @interface MyTest {
}
