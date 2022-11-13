import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahis extends ahbh implements ahcw
{
    public static final ahis a;
    private static volatile ahdd c;
    public boolean b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ahis.class, (ahbh)(a = new ahis()));
    }
    
    private ahis() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ahis.c) == null) {
                    synchronized (ahis.class) {
                        if (ahis.c == null) {
                            ahis.c = (ahdd)new ahba((ahbh)ahis.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahis.a;
            }
            case 4: {
                return new ahaz((ahbh)ahis.a);
            }
            case 3: {
                return new ahis();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahis.a, "\u0001\u0001\u0000\u0001\u0011\u0011\u0001\u0000\u0000\u0000\u0011\u1007\u0006", new Object[] { "d", "b" });
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
