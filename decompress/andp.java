import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andp extends ahbh implements ahcw
{
    private static final andp a;
    private static volatile ahdd b;
    private int c;
    private String d;
    private float e;
    private float f;
    
    static {
        ahbh.registerDefaultInstance((Class)andp.class, (ahbh)(a = new andp()));
    }
    
    private andp() {
        this.d = "";
    }
    
    public static ando a() {
        return (ando)andp.a.createBuilder();
    }
    
    static andp b() {
        return andp.a;
    }
    
    public static void c(final andp andp, final String s) {
        andp.f(s);
    }
    
    public static void d(final andp andp, final float n) {
        andp.h(n);
    }
    
    public static void e(final andp andp, final float n) {
        andp.g(n);
    }
    
    private void f(final String d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void g(final float f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void h(final float e) {
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
                if ((b = andp.b) == null) {
                    synchronized (andp.class) {
                        if (andp.b == null) {
                            andp.b = (ahdd)new ahba((ahbh)andp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return andp.a;
            }
            case 4: {
                return new ando();
            }
            case 3: {
                return new andp();
            }
            case 2: {
                return newMessageInfo((MessageLite)andp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1001\u0001\u0003\u1001\u0002", new Object[] { "c", "d", "e", "f" });
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
