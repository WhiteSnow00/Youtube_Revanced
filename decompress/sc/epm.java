import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epm extends ahbh implements ahcw
{
    public static final epm a;
    private static volatile ahdd d;
    public int b;
    public aevi c;
    
    static {
        ahbh.registerDefaultInstance((Class)epm.class, (ahbh)(a = new epm()));
    }
    
    private epm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = epm.d) == null) {
                    synchronized (epm.class) {
                        if (epm.d == null) {
                            epm.d = (ahdd)new ahba((ahbh)epm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return epm.a;
            }
            case 4: {
                return new ahaz((ahbh)epm.a);
            }
            case 3: {
                return new epm();
            }
            case 2: {
                return newMessageInfo((MessageLite)epm.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1009\u0002", new Object[] { "b", "c" });
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
