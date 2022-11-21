import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeuu implements aevl
{
    public static final aeuu a;
    public static final aeuu b;
    public static final aeuu c;
    public static final aeuu d;
    public static final aeuu e;
    public static final aeuu f;
    private final int g;
    
    static {
        f = new aeuu(5);
        e = new aeuu(4);
        d = new aeuu(3);
        c = new aeuu(2);
        b = new aeuu(1);
        a = new aeuu(0);
    }
    
    private aeuu(final int g) {
        this.g = g;
    }
    
    @Override
    public final void close() {
        final int g = this.g;
        if (g != 0) {
            if (g != 1 && g != 2) {
                if (g != 3) {
                    if (g != 4) {
                        aewp.b.add(aewp.d);
                        qem.t(aewp.e);
                        return;
                    }
                    final WeakHashMap a = aewp.a;
                }
                else {
                    aewp.k();
                }
            }
            return;
        }
        qem.r();
        aewp.n(null);
    }
}
