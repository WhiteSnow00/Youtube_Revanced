import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxp extends ahbh implements ahcw
{
    public static final atxp a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)atxp.class, (ahbh)(a = new atxp()));
    }
    
    private atxp() {
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = atxp.b) == null) {
                    synchronized (atxp.class) {
                        if (atxp.b == null) {
                            atxp.b = (ahdd)new ahba((ahbh)atxp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return atxp.a;
            }
            case 4: {
                return new ahaz((ahbh)atxp.a);
            }
            case 3: {
                return new atxp();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxp.a, "\u0001\u0000", (Object[])null);
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
