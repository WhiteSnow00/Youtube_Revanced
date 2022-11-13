import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arat extends ahbh implements ahcw
{
    public static final arat a;
    private static volatile ahdd d;
    public int b;
    public double c;
    
    static {
        ahbh.registerDefaultInstance((Class)arat.class, (ahbh)(a = new arat()));
    }
    
    private arat() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = arat.d) == null) {
                    synchronized (arat.class) {
                        if (arat.d == null) {
                            arat.d = (ahdd)new ahba((ahbh)arat.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return arat.a;
            }
            case 4: {
                return new ahaz((ahbh)arat.a);
            }
            case 3: {
                return new arat();
            }
            case 2: {
                return newMessageInfo((MessageLite)arat.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1000\u0000", new Object[] { "b", "c" });
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
