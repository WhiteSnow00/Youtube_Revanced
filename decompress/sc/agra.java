import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agra extends ahbh implements ahcw
{
    public static final agra a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)agra.class, (ahbh)(a = new agra()));
    }
    
    private agra() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = agra.d) == null) {
                    synchronized (agra.class) {
                        if (agra.d == null) {
                            agra.d = (ahdd)new ahba((ahbh)agra.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agra.a;
            }
            case 4: {
                return new ahaz((ahbh)agra.a);
            }
            case 3: {
                return new agra();
            }
            case 2: {
                return newMessageInfo((MessageLite)agra.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
