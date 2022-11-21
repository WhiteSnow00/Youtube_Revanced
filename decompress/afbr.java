import java.security.SecureRandom;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afbr
{
    public static final Random a;
    public static final SecureRandom b;
    public static final ThreadLocal c;
    
    static {
        a = new afbp();
        b = a();
        new afbq();
        c = new afbo();
    }
    
    public static SecureRandom a() {
        final SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
