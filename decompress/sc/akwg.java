import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwg extends ahbh implements ahcw
{
    public static final akwg a;
    private static volatile ahdd d;
    public int b;
    public amvc c;
    
    static {
        ahbh.registerDefaultInstance((Class)akwg.class, (ahbh)(a = new akwg()));
    }
    
    private akwg() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = akwg.d) == null) {
                    synchronized (akwg.class) {
                        if (akwg.d == null) {
                            akwg.d = (ahdd)new ahba((ahbh)akwg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akwg.a;
            }
            case 4: {
                return new ahaz((ahbh)akwg.a);
            }
            case 3: {
                return new akwg();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwg.a, "\u0001\u0001\u0000\u0001\ue359\u1890\ue359\u1890\u0001\u0000\u0000\u0000\ue359\u1890\u1009\u0000", new Object[] { "b", "c" });
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
