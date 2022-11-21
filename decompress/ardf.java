import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardf extends ahcz implements aheo
{
    private static final ardf a;
    private static volatile ahev b;
    private int c;
    private int d;
    private ahhl e;
    private int f;
    private boolean g;
    
    static {
        ahcz.registerDefaultInstance(ardf.class, a = new ardf());
    }
    
    private ardf() {
    }
    
    public static arde a() {
        return (arde)ardf.a.createBuilder();
    }
    
    static ardf b() {
        return ardf.a;
    }
    
    public static void c(final ardf ardf, final ardg ardg) {
        ardf.j(ardg);
    }
    
    public static void d(final ardf ardf, final boolean b) {
        ardf.h(b);
    }
    
    public static void e(final ardf ardf, final int n) {
        ardf.g(n);
    }
    
    public static void f(final ardf ardf, final ahhl ahhl) {
        ardf.i(ahhl);
    }
    
    private void g(final int d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void h(final boolean g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void i(final ahhl e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void j(final ardg ardg) {
        this.f = ardg.f;
        this.c |= 0x4;
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
                if ((b = ardf.b) == null) {
                    synchronized (ardf.class) {
                        if (ardf.b == null) {
                            ardf.b = (ahev)new ahcs((ahcz)ardf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ardf.a;
            }
            case 4: {
                return new arde();
            }
            case 3: {
                return new ardf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardf.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u100c\u0002\u0004\u1007\u0003", new Object[] { "c", "d", "e", "f", ardg.a(), "g" });
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
