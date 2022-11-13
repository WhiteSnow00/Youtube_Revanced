import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexy extends ahbh implements ahcw
{
    private static final aexy a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private long e;
    
    static {
        ahbh.registerDefaultInstance((Class)aexy.class, (ahbh)(a = new aexy()));
    }
    
    private aexy() {
    }
    
    public static aexw a() {
        return (aexw)aexy.a.createBuilder();
    }
    
    static aexy b() {
        return aexy.a;
    }
    
    public static void c(final aexy aexy, final aexx aexx) {
        aexy.f(aexx);
    }
    
    public static void d(final aexy aexy, final long n) {
        aexy.e(n);
    }
    
    private void e(final long e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void f(final aexx aexx) {
        this.d = aexx.p;
        this.c |= 0x1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aexy.b) == null) {
                    synchronized (aexy.class) {
                        if (aexy.b == null) {
                            aexy.b = (ahdd)new ahba((ahbh)aexy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aexy.a;
            }
            case 4: {
                return new aexw();
            }
            case 3: {
                return new aexy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aexy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001", new Object[] { "c", "d", aexx.b(), "e" });
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
