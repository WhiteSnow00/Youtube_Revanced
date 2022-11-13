import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apse extends ahbh implements ahcw
{
    public static final apse a;
    private static volatile ahdd d;
    public apsd b;
    public apsc c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)apse.class, (ahbh)(a = new apse()));
    }
    
    private apse() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = apse.d) == null) {
                    synchronized (apse.class) {
                        if (apse.d == null) {
                            apse.d = (ahdd)new ahba((ahbh)apse.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apse.a;
            }
            case 4: {
                return new ahaz((ahbh)apse.a);
            }
            case 3: {
                return new apse();
            }
            case 2: {
                return newMessageInfo((MessageLite)apse.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
