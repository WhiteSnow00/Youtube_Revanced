import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arac extends ahbh implements ahcw
{
    private static final arac a;
    private static volatile ahdd b;
    private int c;
    private long d;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)arac.class, (ahbh)(a = new arac()));
    }
    
    private arac() {
    }
    
    public static arab a() {
        return (arab)arac.a.createBuilder();
    }
    
    static arac b() {
        return arac.a;
    }
    
    public static void c(final arac arac, final long n) {
        arac.f(n);
    }
    
    public static void d(final arac arac, final int n) {
        arac.e(n);
    }
    
    private void e(final int e) {
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
                if ((b = arac.b) == null) {
                    synchronized (arac.class) {
                        if (arac.b == null) {
                            arac.b = (ahdd)new ahba((ahbh)arac.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arac.a;
            }
            case 4: {
                return new arab();
            }
            case 3: {
                return new arac();
            }
            case 2: {
                return newMessageInfo((MessageLite)arac.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1004\u0001", new Object[] { "c", "d", "e" });
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
