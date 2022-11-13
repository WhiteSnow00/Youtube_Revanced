import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aleg extends ahbh implements ahcw
{
    public static final aleg a;
    private static volatile ahdd d;
    public int b;
    public long c;
    
    static {
        ahbh.registerDefaultInstance((Class)aleg.class, (ahbh)(a = new aleg()));
    }
    
    private aleg() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aleg.d) == null) {
                    synchronized (aleg.class) {
                        if (aleg.d == null) {
                            aleg.d = (ahdd)new ahba((ahbh)aleg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aleg.a;
            }
            case 4: {
                return new ahaz((ahbh)aleg.a);
            }
            case 3: {
                return new aleg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aleg.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005\u1002\u0000", new Object[] { "b", "c" });
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
