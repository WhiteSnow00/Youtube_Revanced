import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqi extends ahbh implements ahcw
{
    private static final apqi a;
    private static volatile ahdd b;
    private int c;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)apqi.class, (ahbh)(a = new apqi()));
    }
    
    private apqi() {
    }
    
    public static apqh a() {
        return (apqh)apqi.a.createBuilder();
    }
    
    static apqi b() {
        return apqi.a;
    }
    
    public static void c(final apqi apqi, final int n) {
        apqi.d(n);
    }
    
    private void d(final int d) {
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
                if ((b = apqi.b) == null) {
                    synchronized (apqi.class) {
                        if (apqi.b == null) {
                            apqi.b = (ahdd)new ahba((ahbh)apqi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqi.a;
            }
            case 4: {
                return new apqh();
            }
            case 3: {
                return new apqi();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "c", "d" });
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
