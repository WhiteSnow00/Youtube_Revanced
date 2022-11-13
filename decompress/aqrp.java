import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrp extends ahbh implements ahcw
{
    public static final aqrp a;
    private static volatile ahdd c;
    public int b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrp.class, (ahbh)(a = new aqrp()));
    }
    
    private aqrp() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqrp.c) == null) {
                    synchronized (aqrp.class) {
                        if (aqrp.c == null) {
                            aqrp.c = (ahdd)new ahba((ahbh)aqrp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqrp.a;
            }
            case 4: {
                return new ahaz((ahbh)aqrp.a);
            }
            case 3: {
                return new aqrp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", ames.a() });
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
