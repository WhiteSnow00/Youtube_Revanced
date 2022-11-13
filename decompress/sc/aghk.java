import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aghk extends ahbh implements ahcw
{
    private static final aghk a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    
    static {
        ahbh.registerDefaultInstance((Class)aghk.class, (ahbh)(a = new aghk()));
    }
    
    private aghk() {
    }
    
    public static aghj a() {
        return (aghj)aghk.a.createBuilder();
    }
    
    static aghk b() {
        return aghk.a;
    }
    
    public static void c(final aghk aghk, final int n) {
        aghk.q(n);
    }
    
    public static void d(final aghk aghk, final int n) {
        aghk.m(n);
    }
    
    public static void e(final aghk aghk, final int n) {
        aghk.o(n);
    }
    
    public static void f(final aghk aghk, final int n) {
        aghk.p(n);
    }
    
    public static void g(final aghk aghk, final int n) {
        aghk.k(n);
    }
    
    public static void h(final aghk aghk, final int n) {
        aghk.n(n);
    }
    
    public static void i(final aghk aghk, final int n) {
        aghk.r(n);
    }
    
    public static void j(final aghk aghk, final int n) {
        aghk.l(n);
    }
    
    private void k(final int h) {
        this.c |= 0x10;
        this.h = h;
    }
    
    private void l(final int k) {
        this.c |= 0x80;
        this.k = k;
    }
    
    private void m(final int e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void n(final int i) {
        this.c |= 0x20;
        this.i = i;
    }
    
    private void o(final int f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void p(final int g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void q(final int d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void r(final int j) {
        this.c |= 0x40;
        this.j = j;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aghk.b) == null) {
                    synchronized (aghk.class) {
                        if (aghk.b == null) {
                            aghk.b = (ahdd)new ahba((ahbh)aghk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aghk.a;
            }
            case 4: {
                return new aghj();
            }
            case 3: {
                return new aghk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aghk.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u100b\u0002\u0004\u100b\u0003\u0005\u100b\u0004\u0006\u100b\u0005\u0007\u100b\u0006\b\u100b\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
