import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ayw
{
    public static final int a = 0;
    private static final HashSet b;
    private static String c;
    
    static {
        b = new HashSet();
        ayw.c = "media3.common";
    }
    
    public static void a(final String s) {
        synchronized (ayw.class) {
            if (ayw.b.add(s)) {
                final String c = ayw.c;
                final StringBuilder sb = new StringBuilder();
                sb.append(c);
                sb.append(", ");
                sb.append(s);
                ayw.c = sb.toString();
            }
        }
    }
}
