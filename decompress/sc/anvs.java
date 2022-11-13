import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvs extends ahbh implements ahcw
{
    private static final anvs a;
    private static volatile ahdd b;
    private int c;
    private long d;
    private String e;
    private boolean f;
    
    static {
        ahbh.registerDefaultInstance((Class)anvs.class, (ahbh)(a = new anvs()));
    }
    
    private anvs() {
        this.e = "";
    }
    
    public static anvr a() {
        return (anvr)anvs.a.createBuilder();
    }
    
    static anvs b() {
        return anvs.a;
    }
    
    public static void c(final anvs anvs, final long n) {
        anvs.g(n);
    }
    
    public static void d(final anvs anvs, final String s) {
        anvs.h(s);
    }
    
    public static void e(final anvs anvs, final boolean b) {
        anvs.f(b);
    }
    
    private void f(final boolean f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void g(final long d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void h(final String e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anvs.b) == null) {
                    synchronized (anvs.class) {
                        if (anvs.b == null) {
                            anvs.b = (ahdd)new ahba((ahbh)anvs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anvs.a;
            }
            case 4: {
                return new anvr();
            }
            case 3: {
                return new anvs();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvs.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1007\u0002", new Object[] { "c", "d", "e", "f" });
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
