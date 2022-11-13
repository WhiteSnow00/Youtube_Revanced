import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfn extends ahbh implements ahcw
{
    public static final aqfn a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqfn.class, (ahbh)(a = new aqfn()));
    }
    
    private aqfn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqfn.d) == null) {
                    synchronized (aqfn.class) {
                        if (aqfn.d == null) {
                            aqfn.d = (ahdd)new ahba((ahbh)aqfn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqfn.a;
            }
            case 4: {
                return new ahaz((ahbh)aqfn.a);
            }
            case 3: {
                return new aqfn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
