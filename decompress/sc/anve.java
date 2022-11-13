import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anve extends ahbh implements ahcw
{
    private static final anve a;
    private static volatile ahdd b;
    private int c;
    private long d;
    private String e;
    
    static {
        ahbh.registerDefaultInstance((Class)anve.class, (ahbh)(a = new anve()));
    }
    
    private anve() {
        this.e = "";
    }
    
    public static anvd a() {
        return (anvd)anve.a.createBuilder();
    }
    
    static anve b() {
        return anve.a;
    }
    
    public static void c(final anve anve, final long n) {
        anve.f(n);
    }
    
    public static void d(final anve anve, final String s) {
        anve.e(s);
    }
    
    private void e(final String e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void f(final long d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anve.b) == null) {
                    synchronized (anve.class) {
                        if (anve.b == null) {
                            anve.b = (ahdd)new ahba((ahbh)anve.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anve.a;
            }
            case 4: {
                return new anvd();
            }
            case 3: {
                return new anve();
            }
            case 2: {
                return newMessageInfo((MessageLite)anve.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
