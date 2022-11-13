import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkj extends ahbh implements ahcw
{
    public static final ahkj a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)ahkj.class, (ahbh)(a = new ahkj()));
    }
    
    private ahkj() {
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
                if ((d = ahkj.d) == null) {
                    synchronized (ahkj.class) {
                        if (ahkj.d == null) {
                            ahkj.d = (ahdd)new ahba((ahbh)ahkj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahkj.a;
            }
            case 4: {
                return new ahaz((ahbh)ahkj.a);
            }
            case 3: {
                return new ahkj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
