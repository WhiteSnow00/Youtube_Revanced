import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ancn extends ahbh implements ahcw
{
    public static final ancn a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)ancn.class, (ahbh)(a = new ancn()));
    }
    
    private ancn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ancn.d) == null) {
                    synchronized (ancn.class) {
                        if (ancn.d == null) {
                            ancn.d = (ahdd)new ahba((ahbh)ancn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ancn.a;
            }
            case 4: {
                return new ahaz((ahbh)ancn.a);
            }
            case 3: {
                return new ancn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ancn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
