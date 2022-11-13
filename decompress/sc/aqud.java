import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqud extends ahbh implements ahcw
{
    public static final aqud a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqud.class, (ahbh)(a = new aqud()));
    }
    
    private aqud() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqud.d) == null) {
                    synchronized (aqud.class) {
                        if (aqud.d == null) {
                            aqud.d = (ahdd)new ahba((ahbh)aqud.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqud.a;
            }
            case 4: {
                return new ahaz((ahbh)aqud.a);
            }
            case 3: {
                return new aqud();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqud.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
