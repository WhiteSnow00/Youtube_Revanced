import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alda extends ahbh implements ahcw
{
    public static final alda a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)alda.class, (ahbh)(a = new alda()));
    }
    
    private alda() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = alda.d) == null) {
                    synchronized (alda.class) {
                        if (alda.d == null) {
                            alda.d = (ahdd)new ahba((ahbh)alda.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alda.a;
            }
            case 4: {
                return new ahaz((ahbh)alda.a);
            }
            case 3: {
                return new alda();
            }
            case 2: {
                return newMessageInfo((MessageLite)alda.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", akwi.r });
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
