import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhy extends ahcz implements aheo
{
    private static final amhy a;
    private static volatile ahev b;
    private int c;
    private int d;
    private String e;
    private String f;
    
    static {
        ahcz.registerDefaultInstance(amhy.class, a = new amhy());
    }
    
    private amhy() {
        this.e = "";
        this.f = "";
    }
    
    public static amhx b() {
        return (amhx)amhy.a.createBuilder();
    }
    
    static amhy c() {
        return amhy.a;
    }
    
    public static amhy d() {
        return amhy.a;
    }
    
    public static void g(final amhy amhy, final String s) {
        amhy.l(s);
    }
    
    public static void h(final amhy amhy, final amhw amhw) {
        amhy.k(amhw);
    }
    
    public static void i(final amhy amhy, final String s) {
        amhy.j(s);
    }
    
    private void j(final String e) {
        e.getClass();
        this.c |= 0x2;
        this.e = e;
    }
    
    private void k(final amhw amhw) {
        this.d = amhw.E;
        this.c |= 0x1;
    }
    
    private void l(final String f) {
        f.getClass();
        this.c |= 0x4;
        this.f = f;
    }
    
    public amhw a() {
        amhw amhw;
        if ((amhw = amhw.b(this.d)) == null) {
            amhw = amhw.a;
        }
        return amhw;
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
                if ((b = amhy.b) == null) {
                    synchronized (amhy.class) {
                        if (amhy.b == null) {
                            amhy.b = (ahev)new ahcs((ahcz)amhy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amhy.a;
            }
            case 4: {
                return new amhx();
            }
            case 3: {
                return new amhy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amhy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "c", "d", amhw.a(), "e", "f" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public String e() {
        return this.e;
    }
    
    public String f() {
        return this.f;
    }
}
