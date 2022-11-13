import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqce extends ahbh implements ahcw
{
    public static final aqce a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)aqce.class, (ahbh)(a = new aqce()));
    }
    
    private aqce() {
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
                if ((d = aqce.d) == null) {
                    synchronized (aqce.class) {
                        if (aqce.d == null) {
                            aqce.d = (ahdd)new ahba((ahbh)aqce.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqce.a;
            }
            case 4: {
                return new ahaz((ahbh)aqce.a);
            }
            case 3: {
                return new aqce();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqce.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
