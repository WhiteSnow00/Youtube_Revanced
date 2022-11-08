import java.security.SecureRandom;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agej
{
    private static final ThreadLocal a;
    
    static {
        a = new agei();
    }
    
    public static byte[] a(final int n) {
        final byte[] array = new byte[n];
        agej.a.get().nextBytes(array);
        return array;
    }
}
