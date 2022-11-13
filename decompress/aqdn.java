import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdn extends ahbh implements ahcw
{
    public static final aqdn a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdn.class, (ahbh)(a = new aqdn()));
    }
    
    private aqdn() {
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
                if ((d = aqdn.d) == null) {
                    synchronized (aqdn.class) {
                        if (aqdn.d == null) {
                            aqdn.d = (ahdd)new ahba((ahbh)aqdn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqdn.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdn.a);
            }
            case 3: {
                return new aqdn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
