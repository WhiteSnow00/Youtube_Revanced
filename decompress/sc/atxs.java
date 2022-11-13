import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxs extends ahbh implements ahcw
{
    public static final atxs a;
    private static volatile ahdd d;
    public int b;
    public atxq c;
    
    static {
        ahbh.registerDefaultInstance((Class)atxs.class, (ahbh)(a = new atxs()));
    }
    
    private atxs() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = atxs.d) == null) {
                    synchronized (atxs.class) {
                        if (atxs.d == null) {
                            atxs.d = (ahdd)new ahba((ahbh)atxs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return atxs.a;
            }
            case 4: {
                return new ahaz((ahbh)atxs.a);
            }
            case 3: {
                return new atxs();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxs.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
