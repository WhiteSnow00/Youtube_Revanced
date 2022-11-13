import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqza extends ahbh implements ahcw
{
    public static final aqza a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqza.class, (ahbh)(a = new aqza()));
    }
    
    private aqza() {
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
                if ((d = aqza.d) == null) {
                    synchronized (aqza.class) {
                        if (aqza.d == null) {
                            aqza.d = (ahdd)new ahba((ahbh)aqza.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqza.a;
            }
            case 4: {
                return new ahaz((ahbh)aqza.a);
            }
            case 3: {
                return new aqza();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqza.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
