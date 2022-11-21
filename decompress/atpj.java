import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

// 
// Decompiled by Procyon v0.6.0
// 

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface atpj {
    int a() default 1;
    
    String b() default "";
    
    String c() default "";
    
    String d() default "";
    
    int[] e() default {};
}
