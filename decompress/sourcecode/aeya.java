import java.security.SecureRandom;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeya
{
    public static final Random a;
    public static final SecureRandom b;
    public static final ThreadLocal c;
    
    static {
        a = new aexy();
        b = a();
        new aexz();
        c = new aexx();
    }
    
    public static SecureRandom a() {
        final SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
