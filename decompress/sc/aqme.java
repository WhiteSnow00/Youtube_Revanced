import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqme extends ahbh implements ahcw
{
    private static final aqme a;
    private static volatile ahdd b;
    private int c;
    private aqmf d;
    private String e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqme.class, (ahbh)(a = new aqme()));
    }
    
    private aqme() {
        this.e = "";
    }
    
    public static aqmd a() {
        return (aqmd)aqme.a.createBuilder();
    }
    
    static aqme b() {
        return aqme.a;
    }
    
    public static void c(final aqme aqme, final aqmf aqmf) {
        aqme.e(aqmf);
    }
    
    public static void d(final aqme aqme, final String s) {
        aqme.f(s);
    }
    
    private void e(final aqmf d) {
        d.getClass();
        this.d = d;
        this.c |= 0x1;
    }
    
    private void f(final String e) {
        e.getClass();
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
                if ((b = aqme.b) == null) {
                    synchronized (aqme.class) {
                        if (aqme.b == null) {
                            aqme.b = (ahdd)new ahba((ahbh)aqme.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqme.a;
            }
            case 4: {
                return new aqmd();
            }
            case 3: {
                return new aqme();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqme.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
