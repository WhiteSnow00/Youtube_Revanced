import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrh extends ahbh implements ahcw
{
    public static final agrh a;
    private static volatile ahdd d;
    public int b;
    public long c;
    
    static {
        ahbh.registerDefaultInstance((Class)agrh.class, (ahbh)(a = new agrh()));
    }
    
    private agrh() {
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = agrh.d) == null) {
                    synchronized (agrh.class) {
                        if (agrh.d == null) {
                            agrh.d = (ahdd)new ahba((ahbh)agrh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agrh.a;
            }
            case 4: {
                return new ahaz((ahbh)agrh.a);
            }
            case 3: {
                return new agrh();
            }
            case 2: {
                return newMessageInfo((MessageLite)agrh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
