// 
// Decompiled by Procyon v0.6.0
// 

public final class cmv
{
    public static final Object a;
    public static volatile cmv b;
    
    static {
        a = new Object();
    }
    
    public static cmv a() {
        synchronized (cmv.a) {
            if (cmv.b == null) {
                cmv.b = new cmv();
            }
            return cmv.b;
        }
    }
    
    public static String b(final String s) {
        final StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (s.length() >= 20) {
            sb.append(s.substring(0, 20));
        }
        else {
            sb.append(s);
        }
        return sb.toString();
    }
}
