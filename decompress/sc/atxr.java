import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxr extends ahbh implements ahcw
{
    public static final atxr a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)atxr.class, (ahbh)(a = new atxr()));
    }
    
    private atxr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = atxr.d) == null) {
                    synchronized (atxr.class) {
                        if (atxr.d == null) {
                            atxr.d = (ahdd)new ahba((ahbh)atxr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return atxr.a;
            }
            case 4: {
                return new ahaz((ahbh)atxr.a);
            }
            case 3: {
                return new atxr();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
