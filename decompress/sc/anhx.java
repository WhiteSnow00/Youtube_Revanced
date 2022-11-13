import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhx extends ahbh implements ahcw
{
    public static final anhx a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)anhx.class, (ahbh)(a = new anhx()));
    }
    
    private anhx() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anhx.d) == null) {
                    synchronized (anhx.class) {
                        if (anhx.d == null) {
                            anhx.d = (ahdd)new ahba((ahbh)anhx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anhx.a;
            }
            case 4: {
                return new ahaz((ahbh)anhx.a);
            }
            case 3: {
                return new anhx();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
