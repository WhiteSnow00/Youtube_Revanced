import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcz extends ahbh implements ahcw
{
    public static final aqcz a;
    private static volatile ahdd d;
    public int b;
    public ahdy c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcz.class, (ahbh)(a = new aqcz()));
    }
    
    private aqcz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqcz.d) == null) {
                    synchronized (aqcz.class) {
                        if (aqcz.d == null) {
                            aqcz.d = (ahdd)new ahba((ahbh)aqcz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqcz.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcz.a);
            }
            case 3: {
                return new aqcz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
