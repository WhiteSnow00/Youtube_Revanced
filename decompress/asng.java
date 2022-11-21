// 
// Decompiled by Procyon v0.6.0
// 

public final class asng
{
    public static final asmf a;
    
    static {
        a = (asmf)new lhd(3);
    }
    
    public static boolean a(final Object o, final Object o2) {
        boolean b = true;
        if (o != o2) {
            if (o != null) {
                if (!o.equals(o2)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public static void b(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
    
    public static void c(final int n, final String s) {
        if (n > 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" > 0 required but it was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
}
