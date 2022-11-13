import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrf extends ahbh implements ahcw
{
    public static final alrf a;
    private static volatile ahdd d;
    public alrw b;
    public alrw c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)alrf.class, (ahbh)(a = new alrf()));
    }
    
    private alrf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = alrf.d) == null) {
                    synchronized (alrf.class) {
                        if (alrf.d == null) {
                            alrf.d = (ahdd)new ahba((ahbh)alrf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alrf.a;
            }
            case 4: {
                return new ahaz((ahbh)alrf.a);
            }
            case 3: {
                return new alrf();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
