import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvn extends ahbh implements ahcw
{
    public static final anvn a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)anvn.class, (ahbh)(a = new anvn()));
    }
    
    private anvn() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = anvn.d) == null) {
                    synchronized (anvn.class) {
                        if (anvn.d == null) {
                            anvn.d = (ahdd)new ahba((ahbh)anvn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anvn.a;
            }
            case 4: {
                return new ahaz((ahbh)anvn.a);
            }
            case 3: {
                return new anvn();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
