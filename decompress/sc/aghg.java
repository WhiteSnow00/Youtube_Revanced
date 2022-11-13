import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aghg extends ahbh implements ahcw
{
    private static final aghg a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    
    static {
        ahbh.registerDefaultInstance((Class)aghg.class, (ahbh)(a = new aghg()));
    }
    
    private aghg() {
    }
    
    public static aghf a() {
        return (aghf)aghg.a.createBuilder();
    }
    
    static aghg b() {
        return aghg.a;
    }
    
    public static void c(final aghg aghg, final int n) {
        aghg.p(n);
    }
    
    public static void d(final aghg aghg, final boolean b) {
        aghg.m(b);
    }
    
    public static void e(final aghg aghg, final aghd aghd) {
        aghg.l(aghd);
    }
    
    public static void f(final aghg aghg, final int n) {
        aghg.n(n);
    }
    
    public static void g(final aghg aghg, final int n) {
        aghg.k(n);
    }
    
    public static void h(final aghg aghg, final int n) {
        aghg.q(n);
    }
    
    public static void i(final aghg aghg, final int n) {
        aghg.o(n);
    }
    
    private void k(final int h) {
        this.c |= 0x10;
        this.h = h;
    }
    
    private void l(final aghd aghd) {
        this.f = aghd.f;
        this.c |= 0x4;
    }
    
    private void m(final boolean e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void n(final int g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void o(final int j) {
        this.c |= 0x40;
        this.j = j;
    }
    
    private void p(final int d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void q(final int i) {
        this.c |= 0x20;
        this.i = i;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aghg.b) == null) {
                    synchronized (aghg.class) {
                        if (aghg.b == null) {
                            aghg.b = (ahdd)new ahba((ahbh)aghg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aghg.a;
            }
            case 4: {
                return new aghf();
            }
            case 3: {
                return new aghg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aghg.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u1007\u0001\u0003\u100c\u0002\u0004\u100b\u0003\u0005\u100b\u0004\u0006\u100b\u0005\u0007\u100b\u0006", new Object[] { "c", "d", "e", "f", aghd.b(), "g", "h", "i", "j" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public boolean j() {
        return (this.c & 0x10) != 0x0;
    }
}
