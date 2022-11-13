import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjr extends ahbh implements ahcw
{
    private static final amjr a;
    private static volatile ahdd b;
    private int c;
    private String d;
    private String e;
    private String f;
    
    static {
        ahbh.registerDefaultInstance((Class)amjr.class, (ahbh)(a = new amjr()));
    }
    
    private amjr() {
        this.d = "";
        this.e = "";
        this.f = "";
    }
    
    public static amjq a() {
        return (amjq)amjr.a.createBuilder();
    }
    
    static amjr b() {
        return amjr.a;
    }
    
    public static void c(final amjr amjr, final String s) {
        amjr.e(s);
    }
    
    public static void d(final amjr amjr, final String s) {
        amjr.f(s);
    }
    
    private void e(final String d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void f(final String e) {
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
                if ((b = amjr.b) == null) {
                    synchronized (amjr.class) {
                        if (amjr.b == null) {
                            amjr.b = (ahdd)new ahba((ahbh)amjr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amjr.a;
            }
            case 4: {
                return new amjq();
            }
            case 3: {
                return new amjr();
            }
            case 2: {
                return newMessageInfo((MessageLite)amjr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
