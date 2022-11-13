import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmm extends ahbh implements ahcw
{
    private static final aqmm a;
    private static volatile ahdd b;
    private int c;
    private aqmf d;
    private String e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmm.class, (ahbh)(a = new aqmm()));
    }
    
    private aqmm() {
        this.e = "";
    }
    
    public static aqml a() {
        return (aqml)aqmm.a.createBuilder();
    }
    
    static aqmm b() {
        return aqmm.a;
    }
    
    public static void c(final aqmm aqmm, final String s) {
        aqmm.f(s);
    }
    
    public static void d(final aqmm aqmm, final aqmf aqmf) {
        aqmm.e(aqmf);
    }
    
    private void e(final aqmf d) {
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
                if ((b = aqmm.b) == null) {
                    synchronized (aqmm.class) {
                        if (aqmm.b == null) {
                            aqmm.b = (ahdd)new ahba((ahbh)aqmm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqmm.a;
            }
            case 4: {
                return new aqml();
            }
            case 3: {
                return new aqmm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
