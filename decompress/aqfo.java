import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfo extends ahbh implements ahcw
{
    public static final aqfo a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqfo.class, (ahbh)(a = new aqfo()));
    }
    
    private aqfo() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqfo.d) == null) {
                    synchronized (aqfo.class) {
                        if (aqfo.d == null) {
                            aqfo.d = (ahdd)new ahba((ahbh)aqfo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqfo.a;
            }
            case 4: {
                return new ahaz((ahbh)aqfo.a);
            }
            case 3: {
                return new aqfo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aqcl.m });
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
