import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqze extends ahbh implements ahcw
{
    public static final aqze a;
    private static volatile ahdd d;
    public int b;
    public aqxx c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqze.class, (ahbh)(a = new aqze()));
    }
    
    private aqze() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqze.d) == null) {
                    synchronized (aqze.class) {
                        if (aqze.d == null) {
                            aqze.d = (ahdd)new ahba((ahbh)aqze.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqze.a;
            }
            case 4: {
                return new ahaz((ahbh)aqze.a);
            }
            case 3: {
                return new aqze();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqze.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
