import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohy extends ahcz implements aheo
{
    private static final aohy a;
    private static volatile ahev b;
    private int c;
    private int d;
    private Object e;
    private int f;
    private boolean g;
    
    static {
        ahcz.registerDefaultInstance(aohy.class, a = new aohy());
    }
    
    private aohy() {
        this.d = 0;
    }
    
    public static aohx a() {
        return (aohx)aohy.a.createBuilder();
    }
    
    static aohy b() {
        return aohy.a;
    }
    
    public static void c(final aohy aohy, final aoib aoib) {
        aohy.j(aoib);
    }
    
    public static void d(final aohy aohy, final aohu aohu) {
        aohy.g(aohu);
    }
    
    public static void e(final aohy aohy, final int n) {
        aohy.h(n);
    }
    
    public static void f(final aohy aohy, final boolean b) {
        aohy.i(b);
    }
    
    private void g(final aohu e) {
        e.getClass();
        this.e = e;
        this.d = 2;
    }
    
    private void h(final int f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void i(final boolean g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void j(final aoib e) {
        e.getClass();
        this.e = e;
        this.d = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aohy.b) == null) {
                    synchronized (aohy.class) {
                        if (aohy.b == null) {
                            aohy.b = (ahev)new ahcs((ahcz)aohy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aohy.a;
            }
            case 4: {
                return new aohx();
            }
            case 3: {
                return new aohy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aohy.a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u1004\u0002\u0004\u1007\u0003", new Object[] { "e", "d", "c", aoib.class, aohu.class, "f", "g" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
