import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxu extends ahbh implements ahcw
{
    public static final atxu a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)atxu.class, (ahbh)(a = new atxu()));
    }
    
    private atxu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = atxu.e) == null) {
                    synchronized (atxu.class) {
                        if (atxu.e == null) {
                            atxu.e = (ahdd)new ahba((ahbh)atxu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atxu.a;
            }
            case 4: {
                return new ahaz((ahbh)atxu.a);
            }
            case 3: {
                return new atxu();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
