import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktx extends ahbh implements ahcw
{
    public static final aktx a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)aktx.class, (ahbh)(a = new aktx()));
    }
    
    private aktx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aktx.d) == null) {
                    synchronized (aktx.class) {
                        if (aktx.d == null) {
                            aktx.d = (ahdd)new ahba((ahbh)aktx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aktx.a;
            }
            case 4: {
                return new ahaz((ahbh)aktx.a);
            }
            case 3: {
                return new aktx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", anic.m });
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
