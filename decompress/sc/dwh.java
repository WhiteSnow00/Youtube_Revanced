import com.facebook.yoga.YogaNative;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwh
{
    public static volatile dwg a;
    public static volatile dwf b;
    public static final egw c;
    
    static {
        final egw c2 = new egw((byte[])null);
        YogaNative.jni_YGConfigSetUseWebDefaultsJNI(c2.a, true);
        c = c2;
    }
}
