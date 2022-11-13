import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfb extends ahbh implements ahcw
{
    public static final anfb a;
    private static volatile ahdd d;
    public boolean b;
    public boolean c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)anfb.class, (ahbh)(a = new anfb()));
    }
    
    private anfb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anfb.d) == null) {
                    synchronized (anfb.class) {
                        if (anfb.d == null) {
                            anfb.d = (ahdd)new ahba((ahbh)anfb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anfb.a;
            }
            case 4: {
                return new ahaz((ahbh)anfb.a);
            }
            case 3: {
                return new anfb();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
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
