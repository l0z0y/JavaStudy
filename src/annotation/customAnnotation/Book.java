package annotation.customAnnotation;

/**
 * @author li'zi'yao
 */
public @interface Book {
    String value(); // 特殊属性
    double price() ;
    //double price() default 9.9;
}
