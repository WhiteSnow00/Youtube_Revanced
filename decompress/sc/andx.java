import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andx extends ahbh implements ahcw
{
    public static final andx a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)andx.class, (ahbh)(a = new andx()));
    }
    
    private andx() {
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
                if ((d = andx.d) == null) {
                    synchronized (andx.class) {
                        if (andx.d == null) {
                            andx.d = (ahdd)new ahba((ahbh)andx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return andx.a;
            }
            case 4: {
                return new ahaz((ahbh)andx.a);
            }
            case 3: {
                return new andx();
            }
            case 2: {
                return newMessageInfo((MessageLite)andx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
