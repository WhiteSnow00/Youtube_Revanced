import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agul extends ahcz implements aheo
{
    private static final agul a;
    private static volatile ahev b;
    private int c;
    private int d;
    private Object e;
    private long f;
    private aguj g;
    private long h;
    
    static {
        ahcz.registerDefaultInstance(agul.class, a = new agul());
    }
    
    private agul() {
        this.d = 0;
    }
    
    public static aguk c() {
        return (aguk)agul.a.createBuilder();
    }
    
    static agul d() {
        return agul.a;
    }
    
    public static void e(final agul agul, final agus agus) {
        agul.q(agus);
    }
    
    public static void f(final agul agul, final agur agur) {
        agul.p(agur);
    }
    
    public static void g(final agul agul, final agum agum) {
        agul.n(agum);
    }
    
    public static void h(final agul agul, final long n) {
        agul.o(n);
    }
    
    public static void i(final agul agul, final aguj aguj) {
        agul.m(aguj);
    }
    
    public static void j(final agul agul, final long n) {
        agul.l(n);
    }
    
    private void l(final long h) {
        this.c |= 0x80;
        this.h = h;
    }
    
    private void m(final aguj g) {
        g.getClass();
        this.g = g;
        this.c |= 0x40;
    }
    
    private void n(final agum e) {
        e.getClass();
        this.e = e;
        this.d = 9;
    }
    
    private void o(final long f) {
        this.c |= 0x20;
        this.f = f;
    }
    
    private void p(final agur e) {
        e.getClass();
        this.e = e;
        this.d = 2;
    }
    
    private void q(final agus e) {
        e.getClass();
        this.e = e;
        this.d = 1;
    }
    
    public long a() {
        return this.f;
    }
    
    public aguj b() {
        aguj aguj;
        if ((aguj = this.g) == null) {
            aguj = aguj.a;
        }
        return aguj;
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
                if ((b = agul.b) == null) {
                    synchronized (agul.class) {
                        if (agul.b == null) {
                            agul.b = (ahev)new ahcs((ahcz)agul.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agul.a;
            }
            case 4: {
                return new aguk();
            }
            case 3: {
                return new agul();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agul.a, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u1002\u0005\u0004\u1009\u0006\u0005\u1002\u0007\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000", new Object[] { "e", "d", "c", agus.class, agur.class, "f", "g", "h", agud.class, ague.class, agum.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public boolean k() {
        return (this.c & 0x40) != 0x0;
    }
}
