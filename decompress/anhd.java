import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhd extends ahbh implements ahcw
{
    public static final anhd a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)anhd.class, (ahbh)(a = new anhd()));
    }
    
    private anhd() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anhd.e) == null) {
                    synchronized (anhd.class) {
                        if (anhd.e == null) {
                            anhd.e = (ahdd)new ahba((ahbh)anhd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anhd.a;
            }
            case 4: {
                return new ahaz((ahbh)anhd.a);
            }
            case 3: {
                return new anhd();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "f", "b", "c", "d" });
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
